package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import com.coryrowens.nrdbjavaapi.webhooks.CycleWebHook;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.NRDBJsonCardParser;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.NRDBJsonCycleParser;
import java.util.List;
import org.apache.sling.commons.json.JSONArray;

public class CycleNRDBHook extends AbstractNRDBHook implements CycleWebHook{

	@Override
	public CycleRaw cycle(String cycleCode) {
		String method = "GET";
		String endpoint = "/api/2.0/public/cycle/" + cycleCode;
		JSONArray data = getData(method, endpoint);
		List<CycleRaw> cycles = NRDBJsonCycleParser.toCycles(data);
		return cycles.get(0);
	}

	@Override
	public List<CycleRaw> cycles() {
		String method = "GET";
		String endpoint = "/api/2.0/public/cycles";
		JSONArray data = getData(method, endpoint);
		return NRDBJsonCycleParser.toCycles(data);
	}

}
