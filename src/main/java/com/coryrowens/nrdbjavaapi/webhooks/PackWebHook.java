package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import java.util.Collection;

public interface PackWebHook {

	public PackRaw pack(String packCode);

	public Collection<PackRaw> packs();
}
