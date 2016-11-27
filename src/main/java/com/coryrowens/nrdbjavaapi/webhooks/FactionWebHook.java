package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.FactionRaw;
import java.util.List;

public interface FactionWebHook {

	public FactionRaw faction(String factionCode);

	public List<FactionRaw> factions();

}
