package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.Objects;

public class CycleRaw {

	public String code;
	public String name;
	public int position;
	public int size;

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
		final CycleRaw other = (CycleRaw) obj;
		if (this.position != other.position) {
			return false;
		}
		if (this.size != other.size) {
			return false;
		}
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
		int hash = 5;
		hash = 53 * hash + Objects.hashCode(this.code);
		hash = 53 * hash + Objects.hashCode(this.name);
		hash = 53 * hash + this.position;
		hash = 53 * hash + this.size;
		return hash;
	}
}
