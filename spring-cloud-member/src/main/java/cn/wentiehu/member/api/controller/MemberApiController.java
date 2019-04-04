package cn.wentiehu.member.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/2/23 23:07
 */
@RestController
public class MemberApiController {
    @Value("${server.port}")
    private String serverPort;


    @RequestMapping("member")
    public String member() {
        return "member service 端口号:" + serverPort;
    }
}
