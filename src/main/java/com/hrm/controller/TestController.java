package com.hrm.controller;

import com.hrm.entity.UserFieldHistoryEntity;
import com.hrm.service.UserFieldHistoryService;
import com.hrm.vo.test.TestGetStatusVo;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;

@Controller("tests")
@Produces(MediaType.APPLICATION_JSON)
public class TestController {

    @Inject
    private UserFieldHistoryService userFieldHistoryService;

    @Get("/status")
    public TestGetStatusVo getStatus() {
        TestGetStatusVo testGetStatusVo = new TestGetStatusVo();
        testGetStatusVo.setStatus("ok");
        return testGetStatusVo;
    }

    @Get("/aaa")
    public Iterable<UserFieldHistoryEntity> getAaa() {
        return userFieldHistoryService.findAll();
    }

}
