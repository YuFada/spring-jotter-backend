package com.evan.wj.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author fada.yu
 * @date 2020/8/21 11:19
 * @Description：
 */

@Data
public class Result {
    private int code;
    private String message;
    private Object result;

    public Result(int code) {
        this.code = code;
    }
}
