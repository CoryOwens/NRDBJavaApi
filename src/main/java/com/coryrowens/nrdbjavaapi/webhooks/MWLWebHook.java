package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.MWLRaw;
import java.util.Collection;

public interface MWLWebHook {

	public Collection<MWLRaw> mwl();
}
