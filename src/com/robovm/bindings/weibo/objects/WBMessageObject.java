package com.robovm.bindings.weibo.objects;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class WBMessageObject extends NSObject{

	@Property(selector = "setText:")
	public native void setText(String text);
	
	@Property(selector = "setMediaObject:")
	public native void setMediaObject(WBBaseMediaObject mediaObject);
	
	@Method(selector = "message")
	public static native @Pointer long message(); 

}
