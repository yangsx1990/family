package com.family.base.functionInterface;

/**
 * @version V1.0
 * @author: yangsaixing
 * @date: 2021年11月29日 14时03分
 * @contact yangsaixing@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author panjing
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

    /** 状态码 */
    private int code;
    /** 错误信息 */
    private String message;
    /** 返回内容 */
    private Object data;

    private static ApiResponse result(ApiResponseCode apiResponseCode, Object data) {

        return new ApiResponse(apiResponseCode.getCode(), apiResponseCode.getMessage(), data);
    }

    public static ApiResponse success() {
        return result(ApiResponseCode.SUCCESS, null);
    }

    public static ApiResponse successAndReturn(Object data) {
        if(Objects.isNull(data)){
            return result(ApiResponseCode.INTERNAL_DATA_NOT_FOUND,data);
        }
        return result(ApiResponseCode.SUCCESS, data);
    }

    public static ApiResponse success(Object data) {
        return result(ApiResponseCode.SUCCESS, data);
    }

    public static ApiResponse fail() {
        return result(ApiResponseCode.FAIL, null);
    }

    public static ApiResponse fail(ApiResponseCode apiResponseCode) {
        if (apiResponseCode == null) {
            return result(ApiResponseCode.FAIL, null);
        } else {
            return new ApiResponse(apiResponseCode.getCode(), apiResponseCode.getMessage(), null);
        }
    }

}
