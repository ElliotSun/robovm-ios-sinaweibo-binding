package com.robovm.bindings.weibo;

import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

/**
第三方应用向微博客户端请求认证的消息结构

第三方应用向微博客户端申请认证时，需要调用 [WeiboSDK sendRequest:] 函数， 向微博客户端发送一个 WBAuthorizeRequest 的消息结构。
微博客户端处理完后会向第三方应用发送一个结构为 WBAuthorizeResponse 的处理结果。
*/
@NativeClass
public class WBAuthorizeRequest extends WBBaseRequest{

	/**
	 微博开放平台第三方应用授权回调页地址，默认为`http://`
	
	 参考 http://open.weibo.com/wiki/%E6%8E%88%E6%9D%83%E6%9C%BA%E5%88%B6%E8%AF%B4%E6%98%8E#.E5.AE.A2.E6.88.B7.E7.AB.AF.E9.BB.98.E8.AE.A4.E5.9B.9E.E8.B0.83.E9.A1.B5
	 
	 @warning 必须保证和在微博开放平台应用管理界面配置的“授权回调页”地址一致，如未进行配置则默认为`http://`
	 @warning 不能为空，长度小于1K
	 */
	@Property(selector = "setRedirectURI:")
	public native void setRedirectURI(String redirectURI);
	
	/**
	 微博开放平台第三方应用scope，多个scrope用逗号分隔
	 
	 参考 http://open.weibo.com/wiki/%E6%8E%88%E6%9D%83%E6%9C%BA%E5%88%B6%E8%AF%B4%E6%98%8E#scope
	 
	 @warning 长度小于1K
	 */
	@Property(selector = "setScope:")
	public native void setScope(String scope);
	
}
