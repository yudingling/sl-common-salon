package com.sl.common.model.mq;

import com.sl.common.model.OrderConfirmStatus;

public class OrderConfirmedMsg implements WebSocketMsg {
	private static final long serialVersionUID = 4695345940715918563L;
	
	private Long uid;
	private Long odId;
	private OrderConfirmStatus confirmed;
	private String msg;
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public Long getOdId() {
		return odId;
	}
	public void setOdId(Long odId) {
		this.odId = odId;
	}
	public OrderConfirmStatus getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(OrderConfirmStatus confirmed) {
		this.confirmed = confirmed;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public OrderConfirmedMsg(){
		super();
	}
	
	public OrderConfirmedMsg(Long uid, Long odId, OrderConfirmStatus confirmed, String msg) {
		super();
		this.uid = uid;
		this.odId = odId;
		this.confirmed = confirmed;
		this.msg = msg;
	}
	
	public OrderConfirmedMsg(Long uid, Long odId) {
		this(uid, odId, OrderConfirmStatus.CONFIRMED, null);
	}
}
