package org.gaot.springboot.i18n.component;

/**
 * @author gao tao
 * @date 2023/9/4
 */
public class AppContext {
    public static final ThreadLocal<Integer> USER_ID = new ThreadLocal<>();
}

