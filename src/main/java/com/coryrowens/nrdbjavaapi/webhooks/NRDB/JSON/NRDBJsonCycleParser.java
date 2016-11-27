package com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON;

import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

public class NRDBJsonCycleParser {

	public static CycleRaw toCycle(JSONObject jsonCycle){
		CycleRaw ret = new CycleRaw();
		try{
			if(jsonCycle.has("code") && jsonCycle.get("code") != JSONObject.NULL) ret.code = (String) jsonCycle.get("code");
			if(jsonCycle.has("name") && jsonCycle.get("name") != JSONObject.NULL) ret.name = (String) jsonCycle.get("name");
			if(jsonCycle.has("position") && jsonCycle.get("position") != JSONObject.NULL) ret.position = (int) jsonCycle.get("position");
			if(jsonCycle.has("size") && jsonCycle.get("size") != JSONObject.NULL) ret.size = (int) jsonCycle.get("size");
		} catch (JSONException ex) {
			String message = "Error parsing JSON cycle.";
			Logger.getLogger(NRDBJsonCycleParser.class.getName()).log(Level.SEVERE, message, ex);
			throw new UncheckedJSONException(message, ex);
		}
		return ret;
	}
	
	public static List<CycleRaw> toCycles(JSONArray jsonCycles){
		try {
			List<CycleRaw> ret = new ArrayList<>();
			for (int i = 0; i < jsonCycles.length(); i++){
				JSONObject cardData = (JSONObject) jsonCycles.get(i);
				ret.add(toCycle(cardData));
			}
			return ret;
		} catch (JSONException ex) {
			String message = "Error parsing JSON cycle.";
			Logger.getLogger(NRDBJsonCardParser.class.getName()).log(Level.SEVERE, message, ex);
			throw new UncheckedJSONException(message, ex);
		}
	}
}
