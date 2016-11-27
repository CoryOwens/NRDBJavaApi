package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import java.util.List;

public interface CycleWebHook {
	
	
	public CycleRaw cycle(String cycleCode);

	public List<CycleRaw> cycles();
}
