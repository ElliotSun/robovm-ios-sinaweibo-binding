package com.robovm.bindings.weibo.objects;

import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class WBBaseMediaObject extends NSObject{

	/**
	 对象唯一ID，用于唯一标识一个多媒体内容	 
	 当第三方应用分享多媒体内容到微博时，应该将此参数设置为被分享的内容在自己的系统中的唯一标识
	 @warning 不能为空，长度小于255
	 */
	@Property(selector = "objectID")
	public native String getObjectID();	
	@Property(selector = "setObjectID:")
	public native void setObjectID(String id);
	
	/**
	 多媒体内容标题
	 @warning 不能为空且长度小于1k
	 */
	@Property(selector = "title")
	public native String getTitle();
	
	@Property(selector = "setTitle:")
	public native void setTitle(String title);
	
	/**
	 多媒体内容描述
	 @warning 长度小于1k
	 */
	@Property(selector = "description")
	public native String getDescription();
	
	@Property(selector = "setDescription:")
	public native void setDescription(String description);
	
	/**
	 多媒体内容缩略图
	 @warning 大小小于32k
	 */
	@Property(selector = "thumbnailData")
	public native NSData getThumbnailData();
	
	@Property(selector = "setThumbnailData:")
	public native void setThumbnailData(NSData data);
	
	/**
	 点击多媒体内容之后呼起第三方应用特定页面的scheme
	 @warning 长度小于255
	 */	
	@Property(selector = "scheme")
	public native String getScheme();
	
	@Property(selector = "setScheme:")
	public native void setScheme(String scheme);

	
	/**
	 返回一个 WBBaseMediaObject 对象	 
	 @return 返回一个*自动释放的*WBBaseMediaObject对象
	 */
	@Method(selector = "object")
	public static native @Pointer long object();
	
}
