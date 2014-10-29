package com.robovm.bindings.weibo.objects;

import org.robovm.rt.bro.ValuedEnum;

public enum WeiboSDKResponseStatusCode implements ValuedEnum{
	Success(0),
	UserCancel(-1),
	SentFail(-2),
	AutdDeny(-3),
	UserCancelInstall(-4),
	Unsupport(-99),
	Unknow(-100)		
	;
	
	private final long n;
	
	private WeiboSDKResponseStatusCode(long n){
		this.n = n;
	}

	@Override
	public long value() {
		// TODO Auto-generated method stub
		return n;
	}
}
