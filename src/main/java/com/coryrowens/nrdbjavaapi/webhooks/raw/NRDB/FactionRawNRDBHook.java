package com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB;
import com.coryrowens.nrdbjavaapi.schema.raw.FactionRaw;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONObject;
import com.coryrowens.nrdbjavaapi.webhooks.raw.FactionRawWebHook;

public class FactionRawNRDBHook extends AbstractRawNRDBHook implements FactionRawWebHook{

	/* <editor-fold desc="Constructors"> */
	public FactionRawNRDBHook() {
		super();
	}
	
	public FactionRawNRDBHook(String target){
		super(target);
	}
	
	public FactionRawNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public FactionRawNRDBHook(HttpClient client, HttpHost host) {
		super(client, host);
	}
	/* </editor-fold> */
	
	@Override
	public FactionRaw faction(String factionCode) {
		String method = "GET";
		String endpoint = "/api/2.0/public/faction/" + factionCode;
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<FactionRaw> parser = new EasyNRDBJsonParser<>();
		List<FactionRaw> factions = parser.get(data, FactionRaw.class);
		return factions.get(0);
	}

	@Override
	public List<FactionRaw> factions() {
		String method = "GET";
		String endpoint = "/api/2.0/public/factions";
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<FactionRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, FactionRaw.class);
	}

	/* Main method used for manual testing */
//	public static void main(String[] args){
//		FactionRawNRDBHook h = new FactionRawNRDBHook();
//		FactionRaw f = h.faction("anarch");
//		List<FactionRaw> fs = h.factions();
//	}
	
}
