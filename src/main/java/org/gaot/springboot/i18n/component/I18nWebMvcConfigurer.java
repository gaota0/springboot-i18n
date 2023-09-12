package org.gaot.springboot.i18n.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author gaot
 * @date 2022/6/2
 */
//@Component
public class I18nWebMvcConfigurer implements WebMvcConfigurer {
    @Autowired
    private I18nInterceptor i18nInterceptor;
    @Autowired
    private AuthInterceptor authInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor).order(-1024);
        registry.addInterceptor(i18nInterceptor).order(2048);
    }
}
