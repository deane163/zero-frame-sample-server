package com.xiaoshu.service.impl;

import com.xiaoshu.service.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
 * @Date : Create in 2018/10/20 16:02
 * <p/>
 * Copyright (C)2013-2018 小树盛凯科技 All rights reserved.
 */
@Service
public class CommonServiceImpl implements CommonService {
    private  final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String hello(String clientId) {
        logger.info("此处的目的是引入 ServiceImpl 的测试是否正常");
        return  clientId;
    }
}
