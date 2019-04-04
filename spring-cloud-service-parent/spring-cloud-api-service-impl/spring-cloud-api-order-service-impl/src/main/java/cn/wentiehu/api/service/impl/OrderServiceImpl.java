package cn.wentiehu.api.service.impl;

import cn.wentiehu.api.entity.UserEntity;
import cn.wentiehu.api.feign.MemberServiceFeign;
import cn.wentiehu.api.service.IOrderService;
import cn.wentiehu.common.BaseApiService;
import cn.wentiehu.common.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/3/10 14:46
 */
@RestController
public class OrderServiceImpl extends BaseApiService implements IOrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @Override
    @RequestMapping("orderToMember")
    public String orderToMember(String name) {
        UserEntity member = memberServiceFeign.getMember(name);
        return member == null ? "没有用户信息" : member.toString();
    }

    /**
     * 服务治理
     *
     * @return
     */
    @Override
    @RequestMapping("orderToMemberUserInfo")
    public ResponseResult orderToMemberUserInfo() {
        return memberServiceFeign.getUserInfo();
    }
}
