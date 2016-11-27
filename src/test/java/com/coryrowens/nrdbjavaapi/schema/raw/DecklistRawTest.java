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
public class DecklistRawTest extends AbstractRawTest<DecklistRaw> {

	@Override
	protected DecklistRaw setUpA() {
		DecklistRaw a = new DecklistRaw();
		a.id = 1;
		a.dateCreation = "2014-08-27T11:36:15+00:00";
		a.dateUpdate = "2014-12-30T13:12:47+00:00";
		a.name = "Tracing a Better World";
		a.description = "\n";
		a.userId = 1;
		a.userName = "Alsciende";
		a.tournamentBadge = false;
		Map<String, Integer> cards = new HashMap<>();
		cards.put("01093", 1);
		cards.put("06030", 1);
		cards.put("02077", 2);
		cards.put("01094", 3);
		cards.put("01107", 1);
		cards.put("02018", 2);
		cards.put("04036", 1);
		cards.put("01057", 1);
		cards.put("04015", 3);
		cards.put("06006", 2);
		cards.put("06008", 2);
		cards.put("01098", 3);
		cards.put("01084", 1);
		cards.put("02070", 3);
		cards.put("01110", 3);
		cards.put("04079", 3);
		cards.put("01103", 2);
		cards.put("01113", 2);
		cards.put("01111", 2);
		cards.put("02052", 2);
		cards.put("01101", 3);
		cards.put("02020", 3);
		cards.put("04020", 1);
		cards.put("06009", 1);
		cards.put("02060", 2);
		a.cards = cards;
		return a;
	}

	@Override
	protected DecklistRaw setUpB() {
		DecklistRaw b = new DecklistRaw();
		b.id = 36791;
		b.dateCreation = "2016-08-01T01:49:11+00:00";
		b.dateUpdate = "2016-08-02T17:51:36+00:00";
		b.name = "Dream Eater";
		b.description = "<p>Use <a href=\"/en/card/08048\">Analog Dreamers</a> with <a href=\"/en/card/07040\">Eater</a> to pressure remotes, bouncing upgrades/assets or forcing the corp to rez them.  Combo with <a href=\"/en/card/08021\">Hacktivist Meeting</a> for HQ pressure and <a href=\"/en/card/10043\">Political Operative</a> to trash whatever they rez in response to a Dreamers run.\n<a href=\"/en/card/01010\">Medium</a> gives good reward for stalling and once you've got a regular breaker set out, can turn a Dreamers run into a massive R&amp;D dig if the corp chooses to rez your only Dreamers target.</p>\n\n<p><a href=\"/en/card/10022\">CBI Raid</a> with <a href=\"/en/card/08021\">Hacktivist Meeting</a> means the corp is unable to rez assets/upgrades giving you a free Dreamers bounce.  If you're particularly scared of a specific operation in HQ, Dreamers after CBI will shuffle the scary stuff away while also giving you a turn to pressure with Medium.</p>\n\n<p>(No same old things bc they're currently in another deck that needs them more)</p>\n";
		b.userId = 22832;
		b.userName = "lasngngna";
		b.tournamentBadge = false;
		Map<String, Integer> cards = new HashMap<>();
		cards.put("10022", 1);
		cards.put("10043", 1);
		cards.put("01002", 2);
		cards.put("01006", 2);
		cards.put("01007", 1);
		cards.put("01008", 1);
		cards.put("01010", 3);
		cards.put("01011", 1);
		cards.put("01014", 1);
		cards.put("01050", 3);
		cards.put("02009", 1);
		cards.put("02022", 3);
		cards.put("02091", 2);
		cards.put("06052", 1);
		cards.put("07032", 3);
		cards.put("07034", 1);
		cards.put("07036", 3);
		cards.put("07037", 1);
		cards.put("07038", 1);
		cards.put("07039", 1);
		cards.put("07040", 3);
		cards.put("08021", 3);
		cards.put("08048", 3);
		cards.put("08062", 3);
		cards.put("08103", 3);
		b.cards = cards;
		return b;
	}

}
