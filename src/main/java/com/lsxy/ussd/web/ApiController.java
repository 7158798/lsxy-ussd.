package com.lsxy.ussd.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by tandy on 16/11/11.
 */
@RestController
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping("/hello")
    public Callable<String> hello(String name){

        logger.info("hello:" + name);
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                TimeUnit.SECONDS.sleep(21);
                logger.info("hello2:" + name);
                return "hello:" + name;
            }
        };

    }

    @RequestMapping("/hello2")
    public String hello2(String name){
        logger.info("hello:" + name);
        try {
            TimeUnit.SECONDS.sleep(21);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello:" + name;
    }
}
