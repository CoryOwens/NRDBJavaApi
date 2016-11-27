package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.FactionRaw;
import java.util.Collection;

public interface FactionWebHook {

	public FactionRaw faction(String factionCode);

	public Collection<FactionRaw> factions();

}
