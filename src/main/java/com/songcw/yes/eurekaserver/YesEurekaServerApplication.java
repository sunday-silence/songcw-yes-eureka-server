package com.songcw.yes.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-29 11:53
 */
@SpringBootApplication
@EnableEurekaServer
public class YesEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesEurekaServerApplication.class, args);
    }
}
