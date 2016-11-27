package com.coryrowens.nrdbjavaapi.schema.enums;

import com.coryrowens.nrdbjavaapi.schema.raw.SideRaw;

public enum Side {
	RUNNER("runner", "Runner"), CORP("corp", "Corp");

	private Side(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public final String code;
	public final String name;
	
	public static Side fromCode(String sideCode){
		for(Side s : Side.values()){
			if (s.code.equalsIgnoreCase(sideCode)){
				return s;
			}
		}
		throw new IllegalArgumentException("Unrecognized Side Code: " + sideCode);
	}
	
	public static Side fromRaw(SideRaw raw){
		return fromCode(raw.code);
	}
}
