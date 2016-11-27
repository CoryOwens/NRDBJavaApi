/*
 *  -Cory
 */
package com.coryrowens.nrdbjavaapi.schema.raw;

/**
 *
 * @author cory
 */
public class SideRawTest extends AbstractRawTest<SideRaw> {

	public SideRawTest() {
	}

	@Override
	protected SideRaw setUpA() {
		SideRaw a = new SideRaw();
		a.code = "runner";
		a.name = "Runner";
		return a;
	}

	@Override
	protected SideRaw setUpB() {
		SideRaw b = new SideRaw();
		b.code = "corp";
		b.name = "Agenda";
		return b;
	}
}
