package com.robovm.bindings.weibo;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class WBHttpRequest extends NSObject{
	//NSURLConnection connection;
	//NSMutableData	responseData;

	/**
	 用户自定义请求地址URL
	 */
	@Property (selector = "setUrl:")
	public native void setUrl(String url);
	
	@Property(selector = "getUrl")
	public native String getUrl();
	
	/**
	 用户自定义请求方式
	 
	 支持"GET" "POST"
	 */
	@Property(selector = "setHttpMethod:")
	public native void setHttpMethod(String httoMethod);
		
	@Property(selector = "getHttpMethod")
	public native String getHttpMethod();
	
	/**
	 用户自定义请求参数字典
	 */
	@Property(selector = "setParams:")
	public native void setParams(NSDictionary<?,?> params);
	
	@Property(selector = "getParams")
	public native NSDictionary<?,?> getParams();
	
	/**
	 WBHttpRequestDelegate对象，用于接收微博SDK对于发起的接口请求的请求的响应
	 */
	@Property(selector = "delegate")
	public native WBHttpRequestDelegate getDelegate();
	
	@Property(selector = "setDelegate:", strongRef = true)
	public native void setDelegate(WBHttpRequestDelegate delegate);
	
	/**
	 用户自定义TAG
	 
	 用于区分回调Request
	 */
	@Property(selector = "tag")
	public native String getTag();
	
	@Property(selector = "setTag:")
	public native void setTage(String tag);
	
	/**
	 统一HTTP请求接口
	 调用此接口后，将发送一个HTTP网络请求
	 @param url 请求url地址
	 @param httpMethod  支持"GET" "POST"
	 @param params 向接口传递的参数结构
	 @param delegate WBHttpRequestDelegate对象，用于接收微博SDK对于发起的接口请求的请求的响应
	 @param tag 用户自定义TAG,将通过回调WBHttpRequest实例的tag属性返回
	 */
	@Method(selector = "requestWithURL:httpMethod:params:delegate:withTag:")
	public static native WBHttpRequest requestWithURL(
			String url, 
			String httpMethod, 
			NSDictionary<?,?> params,
			WBHttpRequestDelegate delegate, 
			String tag);
	
	/**
	 统一微博Open API HTTP请求接口
	 调用此接口后，将发送一个HTTP网络请求（用于访问微博open api）
	 @param accessToken 应用获取到的accessToken，用于身份验证
	 @param url 请求url地址
	 @param httpMethod  支持"GET" "POST"
	 @param params 向接口传递的参数结构
	 @param delegate WBHttpRequestDelegate对象，用于接收微博SDK对于发起的接口请求的请求的响应
	 @param tag 用户自定义TAG,将通过回调WBHttpRequest实例的tag属性返回
	 */
	@Method(selector = "requestWithAccessToken:url:httpMethod:params:delegate:withTag:")
	public static native WBHttpRequest requestWithAccessToken(
			String accessToken,
			String url,
			String httpMethod,
			NSDictionary<?,?> params,
			WBHttpRequestDelegate delegate,
			String tag);
	
	/**
	 取消网络请求接口
	 调用此接口后，将取消当前网络请求，建议同时[WBHttpRequest setDelegate:nil];
	 */
	@Method(selector = "disconnect")
	public native void disconnect();
	
	
	
}
