package cn.wentiehu.eureka.colony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 集群部署eureka 服务 你中有我 我中有你
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerColonyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerColonyApplication.class, args);
    }

}

