package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.webhooks.CardWebHook;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.util.NRDBJsonCardParser;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.util.UncheckedJSONException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHttpRequest;
import org.apache.commons.io.IOUtils;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

public class CardNRDBHook implements CardWebHook {

	private final HttpClient client;
	private final HttpHost host;
	
	/* <editor-fold desc="Constructors"> */
	public CardNRDBHook() {
		this("netrunnerdb.com");
	}

	public CardNRDBHook(String target) {
		this(HttpClientBuilder.create().build(), target);
	}

	public CardNRDBHook(HttpClient client, String target) {
		this(client, new HttpHost(target));
	}
	
	public CardNRDBHook(HttpClient client, HttpHost host) {
		this.client = client;
		this.host = host;
	}
	/* </editor-fold> */

	@Override
	public CardRaw card(String cardCode) {
		try {
			HttpRequest request = new BasicHttpRequest("GET","/api/2.0/public/card/" + cardCode);
			HttpResponse response = client.execute(host, request);
			InputStream content = response.getEntity().getContent();
			StringWriter writer = new StringWriter();
			IOUtils.copy(content, writer, StandardCharsets.UTF_8);
			JSONObject json = new JSONObject(writer.toString());
			JSONArray data = (JSONArray) json.get("data");
			JSONObject cardData = (JSONObject) data.get(0);
			return NRDBJsonCardParser.toCard(cardData);
		} catch (IOException ex) {
			Logger.getLogger(CardNRDBHook.class.getName()).log(Level.SEVERE, null, ex);
			throw new UncheckedIOException("Failed to get a response from server.", ex);
		} catch (JSONException | ClassCastException ex) {
			Logger.getLogger(CardNRDBHook.class.getName()).log(Level.SEVERE, null, ex);
			throw new UncheckedJSONException("Error parsing JSON response.", ex);
		}
	}
	

	@Override
	public Collection<CardRaw> cards() {
		try {
			HttpRequest request = new BasicHttpRequest("GET","/api/2.0/public/cards");
			HttpResponse response = client.execute(host, request);
			InputStream content = response.getEntity().getContent();
			StringWriter writer = new StringWriter();
			IOUtils.copy(content, writer, StandardCharsets.UTF_8);
			JSONObject json = new JSONObject(writer.toString());
			JSONArray data = (JSONArray) json.get("data");
			Collection<CardRaw> ret = new ArrayList<>();
			for (int i = 0; i < data.length(); i++){
				JSONObject cardData = (JSONObject) data.get(i);
				ret.add(NRDBJsonCardParser.toCard(cardData));
			}
			return ret;
		} catch (IOException ex) {
			Logger.getLogger(CardNRDBHook.class.getName()).log(Level.SEVERE, null, ex);
			throw new UncheckedIOException("Failed to get a response from server.", ex);
		} catch (JSONException | ClassCastException ex) {
			Logger.getLogger(CardNRDBHook.class.getName()).log(Level.SEVERE, null, ex);
			throw new UncheckedJSONException("Error parsing JSON response.", ex);
		}
	}

	public static void main(String[] args) {
		CardNRDBHook h = new CardNRDBHook();
		Collection<CardRaw> c = h.cards();
	}
}
