package com.elon.core.proxy.advice;

import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 2017/2/22 17:55.
 * <p>
 * Email: cheerUpPing@163.com
 */
public interface Advice {

    /**
     * 发送通知
     */
    void doAdvice(Object obj, Method method, Object[] args, MethodProxy proxy);

}
