package com.coryrowens.nrdbjavaapi.webhooks.raw.NRDB;

import com.coryrowens.nrdbjavaapi.schema.raw.CardRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.CycleRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.DecklistRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.FactionRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.MWLRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.PackRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.SideRaw;
import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;
import com.coryrowens.nrdbjavaapi.webhooks.raw.NetrunnerWebHook;
import java.util.Date;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;

public class RawNetrunnerDBHook implements NetrunnerWebHook{

	private final CardRawNRDBHook cards;
	private final CycleRawNRDBHook cycles;
	private final DecklistRawNRDBHook decklists;
	private final FactionRawNRDBHook factions;
	private final MWLRawNRDBHook mwl;
	private final PackRawNRDBHook packs;
	private final SideRawNRDBHook sides;
	private final TypeRawNRDBHook types;
	
	/* <editor-fold desc="Constructors"> */
	public RawNetrunnerDBHook(){
		this(
				new CardRawNRDBHook()
				, new CycleRawNRDBHook()
				, new DecklistRawNRDBHook()
				, new FactionRawNRDBHook()
				, new MWLRawNRDBHook()
				, new PackRawNRDBHook()
				, new SideRawNRDBHook()
				, new TypeRawNRDBHook()
		);
	}
	
	public RawNetrunnerDBHook(String target){
		this(
				new CardRawNRDBHook(target)
				, new CycleRawNRDBHook(target)
				, new DecklistRawNRDBHook(target)
				, new FactionRawNRDBHook(target)
				, new MWLRawNRDBHook(target)
				, new PackRawNRDBHook(target)
				, new SideRawNRDBHook(target)
				, new TypeRawNRDBHook(target)
		);
	}
	
	public RawNetrunnerDBHook(HttpClient client, String target) {
		this(
				new CardRawNRDBHook(client, target)
				, new CycleRawNRDBHook(client, target)
				, new DecklistRawNRDBHook(client, target)
				, new FactionRawNRDBHook(client, target)
				, new MWLRawNRDBHook(client, target)
				, new PackRawNRDBHook(client, target)
				, new SideRawNRDBHook(client, target)
				, new TypeRawNRDBHook(client, target)
		);
	}
	
	public RawNetrunnerDBHook(HttpClient client, HttpHost host) {
		this(
				new CardRawNRDBHook(client, host)
				, new CycleRawNRDBHook(client, host)
				, new DecklistRawNRDBHook(client, host)
				, new FactionRawNRDBHook(client, host)
				, new MWLRawNRDBHook(client, host)
				, new PackRawNRDBHook(client, host)
				, new SideRawNRDBHook(client, host)
				, new TypeRawNRDBHook(client, host)
		);
	}
	
	public RawNetrunnerDBHook(
			CardRawNRDBHook cards
			, CycleRawNRDBHook cycles
			, DecklistRawNRDBHook decklists
			, FactionRawNRDBHook factions
			, MWLRawNRDBHook mwl
			, PackRawNRDBHook packs
			, SideRawNRDBHook sides
			, TypeRawNRDBHook types
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
