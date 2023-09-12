package org.gaot.springboot.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author gao tao
 * @date 2023/9/1
 */
@RestController
public class LocaleController {
    @Autowired
    private LocaleResolver localeResolver;
    @Autowired
    private WebProperties webProperties;
    @GetMapping("locale")
    public String locale(HttpServletRequest request, HttpServletResponse response, @RequestParam String locale) {
        Locale newLocale;
        switch (locale) {
            case "en" -> newLocale = new Locale(locale, "US");
            case "zh" -> newLocale = new Locale(locale, "CN");
            default -> newLocale = webProperties.getLocale();
        }
        localeResolver.setLocale(request, response, newLocale);
        return "ok";
    }
}

