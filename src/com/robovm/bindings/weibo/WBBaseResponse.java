package com.robovm.bindings.weibo;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

import com.robovm.bindings.weibo.objects.WBDataTransferObject;
import com.robovm.bindings.weibo.objects.WeiboSDKResponseStatusCode;

@NativeClass
public class WBBaseResponse extends WBDataTransferObject{
	
	/**
	 对应的 request 中的自定义信息字典
	 
	 如果当前 response 是由微博客户端响应给第三方应用的，则 requestUserInfo 中会包含原 request.userInfo 中的所有数据
	 
	 @see WBBaseRequest.userInfo
	 */
	@Property(selector = "requestUserInfo")
	public native NSDictionary<?,?> getRequestUserInfo();
	
	/**
	 响应状态码
	 
	 第三方应用可以通过statusCode判断请求的处理结果
	 */
	@Property(selector = "statusCode")
	public native WeiboSDKResponseStatusCode getStatusCode();
	
	/**
	 返回一个 WBBaseResponse 对象
	 
	 @return 返回一个*自动释放的*WBBaseResponse对象
	 */
	@Method(selector = "response")
	public static native @Pointer long response();


}
