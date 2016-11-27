package com.coryrowens.nrdbjavaapi.schema.enums;

import static com.coryrowens.nrdbjavaapi.schema.enums.Side.*;
import com.coryrowens.nrdbjavaapi.schema.raw.FactionRaw;

public enum Faction {
	ANARCH("anarch", "FF4500", false, "Anarch", RUNNER)
	,CRIMINAL("criminal", "4169E1", false, "Criminal", RUNNER)
	,SHAPER("shaper", "32CD32", false, "Shaper", RUNNER)
	,NEUTRAL_RUNNER("neutral-runner", "808080", false, "Neutral", RUNNER)
	,HAAS_BIOROID("haas-bioroid", "8A2BE2", false, "Haas-Bioroid", CORP)
	,JINTEKI("jinteki", "DC143C", false, "jinteki", CORP)
	,NBN("nbn", "FF8C00", false, "NBN", CORP)
	,WEYLAND_CONSORTIUM("weyland-consortium", "006400", false, "Weyland-Consortium", CORP)
	,NEUTRAL_CORP("neutral-corp", "808080", false, "Neutral-Corp", CORP)
	,APEX("apex", "000000", true, "apex", RUNNER)
	,ADAM("adam", "000000", true, "Adam", RUNNER)
	,SUNNY_LEBEAU("sunny-lebeau", "000000", true, "Sunny-Lebeau", RUNNER);
	private Faction(String code, String color, boolean isMini, String name, Side side){
		this.code = code;
		this.color = color;
		this.isMini = isMini;
		this.name = name;
		this.side = side;
	}
	public final String code;
	public final String color;
	public final boolean isMini;
	public final String name;
	public final Side side;
	
	public static Faction fromCode(String factionCode){
		for(Faction f : Faction.values()){
			if (f.code.equalsIgnoreCase(factionCode)){
				return f;
			}
		}
		throw new IllegalArgumentException("Unrecognized Faction Code: " + factionCode);
	}
	
	public static Faction fromRaw(FactionRaw raw){
		return fromCode(raw.code);
	}
}
