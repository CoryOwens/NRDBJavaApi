package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;
import java.util.List;

public interface TypeWebhook {

	public TypeRaw type(String typeCode);

	public List<TypeRaw> types();
}
