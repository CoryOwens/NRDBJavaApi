package com.coryrowens.nrdbjavaapi.schema.processed;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.coryrowens.nrdbjavaapi.schema.raw.DecklistRaw;
import com.coryrowens.nrdbjavaapi.suppliers.CardSupplier;
import com.coryrowens.nrdbjavaapi.util.Dates;
import java.util.Objects;

public class Decklist {

	public final Map<Card, Integer> cards; // Maps Card to count
	public final Date dateCreation;
	public final Date dateUpdate;
	public final String description;
	public final int id;
	public final String name;
	public final boolean tournamentBadge;
	public final int userId;
	public final String userName;

	public Decklist(DecklistRaw raw, CardSupplier cardSupplier) {
		if (raw == null) {
			throw new IllegalArgumentException("Null DeckRaw");
		}
		if (cardSupplier == null) {
			throw new IllegalArgumentException("Null CardSupplier");
		}
		this.id = raw.id;
		this.dateCreation = Dates.fromString(raw.dateCreation);
		this.dateUpdate = Dates.fromString(raw.dateUpdate);
		this.name = raw.name;
		this.description = raw.description;
		this.userId = raw.userId;
		this.userName = raw.userName;
		this.tournamentBadge = raw.tournamentBadge;
		Map<Card, Integer> cards = new HashMap<>();
		for (String cardCode : raw.cards.keySet()) {
			Card card = cardSupplier.card(cardCode);
			Integer count = raw.cards.get(cardCode);
			cards.put(card, count);
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
		final Decklist other = (Decklist) obj;
		if (this.id != other.id) {
			return false;
		}
		if (this.userId != other.userId) {
			return false;
		}
		if (this.tournamentBadge != other.tournamentBadge) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (!Objects.equals(this.description, other.description)) {
			return false;
		}
		if (!Objects.equals(this.userName, other.userName)) {
			return false;
		}
		if (!Objects.equals(this.dateCreation, other.dateCreation)) {
			return false;
		}
		if (!Objects.equals(this.dateUpdate, other.dateUpdate)) {
			return false;
		}
		if (!Objects.equals(this.cards, other.cards)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 13 * hash + this.id;
		hash = 13 * hash + Objects.hashCode(this.dateCreation);
		hash = 13 * hash + Objects.hashCode(this.dateUpdate);
		hash = 13 * hash + Objects.hashCode(this.name);
		hash = 13 * hash + Objects.hashCode(this.description);
		hash = 13 * hash + this.userId;
		hash = 13 * hash + Objects.hashCode(this.userName);
		hash = 13 * hash + (this.tournamentBadge ? 1 : 0);
		hash = 13 * hash + Objects.hashCode(this.cards);
		return hash;
	}

}
