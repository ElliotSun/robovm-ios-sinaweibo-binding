package com.robovm.bindings.weibo;

import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

import com.robovm.bindings.weibo.objects.WBMessageObject;

@NativeClass
public class WBSendMessageToWeiboRequest extends WBBaseRequest{
	
	/**
	 发送给微博客户端的消息
	 */
	@Property(selector = "setMessage:")
	public native void setMessage(WBMessageObject message);
	
	/**
	 返回一个 WBSendMessageToWeiboRequest 对象
	 @param message 需要发送给微博客户端程序的消息对象
	 @return 返回一个*自动释放的*WBSendMessageToWeiboRequest对象
	 */
	@Method(selector = "requestWithMessage:")
	public static native @Pointer long requestWithMessage(WBMessageObject message); 
	
}
