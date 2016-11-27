package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.Objects;

public class FactionRaw {

	public String code;
	public String color;
	public Boolean isMini;
	public String name;
	public String sideCode;

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
		final FactionRaw other = (FactionRaw) obj;
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		if (!Objects.equals(this.color, other.color)) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (!Objects.equals(this.sideCode, other.sideCode)) {
			return false;
		}
		if (!Objects.equals(this.isMini, other.isMini)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 53 * hash + Objects.hashCode(this.code);
		hash = 53 * hash + Objects.hashCode(this.color);
		hash = 53 * hash + Objects.hashCode(this.isMini);
		hash = 53 * hash + Objects.hashCode(this.name);
		hash = 53 * hash + Objects.hashCode(this.sideCode);
		return hash;
	}

}
