package com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;
import com.coryrowens.nrdbjavaapi.webhooks.raw.CycleRawWebHook;

public class CycleRawNRDBHook extends AbstractRawNRDBHook implements CycleRawWebHook{

	/* <editor-fold desc="Constructors"> */
	public CycleRawNRDBHook() {
		super();
	}
	
	public CycleRawNRDBHook(String target){
		super(target);
	}
	
	public CycleRawNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public CycleRawNRDBHook(HttpClient client, HttpHost host) {
		super(client, host);
	}
	/* </editor-fold> */
	
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
//		CycleRawNRDBHook h = new CycleRawNRDBHook();
//		CycleRaw c = h.cycle("core");
//		List<CycleRaw> cs = h.cycles();
//	}
}
