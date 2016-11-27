/*
 *  -Cory
 */
package com.coryrowens.nrdbjavaapi.util;

import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;
import static org.junit.Assert.*;

/**
 *
 * @author cory
 */
public class DatesTest {

	private final String testDateString = "2016-08-01";
	private final String testDateStringWithTime = "2016-08-01T01:49:11+00:00";
	private final Date testDate;
	
	public DatesTest() {
		Calendar calendar = new GregorianCalendar();
		calendar.set(YEAR, 2016);
		calendar.set(MONTH, AUGUST);
		calendar.set(DAY_OF_MONTH, 1);
		calendar.set(HOUR_OF_DAY, 0);
		calendar.set(MINUTE, 0);
		calendar.set(SECOND, 0);
		calendar.set(MILLISECOND, 0);
		this.testDate = calendar.getTime();
	}

	@Test
	public void testFromString() {
		Date dateFromString = Dates.fromString(testDateString);
		assertEquals(testDate, dateFromString);
	}

	@Test
	public void testFromStringWithTime() {
		Date dateFromString = Dates.fromString(testDateStringWithTime);
		assertEquals(testDate, dateFromString);
	}

	@Test
	public void testAsString() {
		String asString = Dates.asString(testDate);
		assertEquals(testDateString, asString);
	}

	@Test
	public void testAsStringFromString() {
		String asString = Dates.asString(testDate);
		Date asDate = Dates.fromString(asString);
		assertEquals(testDate, asDate);
	}

	@Test
	public void testFromStringAsString() {
		Date asDate = Dates.fromString(testDateString);
		String asString = Dates.asString(asDate);
		assertEquals(testDateString, asString);
	}
	
}
