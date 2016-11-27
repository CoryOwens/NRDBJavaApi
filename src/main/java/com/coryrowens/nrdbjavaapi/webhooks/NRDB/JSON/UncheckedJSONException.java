package com.coryrowens.nrdbjavaapi.webhooks.NRDB.JSON;

public class UncheckedJSONException extends RuntimeException{
	public UncheckedJSONException(String message, Exception ex){
		super(message, ex);
	}
}