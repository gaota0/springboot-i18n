package org.gaot.springboot.i18n.component;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

/**
 * @author gao tao
 * @date 2023/9/4
 */
@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        Optional.of("t").map(request::getHeader).or(()->Optional.ofNullable(WebUtils.getCookie(request,"t")).map(Cookie::getValue)).ifPresent(t->{
            try {
                int userId = Integer.parseInt(t);
                AppContext.USER_ID.set(userId);
            } catch (Exception ignore) {
            }
        });
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        AppContext.USER_ID.remove();
    }
}
