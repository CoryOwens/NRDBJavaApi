package com.coryrowens.nrdbjavaapi.webhooks;

import com.coryrowens.nrdbjavaapi.schema.raw.MWLRaw;
import java.util.List;

public interface MWLWebHook {

	public List<MWLRaw> mwl();
}
