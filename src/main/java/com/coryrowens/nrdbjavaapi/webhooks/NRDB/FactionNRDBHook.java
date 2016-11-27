package com.coryrowens.nrdbjavaapi.webhooks.NRDB;
import com.coryrowens.nrdbjavaapi.schema.raw.FactionRaw;
import com.coryrowens.nrdbjavaapi.webhooks.FactionWebHook;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONObject;

public class FactionNRDBHook extends AbstractNRDBHook implements FactionWebHook{

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
//		FactionNRDBHook h = new FactionNRDBHook();
//		FactionRaw f = h.faction("anarch");
//		List<FactionRaw> fs = h.factions();
//	}
	
}
