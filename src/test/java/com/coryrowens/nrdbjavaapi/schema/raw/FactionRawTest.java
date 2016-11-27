
package com.coryrowens.nrdbjavaapi.schema.raw;

/*
 *  -Cory
 */

/**
 *
 * @author cory
 */
public class FactionRawTest extends AbstractRawTest<FactionRaw>{

	@Override
	protected FactionRaw setUpA() {
		FactionRaw a = new FactionRaw();
		a.code = "anarch";
		a.color = "FF4500";
		a.name = "Anarch";
		a.sideCode = "runner";
		return a;
	}

	@Override
	protected FactionRaw setUpB() {
		FactionRaw b = new FactionRaw();
		b.code = "criminal";
		b.color = "4169E1";
		b.name = "Criminal";
		b.sideCode = "runner";
		return b;
	}
	
}
