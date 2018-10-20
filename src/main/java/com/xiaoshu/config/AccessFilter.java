package com.xiaoshu.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @Description :cors 配置文件信息
 * ---------------------------------
 * @Author : ubt.administrator
 * @Date : Create in 2018/10/20 13:58
 * <p/>
 * Copyright (C)2013-2018 小树盛凯科技 All rights reserved.
 */
public class AccessFilter extends HttpServlet implements Filter {


    private static final Logger logger = LoggerFactory.getLogger(AccessFilter.class);
    private static final long serialVersionUID = 1L;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("AccessFilter init cors configures:{}","http response configure");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setHeader("Access-Control-Max-Age", "1800");
        httpResponse.addHeader("Access-Control-Allow-Headers", "Origin, x-requested-with, Content-Type, Accept,X-Cookie, authorization, product");
        httpResponse.addHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.addHeader("Access-Control-Allow-Methods", "GET,POST,PUT,OPTIONS,DELETE");
        //这里通过判断请求的方法，判断此次是否是预检请求，如果是，立即返回一个204状态吗，标示，允许跨域；预检后，正式请求，这个方法参数就是我们设置的post了
        if (RequestMethod.OPTIONS.toString().equals(request.getMethod())){
            //HttpStatus.SC_NO_CONTENT = 204
            httpResponse.setStatus(HttpStatus.NO_CONTENT.value());
        }
        chain.doFilter(servletRequest, response);
    }
}