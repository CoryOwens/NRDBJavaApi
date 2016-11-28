package com.coryrowens.nrdbjavaapi.webhooks.raw;

import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;
import java.util.List;

public interface TypeRawWebHook {

	public TypeRaw type(String typeCode);

	public List<TypeRaw> types();
}
