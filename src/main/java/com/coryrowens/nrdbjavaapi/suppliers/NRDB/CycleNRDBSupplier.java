package com.coryrowens.nrdbjavaapi.suppliers.NRDB;

import com.coryrowens.nrdbjavaapi.schema.processed.Cycle;
import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import com.coryrowens.nrdbjavaapi.suppliers.CycleSupplier;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.CycleRawNRDBHook;
import java.util.List;
import java.util.stream.Collectors;

public class CycleNRDBSupplier implements CycleSupplier{

	private final CycleRawNRDBHook hook;
	
	public CycleNRDBSupplier(CycleRawNRDBHook hook){
		this.hook = hook;
	}
	
	@Override
	public Cycle cycle(String cycleCode) {
		return new Cycle(hook.cycle(cycleCode));
	}

	@Override
	public List<Cycle> cycles() {
		List<CycleRaw> raw = hook.cycles();
		return raw.stream()
				.map(Cycle::new)
				.collect(Collectors.toList());
	}

}
