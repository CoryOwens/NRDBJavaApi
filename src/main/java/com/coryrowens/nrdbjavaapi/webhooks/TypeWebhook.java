package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;
import java.util.Collection;

public interface TypeWebhook {

	public TypeRaw type(String typeCode);

	public Collection<TypeRaw> types();
}
