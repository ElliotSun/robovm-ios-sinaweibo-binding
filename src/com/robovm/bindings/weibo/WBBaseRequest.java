package com.robovm.bindings.weibo;

import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.Pointer;

import com.robovm.bindings.weibo.objects.WBDataTransferObject;

@NativeClass
public class WBBaseRequest extends WBDataTransferObject{
	@Method(selector = "request")
	public static native @Pointer long request();
}
