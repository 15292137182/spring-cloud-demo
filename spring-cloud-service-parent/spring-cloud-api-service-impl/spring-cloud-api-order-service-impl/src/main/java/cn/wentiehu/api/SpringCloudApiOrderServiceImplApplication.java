package cn.wentiehu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudApiOrderServiceImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApiOrderServiceImplApplication.class, args);
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello1";
    }
}
