package com.coryrowens.nrdbjavaapi.webhooks.raw;

import com.coryrowens.nrdbjavaapi.schema.raw.FactionRaw;
import java.util.List;

public interface FactionRawWebHook {

	public FactionRaw faction(String factionCode);

	public List<FactionRaw> factions();

}
