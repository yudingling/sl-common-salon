package com.sl.common.model.db;

import java.io.Serializable;

import javax.persistence.Id;

public class SlWechatPay implements Serializable {
	private static final long serialVersionUID = 3928121863035900098L;
	@Id
	private Long wpayId;
	private Long uId;
	private Integer wpayFkTp;
	private Long wpayFkId;
	private Double wpayPrice;
	private Integer wpaySuccess;
	private Long crtTs;
	private Long uptTs;
	
	public Long getWpayId() {
		return wpayId;
	}
	public void setWpayId(Long wpayId) {
		this.wpayId = wpayId;
	}
	public Long getuId() {
		return uId;
	}
	public void setuId(Long uId) {
		this.uId = uId;
	}
	public Integer getWpayFkTp() {
		return wpayFkTp;
	}
	public void setWpayFkTp(Integer wpayFkTp) {
		this.wpayFkTp = wpayFkTp;
	}
	public Long getWpayFkId() {
		return wpayFkId;
	}
	public void setWpayFkId(Long wpayFkId) {
		this.wpayFkId = wpayFkId;
	}
	public Double getWpayPrice() {
		return wpayPrice;
	}
	public void setWpayPrice(Double wpayPrice) {
		this.wpayPrice = wpayPrice;
	}
	public Integer getWpaySuccess() {
		return wpaySuccess;
	}
	public void setWpaySuccess(Integer wpaySuccess) {
		this.wpaySuccess = wpaySuccess;
	}
	public Long getCrtTs() {
		return crtTs;
	}
	public void setCrtTs(Long crtTs) {
		this.crtTs = crtTs;
	}
	public Long getUptTs() {
		return uptTs;
	}
	public void setUptTs(Long uptTs) {
		this.uptTs = uptTs;
	}
	
	public SlWechatPay(){
		super();
	}
	
	public SlWechatPay(Long wpayId, Long uId, Integer wpayFkTp, Long wpayFkId,
			Double wpayPrice, Integer wpaySuccess, Long crtTs, Long uptTs) {
		super();
		this.wpayId = wpayId;
		this.uId = uId;
		this.wpayFkTp = wpayFkTp;
		this.wpayFkId = wpayFkId;
		this.wpayPrice = wpayPrice;
		this.wpaySuccess = wpaySuccess;
		this.crtTs = crtTs;
		this.uptTs = uptTs;
	}
	
}
