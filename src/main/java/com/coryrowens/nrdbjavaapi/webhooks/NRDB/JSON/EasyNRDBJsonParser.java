package com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

public class EasyNRDBJsonParser<T> {
	
	public T get(JSONObject json, Class<T> type){
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
			return mapper.readValue(json.toString(), type);
		} catch (IOException ex) {
			String message = "Error parsing JSON decklist";
			Logger.getLogger(EasyNRDBJsonParser.class.getName()).log(Level.SEVERE, message, ex);
			throw new UncheckedJSONException(message, ex);
		}
	}
	
	public List<T> get(JSONArray json, Class<T> type){
		try {
			List<T> ret = new ArrayList<>();
			for (int i = 0; i < json.length(); i++){
				JSONObject cardData = (JSONObject) json.get(i);
				ret.add(get(cardData, type));
			}
			return ret;
		} catch (JSONException ex) {
			String message = "Error parsing JSON.";
			Logger.getLogger(EasyNRDBJsonParser.class.getName()).log(Level.SEVERE, message, ex);
			throw new UncheckedJSONException(message, ex);
		}
	}
}
