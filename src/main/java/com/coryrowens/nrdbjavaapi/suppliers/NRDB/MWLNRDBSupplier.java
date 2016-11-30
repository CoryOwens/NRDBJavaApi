package com.coryrowens.nrdbjavaapi.suppliers.NRDB;

import com.coryrowens.nrdbjavaapi.schema.processed.MWL;
import com.coryrowens.nrdbjavaapi.schema.raw.MWLRaw;
import com.coryrowens.nrdbjavaapi.suppliers.CardSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.MWLSupplier;
import com.coryrowens.nrdbjavaapi.webhooks.raw.MWLRawWebHook;
import java.util.List;
import java.util.stream.Collectors;

public class MWLNRDBSupplier implements MWLSupplier{

	private final MWLRawWebHook hook;
	private final CardSupplier supplier;
	
	public MWLNRDBSupplier(MWLRawWebHook hook, CardSupplier supplier){
		this.hook = hook;
		this.supplier = supplier;
	}
	
	@Override
	public List<MWL> mwl() {
		List<MWLRaw> raw = hook.mwl();
		return raw.stream()
				.map(r -> new MWL(r, supplier))
				.collect(Collectors.toList());
	}

}
