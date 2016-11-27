package com.coryrowens.nrdbjavaapi.webhooks.NRDB.util;

public class UncheckedJSONException extends RuntimeException{
	public UncheckedJSONException(String message, Exception ex){
		super(message, ex);
	}
}