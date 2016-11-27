package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.MWLRaw;
import com.coryrowens.nrdbjavaapi.webhooks.MWLWebHook;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.EasyNRDBJsonParser;
import java.util.List;
import org.apache.sling.commons.json.JSONArray;

public class MWLNRDBHook extends AbstractNRDBHook implements MWLWebHook{

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
//		MWLNRDBHook h = new MWLNRDBHook();
//		List<MWLRaw> m = h.mwl();
//	}
}
