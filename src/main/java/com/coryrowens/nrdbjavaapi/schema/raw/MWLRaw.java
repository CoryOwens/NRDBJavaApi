package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.Map;
import java.util.Objects;

public class MWLRaw {

	public boolean active;
	public Map<String, Integer> cards; // Maps cardCode to Integer (1 = added)
	public String code;
	public String dateCreation;
	public String dateStart;
	public String dateUpdate;
	public int id;
	public String name;

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
		final MWLRaw other = (MWLRaw) obj;
		if (this.id != other.id) {
			return false;
		}
		if (this.active != other.active) {
			return false;
		}
		if (!Objects.equals(this.dateCreation, other.dateCreation)) {
			return false;
		}
		if (!Objects.equals(this.dateUpdate, other.dateUpdate)) {
			return false;
		}
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
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
		int hash = 7;
		hash = 31 * hash + this.id;
		hash = 31 * hash + Objects.hashCode(this.dateCreation);
		hash = 31 * hash + Objects.hashCode(this.dateUpdate);
		hash = 31 * hash + Objects.hashCode(this.code);
		hash = 31 * hash + Objects.hashCode(this.name);
		hash = 31 * hash + (this.active ? 1 : 0);
		hash = 31 * hash + Objects.hashCode(this.dateStart);
		hash = 31 * hash + Objects.hashCode(this.cards);
		return hash;
	}
}
