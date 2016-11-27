package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON.EasyNRDBJsonParser;
import com.coryrowens.nrdbjavaapi.webhooks.PackWebHook;
import java.util.List;
import org.apache.sling.commons.json.JSONArray;

public class PackNRDBHook extends AbstractNRDBHook implements PackWebHook{

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
//		PackNRDBHook h = new PackNRDBHook();
//		PackRaw p = h.pack("core");
//		List<PackRaw> ps = h.packs();
//	}
}
