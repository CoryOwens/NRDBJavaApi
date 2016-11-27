package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.processed.Card;

public interface CardSupplier {

	public Card fromCode(String cardCode);
}
