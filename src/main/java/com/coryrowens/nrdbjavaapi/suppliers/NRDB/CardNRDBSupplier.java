package com.coryrowens.nrdbjavaapi.suppliers.NRDB;

import com.coryrowens.nrdbjavaapi.schema.processed.Card;
import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.suppliers.CardSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.PackSupplier;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB.CardRawNRDBHook;
import java.util.List;
import java.util.stream.Collectors;

public class CardNRDBSupplier implements CardSupplier{

	private final CardRawNRDBHook hook;
	private final PackSupplier supplier;
	public CardNRDBSupplier(CardRawNRDBHook hook, PackSupplier supplier){
		this.hook = hook;
		this.supplier = supplier;
	}
	
	@Override
	public Card card(String cardCode) {
		return new Card(hook.card(cardCode), supplier);
	}

	@Override
	public List<Card> cards() {
		List<CardRaw> raw = hook.cards();
		return raw.stream()
				.map(r -> new Card(r, supplier))
				.collect(Collectors.toList());
	}

}
