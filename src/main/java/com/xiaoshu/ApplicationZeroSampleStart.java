package com.xiaoshu;

import com.xiaoshu.config.AccessFilter;
import com.xiaoshu.config.NettyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;


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
 * @Description :
 * ---------------------------------
 * @Author : ubt.administrator
 * @Date : Create in 2018/10/20 13:53
 * <p/>
 * Copyright (C)2013-2018 小树盛凯科技 All rights reserved.
 */

@SpringBootApplication
public class ApplicationZeroSampleStart 
{

    public static void main( String[] args )
    {
    	System.out.println("================= start Application");
        SpringApplication.run(ApplicationZeroSampleStart.class, args);
    }

    /**
     * 字符拦截，使用UTF-8编码
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        registrationBean.setFilter(characterEncodingFilter);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    /**
     * cors 跨域请求配置信息
     * @return
     */
    @Bean
    public FilterRegistrationBean accessFilter() {
        FilterRegistrationBean frBean = new FilterRegistrationBean();
        frBean.setFilter(new AccessFilter());
        frBean.addUrlPatterns("/*");
        frBean.setOrder(Integer.MAX_VALUE);
        return frBean;
    }
}
