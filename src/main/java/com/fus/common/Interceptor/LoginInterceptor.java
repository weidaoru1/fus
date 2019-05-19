package com.fus.common.Interceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Set;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String basePath = request.getContextPath();
        String path = request.getRequestURI();
        if(!doLoginInterceptor(path, basePath) ){//是否进行登陆拦截
            return true;
        }
        System.out.printf("===:"+path);
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null){
            response.sendRedirect(request.getContextPath()+"login");
            return false;
        }
        return true;
    }
    /**
     * 是否进行登陆过滤
     * @param path
     * @param basePath
     * @return
     */
    private boolean doLoginInterceptor(String path,String basePath){
        path = path.substring(basePath.length());
        Set<String> notLoginPaths = new HashSet<>();
        notLoginPaths.add("/login");
        notLoginPaths.add("/js/**");
        notLoginPaths.add("/css/**");
        notLoginPaths.add("/fonts/**");
        notLoginPaths.add("/images/**");
        notLoginPaths.add("/login/check");
        if(notLoginPaths.contains(path)) return false;
        return true;
    }
}
