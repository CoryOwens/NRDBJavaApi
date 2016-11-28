package com.coryrowens.nrdbjavaapi.webhooks.raw;

import java.util.Date;
import com.coryrowens.nrdbjavaapi.schema.raw.DecklistRaw;
import java.util.List;

public interface DecklistRawWebHook {

	public DecklistRaw decklist(int id);

	public List<DecklistRaw> decklists(Date date);
}
