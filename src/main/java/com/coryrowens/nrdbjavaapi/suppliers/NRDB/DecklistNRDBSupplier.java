package com.coryrowens.nrdbjavaapi.suppliers.NRDB;

import com.coryrowens.nrdbjavaapi.schema.processed.Decklist;
import com.coryrowens.nrdbjavaapi.schema.raw.DecklistRaw;
import com.coryrowens.nrdbjavaapi.suppliers.CardSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.DecklistSupplier;
import com.coryrowens.nrdbjavaapi.webhooks.raw.DecklistRawWebHook;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DecklistNRDBSupplier implements DecklistSupplier{
	
	private final DecklistRawWebHook hook;
	private final CardSupplier supplier;
	
	public DecklistNRDBSupplier(DecklistRawWebHook hook, CardSupplier supplier){
		this.hook = hook;
		this.supplier = supplier;
	}

	@Override
	public Decklist decklist(int id) {
		DecklistRaw raw = hook.decklist(id);
		return new Decklist(raw, supplier);
	}

	@Override
	public List<Decklist> decklists(Date date) {
		List<DecklistRaw> raw = hook.decklists(date);
		return raw.stream()
				.map(r -> new Decklist(r, supplier))
				.collect(Collectors.toList());
	}

}
