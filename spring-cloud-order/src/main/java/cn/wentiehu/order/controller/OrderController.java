package cn.wentiehu.order.controller;

import cn.wentiehu.order.feign.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author
 * @email tiehuwen@163.cwentiehuom
 * @date 2019/2/24 8:38
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private FeignInterface feignInterface;

    @RequestMapping("order")
    public String order() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://spring-cloud-member/member", String.class);
        String body = forEntity.getBody();
        return "订单服务调用会员服务,会员服务返回的信息:" + body;
    }

    @RequestMapping("orderFeign")
    public String orderFeign() {
        return "订单服务调用会员服务,会员服务返回的信息:" + feignInterface.member();
    }
}
