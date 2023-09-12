package org.gaot.springboot.i18n.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * @author gao tao
 * @date 2023/9/4
 */
@Service
public class UserService {
    public Locale userLocale(Integer userId) {
        return userId == 9527 ? Locale.US : Locale.CHINA;
    }
}
