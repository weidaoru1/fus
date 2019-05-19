package com.fus.service;
import com.fus.entity.UserInfo;

import java.util.Map;

public interface UserInfoService {
    int addUserInfo(UserInfo userInfo);
    UserInfo userCheck(Map<String, Object> map);
}
