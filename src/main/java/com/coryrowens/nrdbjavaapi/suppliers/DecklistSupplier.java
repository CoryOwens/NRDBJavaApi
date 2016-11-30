package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.processed.Decklist;
import java.util.Date;
import java.util.List;

public interface DecklistSupplier {

	public Decklist decklist(int id);
	
	public List<Decklist> decklists(Date date);
}
