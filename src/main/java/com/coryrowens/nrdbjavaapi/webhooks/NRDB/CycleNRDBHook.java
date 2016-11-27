package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import com.coryrowens.nrdbjavaapi.webhooks.CycleWebHook;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.sling.commons.json.JSONArray;

public class CycleNRDBHook extends AbstractNRDBHook implements CycleWebHook{

	@Override
	public CycleRaw cycle(String cycleCode) {
		String method = "GET";
		String endpoint = "/api/2.0/public/cycle/" + cycleCode;
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<CycleRaw> parser = new EasyNRDBJsonParser<>();
		List<CycleRaw> cycles = parser.get(data, CycleRaw.class);
		return cycles.get(0);
	}

	@Override
	public List<CycleRaw> cycles() {
		String method = "GET";
		String endpoint = "/api/2.0/public/cycles";
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<CycleRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, CycleRaw.class);
	}

	/* Main method used for manual testing. */
//	public static void main(String[] args){
//		CycleNRDBHook h = new CycleNRDBHook();
//		CycleRaw c = h.cycle("core");
//		List<CycleRaw> cs = h.cycles();
//	}
}
