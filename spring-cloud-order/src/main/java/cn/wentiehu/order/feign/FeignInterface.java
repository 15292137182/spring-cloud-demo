package cn.wentiehu.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/2/27 16:14
 */
@FeignClient("spring-cloud-member")
public interface FeignInterface {


    @RequestMapping("member")
    String member();


}
