package com.robovm.bindings.weibo;

import org.robovm.apple.foundation.NSDate;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

/**
微博客户端处理完第三方应用的认证申请后向第三方应用回送的处理结果

WBAuthorizeResponse 结构中仅包含常用的 userID 、accessToken 和 expirationDate 信息，其他的认证信息（比如部分应用可以获取的 refresh_token 信息）会统一存放到 userInfo 中
*/
@NativeClass
public class WBAuthorizeResponse extends WBBaseResponse{
	/**
	 用户ID
	 */
	@Property(selector = "userID")
	public native String getUserID();
	
	/**
	 认证口令
	 */
	@Property(selector = "accessToken")
	public native String getAccessToken();
	
	/**
	 认证过期时间
	 */
	@Property(selector = "expirationDate")
	public native NSDate getExpirationDate();
	
}
