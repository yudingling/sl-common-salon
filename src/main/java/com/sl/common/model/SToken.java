package com.sl.common.model;

import java.io.Serializable;

public class SToken implements Serializable {
	private static final long serialVersionUID = -3597832464940512081L;
	
	private String brandId;
	private Long userId;
	private String weChatSessionKey;
	private String weChatOpenId;
	private UserType userType;
	
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getWeChatSessionKey() {
		return weChatSessionKey;
	}
	public void setWeChatSessionKey(String weChatSessionKey) {
		this.weChatSessionKey = weChatSessionKey;
	}
	public String getWeChatOpenId() {
		return weChatOpenId;
	}
	public void setWeChatOpenId(String weChatOpenId) {
		this.weChatOpenId = weChatOpenId;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	public SToken(){
		super();
	}
	
	public SToken(String brandId, Long userId, UserType userType) {
		super();
		this.brandId = brandId;
		this.userId = userId;
		this.userType = userType;
	}
	
	public SToken(UserForToken token, String weChatSessionKey, String weChatOpenId) {
		super();
		this.brandId = token.getBdId();
		this.userId = token.getuId();
		this.weChatSessionKey = weChatSessionKey;
		this.weChatOpenId = weChatOpenId;
		this.userType = UserType.valueOf(token.getRoleId());
	}
}
