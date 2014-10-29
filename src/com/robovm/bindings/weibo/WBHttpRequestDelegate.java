package com.robovm.bindings.weibo;

import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.apple.foundation.NSURLResponse;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public interface WBHttpRequestDelegate extends NSObjectProtocol{
	/**
	 收到一个来自微博Http请求的响应
	 
	 @param response 具体的响应对象
	 */
	@Method(selector = "request:didReceiveResponse:")
	public void request(WBHttpRequest request, NSURLResponse response);
	
	/**
	 收到一个来自微博Http请求失败的响应
	 
	 @param error 错误信息
	 */
	@Method(selector = "request:didFailWithError:")
	public  void request(WBHttpRequest request, NSError error);
	
	/**
	 收到一个来自微博Http请求的网络返回
	 
	 @param result 请求返回结果
	 */
	@Method(selector = "request:didFinishLoadingWithResult:")
	public  void request(WBHttpRequest request, String result);	
	
	/**
	 收到一个来自微博Http请求的网络返回
	 
	 @param data 请求返回结果
	 */
	@Method(selector = "request:didFinishLoadingWithDataResult:")
	public  void request(WBHttpRequest request, NSData data);
	
	
}
