package com.robovm.bindings.weibo;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public interface WeiboSDKDelegate extends NSObjectProtocol{
	@Method(selector ="didReceiveWeiboRequest:")
	void didReceiveWeiboRequest(WBBaseRequest request);
	
	@Method(selector = "didReceiveWeiboResponse:")
	void didReceiveWeiboResponse(WBBaseResponse response);
}
