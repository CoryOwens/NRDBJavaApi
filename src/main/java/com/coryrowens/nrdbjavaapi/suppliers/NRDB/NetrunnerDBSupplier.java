package com.coryrowens.nrdbjavaapi.suppliers.NRDB;

import com.coryrowens.nrdbjavaapi.schema.enums.Faction;
import com.coryrowens.nrdbjavaapi.schema.enums.Side;
import com.coryrowens.nrdbjavaapi.schema.enums.Type;
import com.coryrowens.nrdbjavaapi.schema.processed.Card;
import com.coryrowens.nrdbjavaapi.schema.processed.Cycle;
import com.coryrowens.nrdbjavaapi.schema.processed.Decklist;
import com.coryrowens.nrdbjavaapi.schema.processed.MWL;
import com.coryrowens.nrdbjavaapi.schema.processed.Pack;
import com.coryrowens.nrdbjavaapi.suppliers.CardSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.CycleSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.DecklistSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.FactionSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.MWLSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.NetrunnerSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.PackSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.SideSupplier;
import com.coryrowens.nrdbjavaapi.suppliers.TypeSupplier;
import java.util.Date;
import java.util.List;

public class NetrunnerDBSupplier implements NetrunnerSupplier{
	
	private final CardSupplier cards;
	private final CycleSupplier cycles;
	private final DecklistSupplier decklists;
	private final FactionSupplier factions;
	private final MWLSupplier mwls;
	private final PackSupplier packs;
	private final SideSupplier sides;
	private final TypeSupplier types;

	public NetrunnerDBSupplier(CardSupplier cards, CycleSupplier cycles, DecklistSupplier decklists, FactionSupplier factions, MWLSupplier mwls, PackSupplier packs, SideSupplier sides, TypeSupplier types) {
		this.cards = cards;
		this.cycles = cycles;
		this.decklists = decklists;
		this.factions = factions;
		this.mwls = mwls;
		this.packs = packs;
		this.sides = sides;
		this.types = types;
	}

	@Override
	public Card card(String cardCode) {
		return cards.card(cardCode);
	}

	@Override
	public List<Card> cards() {
		return cards.cards();
	}

	@Override
	public Cycle cycle(String cycleCode) {
		return cycles.cycle(cycleCode);
	}

	@Override
	public List<Cycle> cycles() {
		return cycles.cycles();
	}

	@Override
	public Decklist decklist(int id) {
		return decklists.decklist(id);
	}

	@Override
	public List<Decklist> decklists(Date date) {
		return decklists.decklists(date);
	}

	@Override
	public Faction faction(String factioncode) {
		return factions.faction(factioncode);
	}

	@Override
	public List<Faction> factions() {
		return factions.factions();
	}

	@Override
	public List<MWL> mwl() {
		return mwls.mwl();
	}

	@Override
	public Pack pack(String packCode) {
		return packs.pack(packCode);
	}

	@Override
	public List<Pack> packs() {
		return packs.packs();
	}

	@Override
	public Side side(String sideCode) {
		return sides.side(sideCode);
	}

	@Override
	public List<Side> sides() {
		return sides.sides();
	}

	@Override
	public Type type(String typeCode) {
		return types.type(typeCode);
	}

	@Override
	public List<Type> types() {
		return types.types();
	}

}
