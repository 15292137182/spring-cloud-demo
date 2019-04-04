package cn.wentiehu.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/3/10 16:19
 */
@Data
@AllArgsConstructor
public class ResponseResult {

    private Integer code;
    private String msg;
    private Object data;

}
