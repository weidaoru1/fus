package com.fus.controller.user;

import com.fus.common.util.MD5utils;
import com.fus.entity.UserInfo;
import com.fus.service.UserInfoService;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Resource UserInfoService userInfoService;
    @RequestMapping("/")
    public String loginNew(Model model, HttpServletRequest request)throws Exception{
        return "loginNew";
    }
    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request)throws Exception{
        return "loginNew";
    }
    @RequestMapping("/index")
    public String index()throws Exception{
        return "index";
    }
    @RequestMapping("/login/check")
    public @ResponseBody String check(HttpServletRequest request)throws Exception{
        JSONObject jsonObject = new JSONObject();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Map<String,Object> map = new HashMap<>();
        map.put("userName",userName);
        map.put("password",MD5utils.encrypt(password));
        UserInfo userInfo = userInfoService.userCheck(map);
        if (userInfo == null){
            request.getSession().setAttribute("user",userInfo);
            jsonObject.put("status",0);
            jsonObject.put("success",false);
            return jsonObject.toString();
        }
        jsonObject.put("status",1);
        jsonObject.put("success",true);
        return jsonObject.toString();
    }

}
