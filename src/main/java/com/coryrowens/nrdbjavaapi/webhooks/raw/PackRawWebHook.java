package com.coryrowens.nrdbjavaapi.webhooks.raw;

import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import java.util.List;

public interface PackRawWebHook {

	public PackRaw pack(String packCode);

	public List<PackRaw> packs();
}
