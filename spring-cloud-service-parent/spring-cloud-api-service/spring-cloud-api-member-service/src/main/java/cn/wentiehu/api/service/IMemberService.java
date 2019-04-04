package cn.wentiehu.api.service;

import cn.wentiehu.api.entity.UserEntity;
import cn.wentiehu.common.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/3/10 10:27
 */
public interface IMemberService {

    @RequestMapping("/getMember")
    UserEntity getMember(@RequestParam("name") String name);

    @RequestMapping("/getUserInfo")
    ResponseResult getUserInfo();

}
