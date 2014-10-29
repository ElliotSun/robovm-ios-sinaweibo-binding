package com.robovm.bindings.weibo.objects;


import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class WBDataTransferObject extends NSObject {
	@Property(selector = "userInfo")
	public native NSDictionary<?,?> getUserInfo(); 
	
	@Property(selector = "userInfo:")
	public native void setUserInfo(NSDictionary<?,?> dictionary);
	
	@Property(selector = "sdkVersion")
	public native String getSdkVerstion();
	
	@Property(selector = "shouldOpenWeiboAppInstallPageIfNotInstalled")
	public native boolean isShouldOpenWeiboAppInstallPageIfNotInstalled();
	
	@Property(selector = "shouldOpenWeiboAppInstallPageIfNotInstalled:")
	public native void setShouldOpenWeiboAppInstallPageIfNotInstalled(boolean show);
	
	
}
