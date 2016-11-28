package com.coryrowens.nrdbjavaapi.schema.processed;

import com.coryrowens.nrdbjavaapi.schema.raw.MWLRaw;
import com.coryrowens.nrdbjavaapi.suppliers.CardSupplier;
import com.coryrowens.nrdbjavaapi.util.Dates;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MWL {

	public final boolean active;
	public final Map<Card, Integer> cards; // Maps cardCode to Integer (1 = added)
	public final String code;
	public final Date dateCreation;
	public final Date dateStart;
	public final Date dateUpdate;
	public final int id;
	public final String name;

	public MWL(MWLRaw raw, CardSupplier cardSupplier) {
		this.id = raw.id;
		this.dateCreation = Dates.fromString(raw.dateCreation);
		this.dateUpdate = Dates.fromString(raw.dateUpdate);
		this.code = raw.code;
		this.name = raw.name;
		this.active = raw.active;
		this.dateStart = Dates.fromString(raw.dateStart);
		Map<Card, Integer> cards = new HashMap<>();
		for (String cardCode : raw.cards.keySet()) {
			Card card = cardSupplier.card(cardCode);
			Integer flag = raw.cards.get(cardCode);
			cards.put(card, flag);
		}
		this.cards = Collections.unmodifiableMap(cards);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final MWL other = (MWL) obj;
		if (this.id != other.id) {
			return false;
		}
		if (this.active != other.active) {
			return false;
		}
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (!Objects.equals(this.dateCreation, other.dateCreation)) {
			return false;
		}
		if (!Objects.equals(this.dateUpdate, other.dateUpdate)) {
			return false;
		}
		if (!Objects.equals(this.dateStart, other.dateStart)) {
			return false;
		}
		if (!Objects.equals(this.cards, other.cards)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 97 * hash + this.id;
		hash = 97 * hash + Objects.hashCode(this.dateCreation);
		hash = 97 * hash + Objects.hashCode(this.dateUpdate);
		hash = 97 * hash + Objects.hashCode(this.code);
		hash = 97 * hash + Objects.hashCode(this.name);
		hash = 97 * hash + (this.active ? 1 : 0);
		hash = 97 * hash + Objects.hashCode(this.dateStart);
		hash = 97 * hash + Objects.hashCode(this.cards);
		return hash;
	}

}
