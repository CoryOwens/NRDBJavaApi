package com.coryrowens.nrdbjavaapi.suppliers.NRDB;

import com.coryrowens.nrdbjavaapi.schema.enums.Type;
import com.coryrowens.nrdbjavaapi.suppliers.TypeSupplier;
import com.google.common.collect.Lists;
import java.util.List;

public class TypeNRDBSupplier implements TypeSupplier {

	@Override
	public Type type(String typeCode) {
		return Type.fromCode(typeCode);
	}

	@Override
	public List<Type> types() {
		return Lists.newArrayList(Type.values());
	}

}
