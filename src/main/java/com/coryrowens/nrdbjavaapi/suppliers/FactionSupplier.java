package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.enums.Faction;
import java.util.List;

public interface FactionSupplier {

	public Faction faction(String factioncode);
	
	public List<Faction> factions();
}
