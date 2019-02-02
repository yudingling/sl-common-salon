package com.sl.common.model;

public enum OrderConfirmStatus {
	UNCONFIRM(0),
	CONFIRMED(1),
	CANCELED(2);
	
	private int value;
	
	private OrderConfirmStatus(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public static OrderConfirmStatus valueOf(int value){
		switch(value){
			case 0: return UNCONFIRM;
			case 1: return CONFIRMED;
			case 2: return CANCELED;
			default: throw new IllegalArgumentException(String.format("[%d] is not a kind of OrderConfirmStatus", value));
		}
	}
}
