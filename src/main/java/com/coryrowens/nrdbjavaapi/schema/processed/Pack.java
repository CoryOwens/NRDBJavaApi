package com.coryrowens.nrdbjavaapi.schema.processed;

import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import com.coryrowens.nrdbjavaapi.suppliers.CycleSupplier;
import com.coryrowens.nrdbjavaapi.util.Dates;
import java.util.Date;
import java.util.Objects;

public class Pack {

	public final String code;
	public final Cycle cycle;
	public final Date dateRelease;
	public final String name;
	public final int position;
	public final int size;

	public Pack(PackRaw raw, CycleSupplier cycleSupplier) {
		this.code = raw.code;
		this.cycle = cycleSupplier.cycle(raw.cycleCode);
		this.dateRelease = Dates.fromString(raw.dateRelease);
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
		final Pack other = (Pack) obj;
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
		if (!Objects.equals(this.cycle, other.cycle)) {
			return false;
		}
		if (!Objects.equals(this.dateRelease, other.dateRelease)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 79 * hash + Objects.hashCode(this.code);
		hash = 79 * hash + Objects.hashCode(this.cycle);
		hash = 79 * hash + Objects.hashCode(this.dateRelease);
		hash = 79 * hash + Objects.hashCode(this.name);
		hash = 79 * hash + this.position;
		hash = 79 * hash + this.size;
		return hash;
	}
}
