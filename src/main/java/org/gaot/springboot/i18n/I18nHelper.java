package org.gaot.springboot.i18n;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author gao tao
 * @date 2023/9/1
 */
@Component
public class I18nHelper implements InitializingBean {
    private static I18nHelper instance;
    @Resource
    private MessageSource messageSource;
    public static String message(String code, Object... args) {
        return instance.messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }

    @Override
    public void afterPropertiesSet() {
        instance = this;
    }
}
