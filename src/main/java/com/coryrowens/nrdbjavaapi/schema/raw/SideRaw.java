package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.Objects;

public class SideRaw {

	public String code;
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
		final SideRaw other = (SideRaw) obj;
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 83 * hash + Objects.hashCode(this.code);
		hash = 83 * hash + Objects.hashCode(this.name);
		return hash;
	}
}
