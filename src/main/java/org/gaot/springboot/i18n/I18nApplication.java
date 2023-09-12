package org.gaot.springboot.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author gao tao
 * @date 2023/9/1
 */

@SpringBootApplication
public class I18nApplication implements ApplicationRunner {

    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(I18nApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(I18nHelper.message("WELCOME"));
        System.out.println(I18nHelper.message("SHABI"));
    }

}