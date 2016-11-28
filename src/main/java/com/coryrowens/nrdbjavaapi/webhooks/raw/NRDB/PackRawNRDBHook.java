package com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;
import com.coryrowens.nrdbjavaapi.webhooks.raw.PackRawWebHook;

public class PackRawNRDBHook extends AbstractRawNRDBHook implements PackRawWebHook{

	/* <editor-fold desc="Constructors"> */
	public PackRawNRDBHook() {
		super();
	}
	
	public PackRawNRDBHook(String target){
		super(target);
	}
	
	public PackRawNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public PackRawNRDBHook(HttpClient client, HttpHost host) {
		super(client, host);
	}
	/* </editor-fold> */
	
	@Override
	public PackRaw pack(String packCode) {
		String method = "GET";
		String endpoint = "/api/2.0/public/pack/" + packCode;
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<PackRaw> parser = new EasyNRDBJsonParser<>();
		List<PackRaw> packs = parser.get(data, PackRaw.class);
		return packs.get(0);
	}

	@Override
	public List<PackRaw> packs() {
		String method = "GET";
		String endpoint = "/api/2.0/public/packs";
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<PackRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, PackRaw.class);
	}

	/* Main method used for manual testing. */
//	public static void main(String[] args){
//		PackRawNRDBHook h = new PackRawNRDBHook();
//		PackRaw p = h.pack("core");
//		List<PackRaw> ps = h.packs();
//	}
}
