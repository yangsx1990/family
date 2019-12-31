package com.family;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/12/30 上午10:48
 * @modified By:
 */
public class WebServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
