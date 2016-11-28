package com.coryrowens.nrdbjavaapi.suppliers.NRDB;
import com.coryrowens.nrdbjavaapi.schema.enums.Faction;
import com.coryrowens.nrdbjavaapi.suppliers.FactionSupplier;
import java.util.List;
import com.google.common.collect.Lists;

public class FactionNRDBSupplier implements FactionSupplier{

	
	@Override
	public Faction faction(String factioncode) {
		return Faction.fromCode(factioncode);
	}

	@Override
	public List<Faction> factions() {
		return Lists.newArrayList(Faction.values());
	}
}
