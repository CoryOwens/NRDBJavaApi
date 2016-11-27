/*
 *  -Cory
 */
package com.coryrowens.nrdbjavaapi.schema.raw;

/**
 *
 * @author cory
 */
public class CycleRawTest extends AbstractRawTest<CycleRaw>{

	@Override
	protected CycleRaw setUpA() {
		CycleRaw a = new CycleRaw();
		a.code = "core";
		a.name = "Core Set";
		a.position = 1;
		a.size = 1;
		return a;
	}

	@Override
	protected CycleRaw setUpB() {
		CycleRaw b = new CycleRaw();
		b.code = "genesis";
		b.name = "Genesis";
		b.position = 2;
		b.size = 6;
		return b;
	}
	
}
