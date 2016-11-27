package com.coryrowens.nrdbjavaapi.schema.enums;

import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;

public enum Type {
	AGENDA("agenda", "Agenda", 1, false)
	,ASSET("asset", "asset", 2, false)
	,EVENT("event", "Event", 11, false)
	,HARDWARE("hardware", "Hardware", 12, false)
	,ICE("ice", "ICE", 18, false)
	,IDENTITY("identity", "identity", 0, false)
	,OPERATION("operation", "Operation", 4, false)
	,PROGRAM("program", "Program", 15, false)
	,RESOURCE("resource", "resource", 13, false)
	,UPGRADE("upgrade", "Upgrade", 3, false)
	,BARRIER("barrier", "Barrier", 5, true)
	,CODE_GATE("code-gate", "Code Gate", 6, true)
	,SENTRY("sentry", "sentry", 7, true)
	,ICEBREAKER("icebreaker", "Icebreaker", 14, true);
	public final String code;
	public final String name;
	public final int position;
	public final boolean isSubtype;
	private Type(String code, String name, int position, boolean isSubtype){
		this.code = code;
		this.name = name;
		this.position = position;
		this.isSubtype = isSubtype;
	}
	
	public static Type fromCode(String typeCode){
		for(Type t : Type.values()){
			if (t.code.equalsIgnoreCase(typeCode)){
				return t;
			}
		}
		throw new IllegalArgumentException("Unrecognized Type Code: " + typeCode);
	}
	
	public static Type fromRaw(TypeRaw raw){
		return fromCode(raw.code);
	}
}
