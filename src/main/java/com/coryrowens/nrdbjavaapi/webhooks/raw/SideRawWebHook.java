package com.coryrowens.nrdbjavaapi.webhooks.raw;

import com.coryrowens.nrdbjavaapi.schema.raw.SideRaw;
import java.util.List;

public interface SideRawWebHook {

	public SideRaw side(String sideCode);

	public List<SideRaw> sides();
}
