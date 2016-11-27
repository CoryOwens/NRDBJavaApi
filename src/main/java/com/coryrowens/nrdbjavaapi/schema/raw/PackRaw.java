package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.Objects;

public class PackRaw {

	public String code;
	public String cycleCode;
	public String dateRelease;
	public String name;
	public int position;
	public Integer size;

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
		final PackRaw other = (PackRaw) obj;
		if (this.position != other.position) {
			return false;
		}
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		if (!Objects.equals(this.cycleCode, other.cycleCode)) {
			return false;
		}
		if (!Objects.equals(this.dateRelease, other.dateRelease)) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (!Objects.equals(this.size, other.size)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.code);
		hash = 29 * hash + Objects.hashCode(this.cycleCode);
		hash = 29 * hash + Objects.hashCode(this.dateRelease);
		hash = 29 * hash + Objects.hashCode(this.name);
		hash = 29 * hash + this.position;
		hash = 29 * hash + Objects.hashCode(this.size);
		return hash;
	}

}
