package com.hichat.web.service;

import com.hichat.common.pojo.UserExample;
import com.hichat.common.util.QueryData;
import com.hichat.common.util.ReturnResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


@Component
public class HystrixUserHandler implements UserService{

    @Override
    public ReturnResult getUserList(@RequestBody QueryData<UserExample> queryData) {
        return ReturnResult.build(400,"系统异常");
    }

}
