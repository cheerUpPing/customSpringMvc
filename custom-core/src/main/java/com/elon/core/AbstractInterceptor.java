package com.elon.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 2017/2/15 9:13.
 * <p>
 * Email: cheerUpPing@163.com
 */
public abstract class AbstractInterceptor {

    private int order = 0;

    /**
     * 执行的拦截方法
     *
     * @param request
     * @param response
     * @return true 继续执行，false返回
     */
    public abstract boolean handlerInterceptor(HttpServletRequest request, HttpServletResponse response);

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
