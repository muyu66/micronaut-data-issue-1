package com.hrm.service;

import com.hrm.dao.UserFieldHistoryDao;
import com.hrm.entity.UserFieldHistoryEntity;
import com.hrm.vo.test.TestGetStatusVo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserFieldHistoryService {

    @Inject
    private UserFieldHistoryDao userFieldHistoryDao;

    public TestGetStatusVo getStatus() {
        TestGetStatusVo testGetStatusVo = new TestGetStatusVo();
        testGetStatusVo.setStatus("ok");
        return testGetStatusVo;
    }

    public Iterable<UserFieldHistoryEntity> findAll() {
        // --- 测试 ---
        UserFieldHistoryEntity userFieldHistoryEntity = new UserFieldHistoryEntity();
        userFieldHistoryEntity.setName("hahaha");
        userFieldHistoryDao.save(userFieldHistoryEntity);
        // --- 测试 ---

        return userFieldHistoryDao.findAll();
    }

}
