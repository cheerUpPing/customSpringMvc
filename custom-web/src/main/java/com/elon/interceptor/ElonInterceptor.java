package com.elon.interceptor;


import com.elon.core.AbstractInterceptor;
import com.elon.core.anotation.AutoWire;
import com.elon.core.anotation.Interceptor;
import com.elon.service.impl.ElonService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 2017/2/20 16:29.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Interceptor(order = 1)
public class ElonInterceptor extends AbstractInterceptor {

    @AutoWire
    private ElonService elonService;

    public boolean handlerInterceptor(HttpServletRequest request, HttpServletResponse response) {
        elonService.sayHello("dddddd");
        System.out.println("类名：" + this.hashCode() + this.getClass().getName());
        return true;
    }
}
