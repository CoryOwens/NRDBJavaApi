package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import java.util.List;

public interface CardWebHook {

	public CardRaw card(String cardCode);

	public List<CardRaw> cards();
}
