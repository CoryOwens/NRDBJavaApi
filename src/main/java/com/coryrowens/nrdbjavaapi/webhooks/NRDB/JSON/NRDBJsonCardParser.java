package com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

public class NRDBJsonCardParser {
	public static CardRaw toCard(JSONObject jsonCard) {
		CardRaw ret = new CardRaw();
		try{
			if(jsonCard.has("advancement_cost") && jsonCard.get("advancement_cost") != JSONObject.NULL) ret.advancementCost = (Integer) jsonCard.get("advancement_cost");
			if(jsonCard.has("agenda_points") && jsonCard.get("agenda_points") != JSONObject.NULL) ret.agendaPoints = (Integer) jsonCard.get("agenda_points");
			if(jsonCard.has("base_link") && jsonCard.get("base_link") != JSONObject.NULL) ret.baseLink = (Integer) jsonCard.get("base_link");
			if(jsonCard.has("code") && jsonCard.get("code") != JSONObject.NULL) ret.code = (String) jsonCard.get("code");
			if(jsonCard.has("cost") && jsonCard.get("cost") != JSONObject.NULL) ret.cost = (Integer) jsonCard.get("cost");
			if(jsonCard.has("deck_limit") && jsonCard.get("deck_limit") != JSONObject.NULL) ret.deckLimit = (int) jsonCard.get("deck_limit");
			if(jsonCard.has("faction_code") && jsonCard.get("faction_code") != JSONObject.NULL) ret.factionCode = (String) jsonCard.get("faction_code");
			if(jsonCard.has("faction_cost") && jsonCard.get("faction_cost") != JSONObject.NULL) ret.factionCost = (Integer) jsonCard.get("faction_cost");
			if(jsonCard.has("flavor") && jsonCard.get("flavor") != JSONObject.NULL) ret.flavor = (String) jsonCard.get("flavor");
			if(jsonCard.has("illustrator") && jsonCard.get("illustrator") != JSONObject.NULL) ret.illustrator = (String) jsonCard.get("illustrator");
			if(jsonCard.has("influence_limit") && jsonCard.get("influence_limit") != JSONObject.NULL) ret.influenceLimit = (Integer) jsonCard.get("influence_limit");
			if(jsonCard.has("keywords") && jsonCard.get("keywords") != JSONObject.NULL) ret.keywords = (String) jsonCard.get("keywords");
			if(jsonCard.has("memory_cost") && jsonCard.get("memory_cost") != JSONObject.NULL) ret.memoryCost = (Integer) jsonCard.get("memory_cost");
			if(jsonCard.has("minimum_deck_size") && jsonCard.get("minimum_deck_size") != JSONObject.NULL) ret.minimumDeckSize = (Integer) jsonCard.get("minimum_deck_size");
			if(jsonCard.has("pack_code") && jsonCard.get("pack_code") != JSONObject.NULL) ret.packCode = (String) jsonCard.get("pack_code");
			if(jsonCard.has("position") && jsonCard.get("position") != JSONObject.NULL) ret.position = (int) jsonCard.get("position");
			if(jsonCard.has("quantity") && jsonCard.get("quantity") != JSONObject.NULL) ret.quantity = (int) jsonCard.get("quantity");
			if(jsonCard.has("side_code") && jsonCard.get("side_code") != JSONObject.NULL) ret.sideCode = (String) jsonCard.get("side_code");
			if(jsonCard.has("strength") && jsonCard.get("strength") != JSONObject.NULL) ret.strength = (Integer) jsonCard.get("strength");
			if(jsonCard.has("text") && jsonCard.get("text") != JSONObject.NULL) ret.text = (String) jsonCard.get("text");
			if(jsonCard.has("title") && jsonCard.get("title") != JSONObject.NULL) ret.title = (String) jsonCard.get("title");
			if(jsonCard.has("trash_cost") && jsonCard.get("trash_cost") != JSONObject.NULL) ret.trashCost = (Integer) jsonCard.get("trash_cost");
			if(jsonCard.has("type_code") && jsonCard.get("type_code") != JSONObject.NULL) ret.typeCode = (String) jsonCard.get("type_code");
			if(jsonCard.has("uniqueness") && jsonCard.get("uniqueness") != JSONObject.NULL) ret.uniqueness = (boolean) jsonCard.get("uniqueness");
		}catch (JSONException ex){
			String message = "Error parsing JSON card.";
			Logger.getLogger(NRDBJsonCardParser.class.getName()).log(Level.SEVERE, message, ex);
			throw new UncheckedJSONException(message, ex);
		}
		return ret;
	}
	
	public static List<CardRaw> toCards(JSONArray jsonCards){
		try {
			List<CardRaw> ret = new ArrayList<>();
			for (int i = 0; i < jsonCards.length(); i++){
				JSONObject cardData = (JSONObject) jsonCards.get(i);
				ret.add(toCard(cardData));
			}
			return ret;
		} catch (JSONException ex) {
			String message = "Error parsing JSON card.";
			Logger.getLogger(NRDBJsonCardParser.class.getName()).log(Level.SEVERE, message, ex);
			throw new UncheckedJSONException(message, ex);
		}
	}
}
