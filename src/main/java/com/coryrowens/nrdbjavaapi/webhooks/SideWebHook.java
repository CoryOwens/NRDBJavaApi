package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.SideRaw;
import java.util.List;

public interface SideWebHook {

	public SideRaw side(String sideCode);

	public List<SideRaw> sides();
}
