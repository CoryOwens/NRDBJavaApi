package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import java.util.Collection;

public interface CycleWebHook {
	
	
	public CycleRaw cycle(String cycleCode);

	public Collection<CycleRaw> cycles();
}
