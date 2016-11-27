package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.processed.Cycle;

public interface CycleSupplier {
	
	public Cycle fromCode(String cycleCode);
}
