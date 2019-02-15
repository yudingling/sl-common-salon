package com.sl.common.model.db;

import java.io.Serializable;

import javax.persistence.Id;

public class SlShopServiceOrder implements Serializable {
	private static final long serialVersionUID = -5783705961192242613L;
	@Id
	private Long spsodId;
	private Long shopId;
	private Long spsodStm;
	private Long spsodEtm;
	private Double spsodPrice;
	private Integer spsodYear;
	private Double spsodDiscount;
	private Double spsodTotalPrice;
	private Long spsodPaiedTs;
	private String spsodPaiedTp;
	private Long crtTs;
	private Long uptTs;
	
	public Long getSpsodId() {
		return spsodId;
	}
	public void setSpsodId(Long spsodId) {
		this.spsodId = spsodId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getSpsodStm() {
		return spsodStm;
	}
	public void setSpsodStm(Long spsodStm) {
		this.spsodStm = spsodStm;
	}
	public Long getSpsodEtm() {
		return spsodEtm;
	}
	public void setSpsodEtm(Long spsodEtm) {
		this.spsodEtm = spsodEtm;
	}
	public Double getSpsodPrice() {
		return spsodPrice;
	}
	public void setSpsodPrice(Double spsodPrice) {
		this.spsodPrice = spsodPrice;
	}
	public Integer getSpsodYear() {
		return spsodYear;
	}
	public void setSpsodYear(Integer spsodYear) {
		this.spsodYear = spsodYear;
	}
	public Double getSpsodDiscount() {
		return spsodDiscount;
	}
	public void setSpsodDiscount(Double spsodDiscount) {
		this.spsodDiscount = spsodDiscount;
	}
	public Double getSpsodTotalPrice() {
		return spsodTotalPrice;
	}
	public void setSpsodTotalPrice(Double spsodTotalPrice) {
		this.spsodTotalPrice = spsodTotalPrice;
	}
	public Long getSpsodPaiedTs() {
		return spsodPaiedTs;
	}
	public void setSpsodPaiedTs(Long spsodPaiedTs) {
		this.spsodPaiedTs = spsodPaiedTs;
	}
	public String getSpsodPaiedTp() {
		return spsodPaiedTp;
	}
	public void setSpsodPaiedTp(String spsodPaiedTp) {
		this.spsodPaiedTp = spsodPaiedTp;
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
	
	public SlShopServiceOrder(){
		super();
	}
	
	public SlShopServiceOrder(Long spsodId, Long shopId, Long spsodStm,
			Long spsodEtm, Double spsodPrice, Integer spsodYear,
			Double spsodDiscount, Double spsodTotalPrice, Long spsodPaiedTs,
			String spsodPaiedTp, Long crtTs, Long uptTs) {
		super();
		this.spsodId = spsodId;
		this.shopId = shopId;
		this.spsodStm = spsodStm;
		this.spsodEtm = spsodEtm;
		this.spsodPrice = spsodPrice;
		this.spsodYear = spsodYear;
		this.spsodDiscount = spsodDiscount;
		this.spsodTotalPrice = spsodTotalPrice;
		this.spsodPaiedTs = spsodPaiedTs;
		this.spsodPaiedTp = spsodPaiedTp;
		this.crtTs = crtTs;
		this.uptTs = uptTs;
	}
	
}
