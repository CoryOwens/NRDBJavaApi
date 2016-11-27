package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.UncheckedJSONException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHttpRequest;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

public class AbstractNRDBHook {

	protected final HttpClient client;
	protected final HttpHost host;
	
	/* <editor-fold desc="Constructors"> */
	public AbstractNRDBHook() {
		this("netrunnerdb.com");
	}

	public AbstractNRDBHook(String target) {
		this(HttpClientBuilder.create().build(), target);
	}

	public AbstractNRDBHook(HttpClient client, String target) {
		this(client, new HttpHost(target));
	}
	
	public AbstractNRDBHook(HttpClient client, HttpHost host) {
		this.client = client;
		this.host = host;
	}
	
	protected JSONArray getData(String method, String endpoint){
		try {
			HttpRequest request = new BasicHttpRequest(method, endpoint);
			HttpResponse response = client.execute(host, request);
			InputStream content = response.getEntity().getContent();
			StringWriter writer = new StringWriter();
			IOUtils.copy(content, writer, StandardCharsets.UTF_8);
			JSONObject json = new JSONObject(writer.toString());
			JSONArray data = (JSONArray) json.get("data");
			return data;
		} catch (IOException ex) {
			Logger.getLogger(CardNRDBHook.class.getName()).log(Level.SEVERE, null, ex);
			throw new UncheckedIOException("Failed to get a response from server.", ex);
		} catch (JSONException | ClassCastException ex) {
			Logger.getLogger(CardNRDBHook.class.getName()).log(Level.SEVERE, null, ex);
			throw new UncheckedJSONException("Error parsing JSON response.", ex);
		}
	}
}
