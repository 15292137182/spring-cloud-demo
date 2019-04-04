package cn.wentiehu.api.service;

import cn.wentiehu.common.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/3/10 14:43
 */
public interface IOrderService {
    //订单服务调用会员服务 feign
    @RequestMapping("/orderToMember")
    String orderToMember(String name);

    @RequestMapping("/orderToMemberUserInfo")
    ResponseResult orderToMemberUserInfo();
}
