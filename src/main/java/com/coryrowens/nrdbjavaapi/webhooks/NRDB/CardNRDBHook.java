package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.webhooks.CardWebHook;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;

public class CardNRDBHook extends AbstractNRDBHook implements CardWebHook {

	
	/* <editor-fold desc="Constructors"> */
	public CardNRDBHook() {
		super();
	}

	public CardNRDBHook(String target) {
		super(target);
	}
	
	public CardNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public CardNRDBHook(HttpClient client, HttpHost host) {
		super(client, host);
	}
	/* </editor-fold> */

	@Override
	public CardRaw card(String cardCode) {
		String method = "GET";
		String endpoint = "/api/2.0/public/card/" + cardCode;
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<CardRaw> parser = new EasyNRDBJsonParser<>();
		List<CardRaw> cards = parser.get(data, CardRaw.class);
		return cards.get(0);
	}

	@Override
	public List<CardRaw> cards() {
		String method = "GET";
		String endpoint = "/api/2.0/public/cards";
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<CardRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, CardRaw.class);
	}

	/* Main method used for manual testing. */
//	public static void main(String[] args){
//		CardNRDBHook h = new CardNRDBHook();
//		CardRaw c = h.card("00005");
//		List<CardRaw> cs = h.cards();
//	}
}
