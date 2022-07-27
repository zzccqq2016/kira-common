package org.kira.common.autoconfigure;

import org.kira.common.controller.CommonController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhang chaoqing
 * Create on 2022/7/27 AT 0:29
 */
@Configuration(
        proxyBeanMethods = false
)
public class CommonControllerAutoConfiguration {

    @Bean
    public CommonController commonController() {
        return new CommonController();
    }


}
