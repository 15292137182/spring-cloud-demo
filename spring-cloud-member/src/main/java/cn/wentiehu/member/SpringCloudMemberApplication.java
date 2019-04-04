package cn.wentiehu.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//将当前服务注册到eureka 服务上
@EnableEurekaClient
public class SpringCloudMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMemberApplication.class, args);
    }

}
