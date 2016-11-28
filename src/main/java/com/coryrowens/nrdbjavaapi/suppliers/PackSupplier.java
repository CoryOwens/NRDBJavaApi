package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.processed.Pack;
import java.util.List;

public interface PackSupplier {

	public Pack pack(String packCode);
	
	public List<Pack> packs();
}
