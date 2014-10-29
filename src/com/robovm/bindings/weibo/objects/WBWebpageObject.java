package com.robovm.bindings.weibo.objects;

import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class WBWebpageObject extends WBBaseMediaObject{

	/**
	 网页的url地址
	 
	 @warning 不能为空且长度不能超过255
	 */
	@Property(selector = "webpageUrl")
	public native String webpageUrl();
	@Property(selector = "setWebpageUrl:")
	public native void setWebpageUrl(String webpageUrl);

}
