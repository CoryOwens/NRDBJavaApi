package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.Objects;

public class CardRaw {

	public Integer advancementCost;
	public Integer agendaPoints;
	public Integer baseLink;
	public String code;
	public Integer cost;
	public int deckLimit;
	public String factionCode;
	public Integer factionCost;
	public String flavor;
	public String illustrator;
	public Integer influenceLimit;
	public String keywords;
	public Integer memoryCost;
	public Integer minimumDeckSize;
	public String packCode;
	public int position;
	public int quantity;
	public String sideCode;
	public Integer strength;
	public String text;
	public String title;
	public Integer trashCost;
	public String typeCode;
	public boolean uniqueness;

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
		final CardRaw other = (CardRaw) obj;
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
		if (!Objects.equals(this.factionCode, other.factionCode)) {
			return false;
		}
		if (!Objects.equals(this.flavor, other.flavor)) {
			return false;
		}
		if (!Objects.equals(this.illustrator, other.illustrator)) {
			return false;
		}
		if (!Objects.equals(this.keywords, other.keywords)) {
			return false;
		}
		if (!Objects.equals(this.packCode, other.packCode)) {
			return false;
		}
		if (!Objects.equals(this.sideCode, other.sideCode)) {
			return false;
		}
		if (!Objects.equals(this.text, other.text)) {
			return false;
		}
		if (!Objects.equals(this.title, other.title)) {
			return false;
		}
		if (!Objects.equals(this.typeCode, other.typeCode)) {
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
		if (!Objects.equals(this.influenceLimit, other.influenceLimit)) {
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
		int hash = 5;
		hash = 71 * hash + Objects.hashCode(this.advancementCost);
		hash = 71 * hash + Objects.hashCode(this.agendaPoints);
		hash = 71 * hash + Objects.hashCode(this.baseLink);
		hash = 71 * hash + Objects.hashCode(this.code);
		hash = 71 * hash + Objects.hashCode(this.cost);
		hash = 71 * hash + this.deckLimit;
		hash = 71 * hash + Objects.hashCode(this.factionCode);
		hash = 71 * hash + Objects.hashCode(this.factionCost);
		hash = 71 * hash + Objects.hashCode(this.flavor);
		hash = 71 * hash + Objects.hashCode(this.illustrator);
		hash = 71 * hash + Objects.hashCode(this.influenceLimit);
		hash = 71 * hash + Objects.hashCode(this.keywords);
		hash = 71 * hash + Objects.hashCode(this.memoryCost);
		hash = 71 * hash + Objects.hashCode(this.minimumDeckSize);
		hash = 71 * hash + Objects.hashCode(this.packCode);
		hash = 71 * hash + this.position;
		hash = 71 * hash + this.quantity;
		hash = 71 * hash + Objects.hashCode(this.sideCode);
		hash = 71 * hash + Objects.hashCode(this.strength);
		hash = 71 * hash + Objects.hashCode(this.text);
		hash = 71 * hash + Objects.hashCode(this.title);
		hash = 71 * hash + Objects.hashCode(this.trashCost);
		hash = 71 * hash + Objects.hashCode(this.typeCode);
		hash = 71 * hash + (this.uniqueness ? 1 : 0);
		return hash;
	}

}
