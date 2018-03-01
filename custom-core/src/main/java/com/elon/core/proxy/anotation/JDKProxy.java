package com.elon.core.proxy.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 2017/2/22 16:50.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface JDKProxy {

    int callBackVal() default 0;//关联回调函数

    String name() default "";//proxy名字

}
