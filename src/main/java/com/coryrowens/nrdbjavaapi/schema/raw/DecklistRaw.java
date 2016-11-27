package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.Map;
import java.util.Objects;

public class DecklistRaw {

	public Map<String, Integer> cards; // Maps cardCode to count
	public String dateCreation;
	public String dateUpdate;
	public String description;
	public int id;
	public String name;
	public boolean tournamentBadge;
	public int userId;
	public String userName;

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
		final DecklistRaw other = (DecklistRaw) obj;
		if (this.id != other.id) {
			return false;
		}
		if (this.userId != other.userId) {
			return false;
		}
		if (this.tournamentBadge != other.tournamentBadge) {
			return false;
		}
		if (!Objects.equals(this.dateCreation, other.dateCreation)) {
			return false;
		}
		if (!Objects.equals(this.dateUpdate, other.dateUpdate)) {
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
		if (!Objects.equals(this.cards, other.cards)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 29 * hash + this.id;
		hash = 29 * hash + Objects.hashCode(this.dateCreation);
		hash = 29 * hash + Objects.hashCode(this.dateUpdate);
		hash = 29 * hash + Objects.hashCode(this.name);
		hash = 29 * hash + Objects.hashCode(this.description);
		hash = 29 * hash + this.userId;
		hash = 29 * hash + Objects.hashCode(this.userName);
		hash = 29 * hash + (this.tournamentBadge ? 1 : 0);
		hash = 29 * hash + Objects.hashCode(this.cards);
		return hash;
	}
}
