package com.coryrowens.nrdbjavaapi.schema.processed;

import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import java.util.Objects;

public class Cycle {

	public final String code;
	public final String name;
	public final int position;
	public final int size;

	public Cycle(CycleRaw raw) {
		this.code = raw.code;
		this.name = raw.name;
		this.position = raw.position;
		this.size = raw.size;
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
		final Cycle other = (Cycle) obj;
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
		int hash = 7;
		hash = 61 * hash + Objects.hashCode(this.code);
		hash = 61 * hash + Objects.hashCode(this.name);
		hash = 61 * hash + this.position;
		hash = 61 * hash + this.size;
		return hash;
	}

}
