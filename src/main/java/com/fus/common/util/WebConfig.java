package com.fus.common.util;

import com.fus.common.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * 不需要登录拦截的
     */
    //不拦截路径
    final String[] notLoginInterceptPaths = {"/login","/js/**","/css/**","/fonts/**","/images/**","/login/check"};
    //拦截路径
    final String[] loginInterceptPaths = {"/**"};
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(loginInterceptPaths).excludePathPatterns(notLoginInterceptPaths);
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}