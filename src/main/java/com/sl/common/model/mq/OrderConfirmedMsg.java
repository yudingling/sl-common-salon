package com.sl.common.model.mq;

public class OrderConfirmedMsg implements WebSocketMsg {
	private static final long serialVersionUID = 4695345940715918563L;
	
	private Long uid;
	private Long odId;
	private Boolean confirmed;
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
	public Boolean getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Boolean confirmed) {
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
	
	public OrderConfirmedMsg(Long uid, Long odId, Boolean confirmed, String msg) {
		super();
		this.uid = uid;
		this.odId = odId;
		this.confirmed = confirmed;
		this.msg = msg;
	}
	
	public OrderConfirmedMsg(Long uid, Long odId) {
		this(uid, odId, true, null);
	}
}
