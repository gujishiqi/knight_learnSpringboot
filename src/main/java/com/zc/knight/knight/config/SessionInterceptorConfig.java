package com.zc.knight.knight.config;

import com.zc.knight.knight.Interceptor.SessionInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class SessionInterceptorConfig extends WebMvcConfigurerAdapter {

    @Bean
    SessionInterceptor myInterceptor() {
        return new SessionInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.print("注册");
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**").excludePathPatterns("/error/404");
        super.addInterceptors(registry);
    }
}
