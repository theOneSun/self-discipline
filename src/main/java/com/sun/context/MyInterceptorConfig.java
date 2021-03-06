package com.sun.context;

import com.sun.interceptor.IpInterceptor;
import com.sun.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author sunjian.
 */
@Configuration
public class MyInterceptorConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addInterceptors(final InterceptorRegistry registry)
    {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new IpInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
