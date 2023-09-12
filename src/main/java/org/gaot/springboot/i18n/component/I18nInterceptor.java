package org.gaot.springboot.i18n.component;

import org.gaot.springboot.i18n.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.i18n.SimpleLocaleContext;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
import java.util.Objects;

/**
 * @author gao tao
 * @date 2023/9/4
 */
@Component
public class I18nInterceptor implements HandlerInterceptor {
    @Autowired
    private UserService userService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        Integer userId = AppContext.USER_ID.get();
        if (Objects.nonNull(userId)) {
            Locale locale = userService.userLocale(userId);
            LocaleContextHolder.setLocaleContext(new SimpleLocaleContext(locale));
        }
        return true;
    }
}
