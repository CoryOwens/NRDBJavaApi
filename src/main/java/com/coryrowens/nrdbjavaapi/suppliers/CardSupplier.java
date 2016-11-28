package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.processed.Card;
import java.util.List;

public interface CardSupplier {

	public Card card(String cardCode);
	
	public List<Card> cards();
}
