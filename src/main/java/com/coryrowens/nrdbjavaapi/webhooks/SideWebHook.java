package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.SideRaw;
import java.util.Collection;

public interface SideWebHook {

	public SideRaw side(String sideCode);

	public Collection<SideRaw> sides();
}
