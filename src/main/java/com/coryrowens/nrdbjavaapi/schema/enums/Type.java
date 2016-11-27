package com.coryrowens.nrdbjavaapi.schema.enums;

import static com.coryrowens.nrdbjavaapi.schema.enums.Side.*;
import com.coryrowens.nrdbjavaapi.schema.raw.TypeRaw;

public enum Type {
	AGENDA("agenda", "Agenda", 1, false, CORP)
	,ASSET("asset", "asset", 2, false, CORP)
	,EVENT("event", "Event", 11, false, RUNNER)
	,HARDWARE("hardware", "Hardware", 12, false, RUNNER)
	,ICE("ice", "ICE", 18, false, CORP)
	,IDENTITY("identity", "identity", 0, false, null)
	,OPERATION("operation", "Operation", 4, false, CORP)
	,PROGRAM("program", "Program", 15, false, RUNNER)
	,RESOURCE("resource", "resource", 13, false, RUNNER)
	,UPGRADE("upgrade", "Upgrade", 3, false, CORP)
	,BARRIER("barrier", "Barrier", 5, true, CORP)
	,CODE_GATE("code-gate", "Code Gate", 6, true, CORP)
	,SENTRY("sentry", "sentry", 7, true, CORP)
	,ICEBREAKER("icebreaker", "Icebreaker", 14, true, RUNNER);
	public final String code;
	public final String name;
	public final int position;
	public final boolean isSubtype;
	public final Side side;
	private Type(String code, String name, int position, boolean isSubtype, Side side){
		this.code = code;
		this.name = name;
		this.position = position;
		this.isSubtype = isSubtype;
		this.side = side;
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
