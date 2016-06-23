package com.dmm.framework.dmm.common.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.dmm.framework.dmm.common.common.config.Global;
import com.dmm.framework.dmm.common.common.service.BaseService;

/**
 * 跨域请求拦截器
 */
public class CrossAccessInterceptor extends BaseService implements HandlerInterceptor {

    private static final boolean allowCrossAccess = Boolean.parseBoolean(Global.getConfig("allowCrossAccess"));

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //解决跨域请求时，触发回调函数
    	if (allowCrossAccess) {
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Headers",
                    "Origin,No-Cache,X-Requested-With,If-Modified-Since,Pragma,Last-Modified,Cache-Control,Expires,Content-Type,X-E4M-With");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Allow", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Access-Control-Max-Age", "60");
            // ajax 请求 会先发送 options 请求，此时不要作任何处理
            if ("options".equalsIgnoreCase(request.getMethod())){
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
    
    }
}
