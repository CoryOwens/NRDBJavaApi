package com.coryrowens.nrdbjavaapi.suppliers;

import com.coryrowens.nrdbjavaapi.schema.enums.Type;
import java.util.List;

public interface TypeSupplier {

	public Type type(String typeCode);
	
	public List<Type> types();
}
