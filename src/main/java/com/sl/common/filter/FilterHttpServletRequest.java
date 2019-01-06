package com.sl.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import com.sl.common.model.SToken;

public class FilterHttpServletRequest extends HttpServletRequestWrapper {
	private SToken token;
	
	public FilterHttpServletRequest(HttpServletRequest request) {
		super(request);
	}
	
	public SToken getToken() {
		return token;
	}

	public void setToken(SToken token) {
		this.token = token;
	}
}
