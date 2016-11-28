package com.coryrowens.nrdbjavaapi.schema.processed;

import com.coryrowens.nrdbjavaapi.schema.enums.Faction;
import com.coryrowens.nrdbjavaapi.schema.enums.Side;
import com.coryrowens.nrdbjavaapi.schema.enums.Type;
import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.suppliers.PackSupplier;
import java.util.Objects;

public class Card {

	public final Integer advancementCost;
	public final Integer agendaPoints;
	public final Integer baseLink;
	public final String code;
	public final Integer cost;
	public final int deckLimit;
	public final Faction faction;
	public final Integer factionCost;
	public final String flavor;
	public final String illustrator;
	public final Integer influenceLimit;
	public final String keywords;
	public final Integer memoryCost;
	public final Integer minimumDeckSize;
	public final Pack pack;
	public final int position;
	public final int quantity;
	public final Side side;
	public final Integer strength;
	public final String text;
	public final String title;
	public final Integer trashCost;
	public final Type type;
	public final boolean uniqueness;

	public Card(CardRaw raw, PackSupplier packSupplier) {
		if (raw == null) {
			throw new IllegalArgumentException("Null CardRaw");
		}
		if (packSupplier == null) {
			throw new IllegalArgumentException("Null PackSupplier");
		}
		this.code = raw.code;
		this.deckLimit = raw.deckLimit;
		this.faction = Faction.fromCode(raw.factionCode);
		this.flavor = raw.flavor;
		this.illustrator = raw.illustrator;
		this.influenceLimit = raw.influenceLimit;
		this.pack = packSupplier.pack(raw.packCode);
		this.position = raw.position;
		this.quantity = raw.quantity;
		this.side = Side.fromCode(raw.sideCode);
		this.text = raw.text;
		this.title = raw.title;
		this.type = Type.fromCode(raw.typeCode);
		this.uniqueness = raw.uniqueness;
		this.advancementCost = raw.advancementCost;
		this.agendaPoints = raw.agendaPoints;
		this.baseLink = raw.baseLink;
		this.cost = raw.cost;
		this.factionCost = raw.factionCost;
		this.keywords = raw.keywords;
		this.memoryCost = raw.memoryCost;
		this.minimumDeckSize = raw.minimumDeckSize;
		this.strength = raw.strength;
		this.trashCost = raw.trashCost;
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
		final Card other = (Card) obj;
		if (this.deckLimit != other.deckLimit) {
			return false;
		}
		if (this.position != other.position) {
			return false;
		}
		if (this.quantity != other.quantity) {
			return false;
		}
		if (this.uniqueness != other.uniqueness) {
			return false;
		}
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		if (!Objects.equals(this.flavor, other.flavor)) {
			return false;
		}
		if (!Objects.equals(this.illustrator, other.illustrator)) {
			return false;
		}
		if (!Objects.equals(this.text, other.text)) {
			return false;
		}
		if (!Objects.equals(this.title, other.title)) {
			return false;
		}
		if (!Objects.equals(this.keywords, other.keywords)) {
			return false;
		}
		if (this.faction != other.faction) {
			return false;
		}
		if (!Objects.equals(this.influenceLimit, other.influenceLimit)) {
			return false;
		}
		if (!Objects.equals(this.pack, other.pack)) {
			return false;
		}
		if (this.side != other.side) {
			return false;
		}
		if (this.type != other.type) {
			return false;
		}
		if (!Objects.equals(this.advancementCost, other.advancementCost)) {
			return false;
		}
		if (!Objects.equals(this.agendaPoints, other.agendaPoints)) {
			return false;
		}
		if (!Objects.equals(this.baseLink, other.baseLink)) {
			return false;
		}
		if (!Objects.equals(this.cost, other.cost)) {
			return false;
		}
		if (!Objects.equals(this.factionCost, other.factionCost)) {
			return false;
		}
		if (!Objects.equals(this.memoryCost, other.memoryCost)) {
			return false;
		}
		if (!Objects.equals(this.minimumDeckSize, other.minimumDeckSize)) {
			return false;
		}
		if (!Objects.equals(this.strength, other.strength)) {
			return false;
		}
		if (!Objects.equals(this.trashCost, other.trashCost)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 97 * hash + Objects.hashCode(this.code);
		hash = 97 * hash + this.deckLimit;
		hash = 97 * hash + Objects.hashCode(this.faction);
		hash = 97 * hash + Objects.hashCode(this.flavor);
		hash = 97 * hash + Objects.hashCode(this.illustrator);
		hash = 97 * hash + Objects.hashCode(this.influenceLimit);
		hash = 97 * hash + Objects.hashCode(this.pack);
		hash = 97 * hash + this.position;
		hash = 97 * hash + this.quantity;
		hash = 97 * hash + Objects.hashCode(this.side);
		hash = 97 * hash + Objects.hashCode(this.text);
		hash = 97 * hash + Objects.hashCode(this.title);
		hash = 97 * hash + Objects.hashCode(this.type);
		hash = 97 * hash + (this.uniqueness ? 1 : 0);
		hash = 97 * hash + Objects.hashCode(this.advancementCost);
		hash = 97 * hash + Objects.hashCode(this.agendaPoints);
		hash = 97 * hash + Objects.hashCode(this.baseLink);
		hash = 97 * hash + Objects.hashCode(this.cost);
		hash = 97 * hash + Objects.hashCode(this.factionCost);
		hash = 97 * hash + Objects.hashCode(this.keywords);
		hash = 97 * hash + Objects.hashCode(this.memoryCost);
		hash = 97 * hash + Objects.hashCode(this.minimumDeckSize);
		hash = 97 * hash + Objects.hashCode(this.strength);
		hash = 97 * hash + Objects.hashCode(this.trashCost);
		return hash;
	}

}
