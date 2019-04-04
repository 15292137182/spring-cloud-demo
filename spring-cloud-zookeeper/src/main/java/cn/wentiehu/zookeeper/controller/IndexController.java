package cn.wentiehu.zookeeper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/2/24 12:41
 */
@RestController
public class IndexController {
    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
