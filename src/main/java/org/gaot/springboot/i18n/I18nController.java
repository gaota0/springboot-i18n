package org.gaot.springboot.i18n;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author gao tao
 * @date 2023/9/1
 */
@RestController
public class I18nController {
    @GetMapping("welcome")
    public String welcome() {
        return I18nHelper.message("WELCOME");
    }

    @GetMapping("time")
    public String time() {
        return I18nHelper.message("TIME",new Date(),10);
    }
}

