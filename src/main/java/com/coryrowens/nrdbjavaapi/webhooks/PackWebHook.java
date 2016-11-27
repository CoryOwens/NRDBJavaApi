package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import java.util.List;

public interface PackWebHook {

	public PackRaw pack(String packCode);

	public List<PackRaw> packs();
}
