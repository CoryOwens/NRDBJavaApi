package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.SideRaw;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.EasyNRDBJsonParser;
import com.coryrowens.nrdbjavaapi.webhooks.SideWebHook;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;

public class SideNRDBHook extends AbstractNRDBHook implements SideWebHook {

	/* <editor-fold desc="Constructors"> */
	public SideNRDBHook() {
		super();
	}
	
	public SideNRDBHook(String target){
		super(target);
	}
	
	public SideNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public SideNRDBHook(HttpClient client, HttpHost host) {
		super(client, host);
	}
	/* </editor-fold> */
	
	@Override
	public SideRaw side(String sideCode) {
		String method = "GET";
		String endpoint = "/api/2.0/public/side/" + sideCode;
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<SideRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, SideRaw.class).get(0);
	}

	@Override
	public List<SideRaw> sides() {
		String method = "GET";
		String endpoint = "/api/2.0/public/sides";
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<SideRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, SideRaw.class);
	}

	/* Main method used for manual testing. */
//	public static void main(String[] args){
//		SideNRDBHook h = new SideNRDBHook();
//		SideRaw s = h.side("runner");
//		List<SideRaw> ss = h.sides();
//	}
}
