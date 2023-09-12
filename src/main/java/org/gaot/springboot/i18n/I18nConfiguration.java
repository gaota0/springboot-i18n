package org.gaot.springboot.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

/**
 * @author gao tao
 * @date 2023/9/1
 */
//@Configuration
public class I18nConfiguration {


    @Bean
    public LocaleResolver localeResolver() {
        return new CookieLocaleResolver();
    }
}
