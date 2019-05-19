package com.fus.mapper;

import com.fus.entity.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.Map;

public interface UserInfoMapper extends Mapper<UserInfo> {
    UserInfo userCheck(Map<String, Object> map);
}
