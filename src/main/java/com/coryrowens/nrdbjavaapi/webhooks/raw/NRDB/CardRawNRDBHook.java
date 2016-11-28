package com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;
import com.coryrowens.nrdbjavaapi.webhooks.raw.CardRawWebHook;

public class CardRawNRDBHook extends AbstractRawNRDBHook implements CardRawWebHook {

	
	/* <editor-fold desc="Constructors"> */
	public CardRawNRDBHook() {
		super();
	}

	public CardRawNRDBHook(String target) {
		super(target);
	}
	
	public CardRawNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public CardRawNRDBHook(HttpClient client, HttpHost host) {
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
//		CardRawNRDBHook h = new CardRawNRDBHook();
//		CardRaw c = h.card("00005");
//		List<CardRaw> cs = h.cards();
//	}
}
