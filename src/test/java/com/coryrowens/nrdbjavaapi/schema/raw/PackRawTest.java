/*
 *  -Cory
 */
package com.coryrowens.nrdbjavaapi.schema.raw;

/**
 *
 * @author cory
 */
public class PackRawTest extends AbstractRawTest<PackRaw> {

	public PackRawTest() {
	}

	@Override
	protected PackRaw setUpA() {
		PackRaw a = new PackRaw();
		a.code = "core";
		a.cycleCode = "core";
		a.dateRelease = "2012-09-06";
		a.name = "Core Set";
		a.position = 1;
		a.size = 113;
		return a;
	}

	@Override
	protected PackRaw setUpB() {
		PackRaw b = new PackRaw();
		b.code = "wla";
		b.cycleCode = "genesis";
		b.dateRelease = "2012-12-14";
		b.name = "What Lies Ahead";
		b.position = 1;
		b.size = 20;
		return b;
	}

}
