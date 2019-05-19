package com.fus.service.impl;
import com.fus.entity.UserInfo;
import com.fus.mapper.UserInfoMapper;
import com.fus.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public int addUserInfo(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public UserInfo userCheck(Map<String, Object> map) {
        UserInfo userInfo = userInfoMapper.userCheck(map);
        return userInfo;
    }
}
