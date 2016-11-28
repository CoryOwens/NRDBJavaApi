package com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.MWLRaw;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;
import com.coryrowens.nrdbjavaapi.webhooks.raw.MWLRawWebHook;

public class MWLRawNRDBHook extends AbstractRawNRDBHook implements MWLRawWebHook{

	/* <editor-fold desc="Constructors"> */
	public MWLRawNRDBHook() {
		super();
	}
	
	public MWLRawNRDBHook(String target){
		super(target);
	}
	
	public MWLRawNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public MWLRawNRDBHook(HttpClient client, HttpHost host) {
		super(client, host);
	}
	/* </editor-fold> */
	
	@Override
	public List<MWLRaw> mwl() {
		String method = "GET";
		String endpoint = "/api/2.0/public/mwl";
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<MWLRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, MWLRaw.class);
	}

	/* Main method used for manual testing. */
//	public static void main(String[] args){
//		MWLRawNRDBHook h = new MWLRawNRDBHook();
//		List<MWLRaw> m = h.mwl();
//	}
}
