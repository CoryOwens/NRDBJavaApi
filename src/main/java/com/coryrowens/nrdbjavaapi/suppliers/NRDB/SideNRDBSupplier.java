package com.coryrowens.nrdbjavaapi.suppliers.NRDB;

import com.coryrowens.nrdbjavaapi.schema.enums.Side;
import com.coryrowens.nrdbjavaapi.suppliers.SideSupplier;
import com.google.common.collect.Lists;
import java.util.List;

public class SideNRDBSupplier implements SideSupplier {

	@Override
	public Side side(String sideCode) {
		return Side.fromCode(sideCode);
	}

	@Override
	public List<Side> sides() {
		return Lists.newArrayList(Side.values());
	}

	
}
