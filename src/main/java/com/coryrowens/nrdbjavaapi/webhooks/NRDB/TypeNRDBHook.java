package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.EasyNRDBJsonParser;
import com.coryrowens.nrdbjavaapi.webhooks.TypeWebHook;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.sling.commons.json.JSONArray;

public class TypeNRDBHook extends AbstractNRDBHook implements TypeWebHook {

	/* <editor-fold desc="Constructors"> */
	public TypeNRDBHook() {
		super();
	}
	
	public TypeNRDBHook(String target){
		super(target);
	}
	
	public TypeNRDBHook(HttpClient client, String target) {
		super(client, target);
	}
	
	public TypeNRDBHook(HttpClient client, HttpHost host) {
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
		TypeNRDBHook h = new TypeNRDBHook();
		TypeRaw t = h.type("agenda");
		List<TypeRaw> ts = h.types();
	}
}
