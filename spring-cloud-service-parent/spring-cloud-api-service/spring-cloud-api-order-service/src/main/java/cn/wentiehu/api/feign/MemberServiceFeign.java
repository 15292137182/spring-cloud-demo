package cn.wentiehu.api.feign;

import cn.wentiehu.api.service.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/3/10 14:51
 */
@FeignClient("spring-cloud-api-member-impl")
public interface MemberServiceFeign extends IMemberService {

}
