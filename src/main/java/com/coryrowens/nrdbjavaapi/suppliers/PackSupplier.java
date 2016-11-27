package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.processed.Pack;

public interface PackSupplier {

	public Pack fromCode(String packCode);
}
