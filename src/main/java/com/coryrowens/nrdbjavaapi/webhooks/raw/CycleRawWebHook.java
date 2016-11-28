package com.coryrowens.nrdbjavaapi.webhooks.raw;

import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import java.util.List;

public interface CycleRawWebHook {
	
	
	public CycleRaw cycle(String cycleCode);

	public List<CycleRaw> cycles();
}
