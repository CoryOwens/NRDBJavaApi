package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.SideRaw;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.EasyNRDBJsonParser;
import com.coryrowens.nrdbjavaapi.webhooks.SideWebHook;
import java.util.List;
import org.apache.sling.commons.json.JSONArray;

public class SideNRDBHook extends AbstractNRDBHook implements SideWebHook {

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
