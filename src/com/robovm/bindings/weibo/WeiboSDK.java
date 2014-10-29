package com.robovm.bindings.weibo;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSURL;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;


@NativeClass
public class WeiboSDK extends NSObject {
	
	@Method(selector = "isWeiboAppInstalled")
	public static native boolean isWeiboAppInstalled();
	
	@Method(selector = "registerApp:")
	public static native boolean registerApp(String weiboAppKey);

	/**
	 处理微博客户端程序通过URL启动第三方应用时传递的数据
	 
	 需要在 application:openURL:sourceApplication:annotation:或者application:handleOpenURL中调用
	 @param url 启动第三方应用的URL
	 @param delegate WeiboSDKDelegate对象，用于接收微博触发的消息
	 @see WeiboSDKDelegate
	 */
	@Method(selector = "handleOpenURL:delegate:")
	public static native boolean handleOpenURL(NSURL url, WeiboSDKDelegate delegate);
	
	/**
	 发送请求给微博客户端程序，并切换到微博
	 
	 请求发送给微博客户端程序之后，微博客户端程序会进行相关的处理，处理完成之后一定会调用 [WeiboSDKDelegate didReceiveWeiboResponse:] 方法将处理结果返回给第三方应用
	 
	 @param request 具体的发送请求
	 @see [WeiboSDKDelegate didReceiveWeiboResponse:]
	 @see WBBaseResponse
	 */
	@Method(selector = "sendRequest:")
	public static native boolean sendRequest(WBBaseRequest request);
	
	/**
	 收到微博客户端程序的请求后，发送对应的应答给微博客户端端程序，并切换到微博
	 
	 第三方应用收到微博的请求后，异步处理该请求，完成后必须调用该函数将应答返回给微博
	 
	 @param response 具体的应答内容
	 @see WBBaseRequest
	 */
	@Method(selector = "sendResponse:")
	public static native boolean sendResponse(WBBaseResponse response);
	
	/**
	 设置WeiboSDK的调试模式
	 
	 当开启调试模式时，WeiboSDK会在控制台输出详细的日志信息，开发者可以据此调试自己的程序。默认为 NO
	 @param enabled 开启或关闭WeiboSDK的调试模式
	 */
	@Method(selector = "enableDebugMode:")
	public static native void enableDebugMode(boolean enabled);
	
	/**
	 取消授权，登出接口
	 调用此接口后，token将失效
	 @param token 第三方应用之前申请的Token
	 @param delegate WBHttpRequestDelegate对象，用于接收微博SDK对于发起的接口请求的请求的响应
	 @param tag 用户自定义TAG,将通过回调WBHttpRequest实例的tag属性返回

	 */
	@Method(selector = "logOutWithToken:delegate:withTag:")
	public static native void logOutWithToken(String token, WBHttpRequestDelegate delegate,String tag);
	
	
}
