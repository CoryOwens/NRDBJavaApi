/*
 *  -Cory
 */
package com.coryrowens.nrdbjavaapi.schema.raw;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author cory
 */
@Ignore public abstract class AbstractRawTest<T> {

	T a;
	T b;
	T c;

	@Before
	public final void setUp() {
		this.a = setUpA();
		this.b = setUpB();
		this.c = setUpA();
	}
	
	protected abstract T setUpA();
	
	protected abstract T setUpB();

	@Test
	public void testEqualsTrue() {
		assertTrue(a.equals(c));
		assertTrue(c.equals(a));
	}

	@Test
	public void testEqualsFalse() {
		assertFalse(a.equals(b));
		assertFalse(b.equals(a));
	}

	@Test
	public void testHashCodeEqual() {
		assertEquals("Identical objects don't have the same hashCode.", a.hashCode(), c.hashCode());
	}

	@Test
	public void testHashCodeNotEqual() {
		assertNotEquals("Different objects have the same hashCode.", a.hashCode(), b.hashCode());
	}

}
