package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.enums.Side;
import java.util.List;

public interface SideSupplier {

	public Side side(String sideCode);
	
	public List<Side> sides();
}
