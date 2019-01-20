package com.sl.common.util;

public class Constant {
	private Constant(){}
	
	/**
	 * request parameter id
	 */
	public static final String REQUEST_PARAM_TOKEN = "token";
	
	/**
	 * redis prefix
	 */
	private static final String REDIS_PREFIX = "salon:";
	public static final String REDIS_PREFIX_TOKEN = REDIS_PREFIX + "tk_";
	
	/**
	 * distributed lock prefix
	 */
	private static final String LOCK_PREFIX = REDIS_PREFIX + "lock:";
	public static final String LOCK_PREFIX_RESERVATION = LOCK_PREFIX + "resv_";
}
