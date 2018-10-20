package com.xiaoshu.config;

import com.xiaoshu.netty.NettyChannelMap;
import com.xiaoshu.netty.NettyServerBootstrap;
import com.xiaoshu.service.CommonService;
import com.yao.module.AskMsg;
import io.netty.channel.socket.SocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

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
 * @Date : Create in 2018/10/20 15:46
 * <p/>
 * Copyright (C)2013-2018 小树盛凯科技 All rights reserved.
 */
@Configuration
public class NettyServer {

    private static final Logger logger = LoggerFactory.getLogger(NettyServer.class);
    @Autowired
    private CommonService commonService;

    @Bean
    public NettyServerBootstrap nettyServerBootstrap() throws InterruptedException {
        NettyServerBootstrap bootstrap = new NettyServerBootstrap(9999, commonService);
        Thread thread = new Thread(bootstrap);
        thread.setDaemon(true);
        thread.start();
        return  bootstrap;
    }

}
