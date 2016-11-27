/*
 *  -Cory
 */
package com.coryrowens.nrdbjavaapi.schema.raw;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cory
 */
public class MWLRawTest extends AbstractRawTest<MWLRaw> {

	@Override
	protected MWLRaw setUpA() {
		MWLRaw a = new MWLRaw();
		a.id = 1;
		a.dateCreation = "-001-11-30T00:00:00+00:00";
		a.dateUpdate = "2016-08-01T00:00:03+00:00";
		a.code = "NAPD_MWL_1.0";
		a.name = "NAPD MWL 1.0";
		a.active = false;
		a.dateStart = "2016-02-01";
		Map<String, Integer> cards = new HashMap<>();
		cards.put("01012", 1);
		cards.put("01014", 1);
		cards.put("01024", 1);
		cards.put("01081", 1);
		cards.put("01092", 1);
		cards.put("02110", 1);
		cards.put("03038", 1);
		cards.put("04029", 1);
		cards.put("04119", 1);
		cards.put("06061", 1);
		cards.put("06099", 1);
		a.cards = cards;
		return a;
	}

	@Override
	protected MWLRaw setUpB() {
		MWLRaw b = new MWLRaw();
		b.id = 5;
		b.dateCreation = "2016-07-12T19:18:47+00:00";
		b.dateUpdate = "2016-08-01T00:00:03+00:00";
		b.code = "NAPD_MWL_1.1";
		b.name = "NAPD MWL 1.1";
		b.active = true;
		b.dateStart = "2016-08-01";
		Map<String, Integer> cards = new HashMap<>();
		cards.put("01012", 1);
		cards.put("01014", 1);
		cards.put("01016", 1);
		cards.put("01024", 1);
		cards.put("01082", 1);
		cards.put("01092", 1);
		cards.put("02110", 1);
		cards.put("03038", 1);
		cards.put("04029", 1);
		cards.put("04119", 1);
		cards.put("06033", 1);
		cards.put("06061", 1);
		cards.put("06099", 1);
		cards.put("08061", 1);
		cards.put("10018", 1);
		b.cards = cards;
		return b;
	}

}
