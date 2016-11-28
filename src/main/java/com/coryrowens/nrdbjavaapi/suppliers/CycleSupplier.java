package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.processed.Cycle;
import java.util.List;

public interface CycleSupplier {
	
	public Cycle cycle(String cycleCode);
	
	public List<Cycle> cycles();
}
