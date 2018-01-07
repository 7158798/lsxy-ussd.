package com.lsxy.ussd;

import com.lsxy.framework.web.web.AbstractSpringBootWebStarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by tandy on 16/11/9.
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableWebMvc
public class MainClass extends AbstractSpringBootWebStarter {
    public static final String systemId = "ussd.api";

    static {
        System.setProperty("systemId",systemId);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainClass.class, args);
    }

    @Override
    public String systemId() {
        return systemId;
    }
}
