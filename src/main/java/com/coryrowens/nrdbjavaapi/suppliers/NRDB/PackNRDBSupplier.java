package com.coryrowens.nrdbjavaapi.suppliers.NRDB;

import com.coryrowens.nrdbjavaapi.schema.processed.Pack;
import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import com.coryrowens.nrdbjavaapi.suppliers.CycleSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.PackSupplier;
import com.coryrowens.nrdbjavaapi.webhooks.raw.PackRawWebHook;
import java.util.List;
import java.util.stream.Collectors;

public class PackNRDBSupplier implements PackSupplier {

	private final PackRawWebHook hook;
	private final CycleSupplier supplier;
	
	public PackNRDBSupplier(PackRawWebHook hook, CycleSupplier supplier){
		this.hook = hook;
		this.supplier = supplier;
	}
	
	@Override
	public Pack pack(String packCode) {
		return new Pack(hook.pack(packCode), supplier);
	}

	@Override
	public List<Pack> packs() {
		List<PackRaw> raw = hook.packs();
		return raw.stream()
				.map(r -> new Pack(r, supplier))
				.collect(Collectors.toList());
	}

}
