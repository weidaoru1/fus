package com.fus.generator.mapper;

import com.fus.generator.model.UserMaster;

public interface UserMasterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMaster record);

    int insertSelective(UserMaster record);

    UserMaster selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMaster record);

    int updateByPrimaryKey(UserMaster record);
}