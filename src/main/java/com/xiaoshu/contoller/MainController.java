package com.xiaoshu.contoller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
@RestController
@RequestMapping(value = "/main")
public class MainController {

    private static final  Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping(value = "/status")
    public String getServerStatus(){
        logger.info("start get Server Status, on time is :{}", new Date());
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("code",100);
        resultMap.put("message","OK");

        return JSON.toJSONString(resultMap);
    }
}
