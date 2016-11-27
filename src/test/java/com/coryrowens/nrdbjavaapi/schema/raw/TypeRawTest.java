/*
 *  -Cory
 */
package com.coryrowens.nrdbjavaapi.schema.raw;

/**
 *
 * @author cory
 */
public class TypeRawTest extends AbstractRawTest<TypeRaw> {

	public TypeRawTest() {
	}

	@Override
	protected TypeRaw setUpA() {
		TypeRaw a = new TypeRaw();
		a.code = "agenda";
		a.name = "Agenda";
		a.position = 1;
		a.isSubtype = false;
		return a;
	}

	@Override
	protected TypeRaw setUpB() {
		TypeRaw b = new TypeRaw();
		b.code = "asset";
		b.name = "Asset";
		b.position = 2;
		b.isSubtype = false;
		return b;
	}

}
