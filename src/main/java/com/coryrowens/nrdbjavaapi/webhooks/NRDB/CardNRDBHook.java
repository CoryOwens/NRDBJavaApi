package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.webhooks.CardWebHook;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.NRDBJsonCardParser;
import java.util.List;
import org.apache.sling.commons.json.JSONArray;

public class CardNRDBHook extends AbstractNRDBHook implements CardWebHook {

	@Override
	public CardRaw card(String cardCode) {
		String method = "GET";
		String endpoint = "/api/2.0/public/card/" + cardCode;
		JSONArray data = getData(method, endpoint);
		List<CardRaw> cards = NRDBJsonCardParser.toCards(data);
		return cards.get(0);
	}
	
	@Override
	public List<CardRaw> cards() {
		String method = "GET";
		String endpoint = "/api/2.0/public/cards";
		JSONArray data = getData(method, endpoint);
		return NRDBJsonCardParser.toCards(data);
	}
	
}
