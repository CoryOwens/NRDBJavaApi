package com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;
import com.coryrowens.nrdbjavaapi.webhooks.raw.TypeRawWebHook;

public class TypeRawNRDBHook extends AbstractRawNRDBHook implements TypeRawWebHook {

	/* <editor-fold desc="Constructors"> */
	public TypeRawNRDBHook() {
		super();
	}
	
	public TypeRawNRDBHook(String target){
		super(target);
	}
	
	public TypeRawNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public TypeRawNRDBHook(HttpClient client, HttpHost host) {
		super(client, host);
	}
	/* </editor-fold> */
	
	@Override
	public TypeRaw type(String typeCode) {
		String method = "GET";
		String endpoint = "/api/2.0/public/type/" + typeCode;
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<TypeRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, TypeRaw.class).get(0);
	}

	@Override
	public List<TypeRaw> types() {
		String method = "GET";
		String endpoint = "/api/2.0/public/types";
		JSONArray data = getData(method, endpoint);
		EasyNRDBJsonParser<TypeRaw> parser = new EasyNRDBJsonParser<>();
		return parser.get(data, TypeRaw.class);
	}

	
	public static void main(String[] args){
		TypeRawNRDBHook h = new TypeRawNRDBHook();
		TypeRaw t = h.type("agenda");
		List<TypeRaw> ts = h.types();
	}
}
