/*
 *  -Cory
 */
package com.coryrowens.nrdbjavaapi.schema.raw;

/**
 *
 * @author cory
 */
public class CardRawTest extends AbstractRawTest<CardRaw> {

	@Override
	protected CardRaw setUpA() {
		CardRaw a = new CardRaw();
		a.code = "01093";
		a.deckLimit = 1;
		a.factionCode = "weyland-consortium";
		a.flavor = "Moving Upwards.";
		a.influenceLimit = 15;
		a.keywords = "Megacorp";
		a.minimumDeckSize = 45;
		a.packCode = "core";
		a.position = 93;
		a.quantity = 1;
		a.sideCode = "corp";
		a.text = "Gain 1[credit] whenever you play a <strong>transaction</strong> operation.";
		a.title = "Weyland Consortium: Building a Better World";
		a.typeCode = "identity";
		a.uniqueness = false;
		return a;
	}

	@Override
	protected CardRaw setUpB() {
		CardRaw b = new CardRaw();
		b.code = "04015";
		b.cost = 0;
		b.deckLimit = 3;
		b.factionCode = "nbn";
		b.factionCost = 1;
		b.flavor = "\"It is my job to ensure our creations are the perfect companions and edutainment for tomorrow's consumers.\"";
		b.illustrator = "JuanManuel Tumburus";
		b.keywords = "Executive";
		b.packCode = "om";
		b.position = 15;
		b.quantity = 3;
		b.sideCode = "corp";
		b.text = "[click]: Draw 2 cards.\\n<strong>Remove Jackson Howard from the game:</strong> Shuffle up to 3 cards from Archives to R&D.";
		b.title = "Jackson Howard";
		b.trashCost = 3;
		b.typeCode = "asset";
		b.uniqueness = true;
		return b;
	}

}
