package com.coryrowens.nrdbjavaapi.webhooks.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.DecklistRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.FactionRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.MWLRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.SideRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;
import com.coryrowens.nrdbjavaapi.webhooks.NetrunnerWebHook;
import java.util.Date;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;

public class NetrunnerDBHook implements NetrunnerWebHook{

	private final CardNRDBHook cards;
	private final CycleNRDBHook cycles;
	private final DecklistNRDBHook decklists;
	private final FactionNRDBHook factions;
	private final MWLNRDBHook mwl;
	private final PackNRDBHook packs;
	private final SideNRDBHook sides;
	private final TypeNRDBHook types;
	
	/* <editor-fold desc="Constructors"> */
	public NetrunnerDBHook(){
		this(
				new CardNRDBHook()
				, new CycleNRDBHook()
				, new DecklistNRDBHook()
				, new FactionNRDBHook()
				, new MWLNRDBHook()
				, new PackNRDBHook()
				, new SideNRDBHook()
				, new TypeNRDBHook()
		);
	}
	
	public NetrunnerDBHook(String target){
		this(
				new CardNRDBHook(target)
				, new CycleNRDBHook(target)
				, new DecklistNRDBHook(target)
				, new FactionNRDBHook(target)
				, new MWLNRDBHook(target)
				, new PackNRDBHook(target)
				, new SideNRDBHook(target)
				, new TypeNRDBHook(target)
		);
	}
	
	public NetrunnerDBHook(HttpClient client, String target) {
		this(
				new CardNRDBHook(client, target)
				, new CycleNRDBHook(client, target)
				, new DecklistNRDBHook(client, target)
				, new FactionNRDBHook(client, target)
				, new MWLNRDBHook(client, target)
				, new PackNRDBHook(client, target)
				, new SideNRDBHook(client, target)
				, new TypeNRDBHook(client, target)
		);
	}
	
	public NetrunnerDBHook(HttpClient client, HttpHost host) {
		this(
				new CardNRDBHook(client, host)
				, new CycleNRDBHook(client, host)
				, new DecklistNRDBHook(client, host)
				, new FactionNRDBHook(client, host)
				, new MWLNRDBHook(client, host)
				, new PackNRDBHook(client, host)
				, new SideNRDBHook(client, host)
				, new TypeNRDBHook(client, host)
		);
	}
	
	public NetrunnerDBHook(
			CardNRDBHook cards
			, CycleNRDBHook cycles
			, DecklistNRDBHook decklists
			, FactionNRDBHook factions
			, MWLNRDBHook mwl
			, PackNRDBHook packs
			, SideNRDBHook sides
			, TypeNRDBHook types
	){
		this.cards = cards;
		this.cycles = cycles;
		this.decklists = decklists;
		this.factions = factions;
		this.mwl = mwl;
		this.packs = packs;
		this.sides = sides;
		this.types = types;
	}
	/* </editor-fold> */
	
	@Override
	public CardRaw card(String cardCode) {
		return cards.card(cardCode);
	}

	@Override
	public List<CardRaw> cards() {
		return cards.cards();
	}

	@Override
	public CycleRaw cycle(String cycleCode) {
		return cycles.cycle(cycleCode);
	}

	@Override
	public List<CycleRaw> cycles() {
		return cycles.cycles();
	}

	@Override
	public DecklistRaw decklist(int id) {
		return decklists.decklist(id);
	}

	@Override
	public List<DecklistRaw> decklists(Date date) {
		return decklists.decklists(date);
	}

	@Override
	public FactionRaw faction(String factionCode) {
		return factions.faction(factionCode);
	}

	@Override
	public List<FactionRaw> factions() {
		return factions.factions();
	}

	@Override
	public List<MWLRaw> mwl() {
		return mwl.mwl();
	}

	@Override
	public PackRaw pack(String packCode) {
		return packs.pack(packCode);
	}

	@Override
	public List<PackRaw> packs() {
		return packs.packs();
	}

	@Override
	public SideRaw side(String sideCode) {
		return sides.side(sideCode);
	}

	@Override
	public List<SideRaw> sides() {
		return sides.sides();
	}

	@Override
	public TypeRaw type(String typeCode) {
		return types.type(typeCode);
	}

	@Override
	public List<TypeRaw> types() {
		return types.types();
	}

}
