package com.family.base.functionInterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author panjing
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ApiResponseCode {
    /**
     * 通用状态码 200：成功 负数：系统错误
     */
    SUCCESS(0, "请求成功"),
    FAIL(-1, "请求失败"),

    /**
     * 其他状态码，前两位为分类，后四位为该分类下的错误码内部错误
     * 内部错误：[100000, 200000)
     */
    INTERNAL_SERVICE_NOT_FOUND(100000, "未找到相应的平台处理类"),
    INTERNAL_CONFIG_NOT_FOUND(100001, "未找到相应的平台配置"),
    INTERNAL_AUTH_TOKEN_NOT_FOUND(100002, "未找到该商户的授权信息"),
    INTERNAL_REMOTE_CALL_ERROR(100003, "远程调用异常"),
    INTERNAL_NOT_SUPPORT_REFRESH_ERROR(100004, "该授权码无法刷新，请重新手动授权"),
    INTERNAL_AUTH_ERROR(100005, "授权过程出现问题，请联系工作人员"),
    INTERNAL_AUTH_CHECK_ILLEGAL(100006, "授权信息校验不合法"),
    INTERNAL_RDS_NOT_FOUND(100007, "无可用的RDS"),
    INTERNAL_CODE_CAN_NOT_EMPTY(100008, "缺少必要参数"),
    INTERNAL_REPEAT_AUTHORIZATION(100009, "重复授权"),
    INTERNAL_DATA_NOT_FOUND(101000, "未找到对应数据");

    /** 错误码 */
    private int code;
    /** 错误信息 */
    private String message;
}
