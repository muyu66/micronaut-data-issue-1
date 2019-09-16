package com.hrm.dao;

import com.hrm.entity.UserFieldHistoryEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UserFieldHistoryDao extends CrudRepository<UserFieldHistoryEntity, String> {

}
