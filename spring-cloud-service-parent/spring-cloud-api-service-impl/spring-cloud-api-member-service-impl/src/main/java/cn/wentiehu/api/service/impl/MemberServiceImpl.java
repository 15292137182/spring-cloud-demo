package cn.wentiehu.api.service.impl;

import cn.wentiehu.api.entity.UserEntity;
import cn.wentiehu.api.service.IMemberService;
import cn.wentiehu.common.BaseApiService;
import cn.wentiehu.common.ResponseResult;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/3/10 10:39
 */
@RestController
public class MemberServiceImpl extends BaseApiService implements IMemberService {

    @Override
    @RequestMapping("/getMember")
    public UserEntity getMember(@RequestParam("name") String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(RandomUtils.nextInt(30));
        return userEntity;
    }

    @Override
    @RequestMapping("getUserInfo")
    public ResponseResult getUserInfo() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return setResultSuccess("订单服务调用会员服务成功");
    }
}
