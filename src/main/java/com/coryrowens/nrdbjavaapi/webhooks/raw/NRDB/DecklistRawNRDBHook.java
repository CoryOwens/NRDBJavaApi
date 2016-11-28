package com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.DecklistRaw;
import com.coryrowens.nrdbjavaapi.util.Dates;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.JSON.EasyNRDBJsonParser;
import java.util.Date;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;
import com.coryrowens.nrdbjavaapi.webhooks.raw.DecklistRawWebHook;

public class DecklistRawNRDBHook extends AbstractRawNRDBHook implements DecklistRawWebHook{

	
	/* <editor-fold desc="Constructors"> */
	public DecklistRawNRDBHook() {
		super();
	}
	
	public DecklistRawNRDBHook(String target){
		super(target);
	}
	
	public DecklistRawNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public DecklistRawNRDBHook(HttpClient client, HttpHost host) {
		super(client, host);
	}
	/* </editor-fold> */
	
	@Override
	public DecklistRaw decklist(int id) {
		String method = "GET";
		String endpoint = "/api/2.0/public/decklist/" + id;
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<DecklistRaw> parser = new EasyNRDBJsonParser<>();
		List<DecklistRaw> decks = parser.get(data, DecklistRaw.class);
		return decks.get(0);
	}

	@Override
	public List<DecklistRaw> decklists(Date date) {
		String method = "GET";
		String endpoint = "/api/2.0/public/decklists/by_date/" + Dates.asString(date);
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<DecklistRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, DecklistRaw.class);
	}

	/* Main method used for manual testing. */
//	public static void main(String[] args){
//		DecklistRawNRDBHook h = new DecklistRawNRDBHook();
//		DecklistRaw l = h.decklist(1);
//		List<DecklistRaw> ls = h.decklists(Dates.fromString("2016-11-27"));
//	}
}
