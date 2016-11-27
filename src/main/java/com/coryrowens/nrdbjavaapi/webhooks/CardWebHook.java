package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import java.util.Collection;

public interface CardWebHook {

	public CardRaw card(String cardCode);

	public Collection<CardRaw> cards();
}
