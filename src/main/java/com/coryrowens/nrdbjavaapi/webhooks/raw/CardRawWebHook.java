package com.coryrowens.nrdbjavaapi.webhooks.raw;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import java.util.List;

public interface CardRawWebHook {

	public CardRaw card(String cardCode);

	public List<CardRaw> cards();
}
