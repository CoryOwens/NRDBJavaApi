package com.coryrowens.nrdbjavaapi.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static Date fromString(String date) {
		return sdf.parse(date, new ParsePosition(0));
	}

	public static String asString(Date date) {
		return sdf.format(date);
	}
}
