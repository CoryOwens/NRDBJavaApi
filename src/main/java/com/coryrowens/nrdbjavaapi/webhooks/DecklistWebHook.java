package com.coryrowens.nrdbjavaapi.webhooks;

import java.util.Date;
import com.coryrowens.nrdbjavaapi.schema.raw.DecklistRaw;
import java.util.Collection;

public interface DecklistWebHook {

	public DecklistRaw decklist(int id);

	public Collection<DecklistRaw> decklists(Date date);
}
