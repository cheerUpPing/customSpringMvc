package com.elon.core.proxy.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 2017/2/22 17:49.
 * <p>
 * Email: cheerUpPing@163.com
 *
 * 异常通知 标记
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ThrowingAdvice {

    int callBackVal() default 0;//关联回调函数

}
