package cn.wentiehu.common;

import org.springframework.stereotype.Component;

/**
 * @author wentiehu
 * @email tiehuwen@163.com
 * @date 2019/3/10 16:22
 */
@Component
public class BaseApiService {

    public ResponseResult setResultError(Integer code, String msg) {
        return setResult(code, msg, null);
    }

    public ResponseResult setResultError(String msg) {
        return setResult(500, msg, null);
    }

    public ResponseResult setResultSuccess(String msg) {
        return setResult(200, msg, null);
    }
    public ResponseResult setResultSuccess(Object data) {
        return setResult(200, "操作成功", data);
    }

    public ResponseResult setResultSuccess() {
        return setResult(200, "操作成功", null);
    }

    private ResponseResult setResult(Integer code, String msg, Object data) {
        return new ResponseResult(code, msg, data);
    }

}
