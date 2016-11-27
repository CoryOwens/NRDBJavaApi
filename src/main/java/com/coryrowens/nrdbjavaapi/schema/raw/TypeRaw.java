package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.Objects;

public class TypeRaw {

	public String code;
	public Boolean isSubtype;
	public String name;
	public Integer position;
	public String sideCode;

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 17 * hash + Objects.hashCode(this.code);
		hash = 17 * hash + Objects.hashCode(this.isSubtype);
		hash = 17 * hash + Objects.hashCode(this.name);
		hash = 17 * hash + Objects.hashCode(this.position);
		hash = 17 * hash + Objects.hashCode(this.sideCode);
		return hash;
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
		final TypeRaw other = (TypeRaw) obj;
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (!Objects.equals(this.sideCode, other.sideCode)) {
			return false;
		}
		if (!Objects.equals(this.isSubtype, other.isSubtype)) {
			return false;
		}
		if (!Objects.equals(this.position, other.position)) {
			return false;
		}
		return true;
	}


}
