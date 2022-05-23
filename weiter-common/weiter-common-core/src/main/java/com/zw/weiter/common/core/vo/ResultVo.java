package com.zw.weiter.common.core.vo;

import com.zw.weiter.common.core.enums.ResultEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回结果类
 * @Author: ZhouWei
 * @Date: 2021-11
 **/
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 响应状态 */
    private Boolean success;

    /** 响应代码 */
    private Integer code;

    /** 响应信息 */
    private String message;

    /** 响应数据 */
    private T data;

    /**
     * 统一返回结果集
     * @param success 响应状态
     * @param code 响应代码
     * @param message 响应信息
     * @param data 响应数据
     **/
    private static <T> ResultVo<T> restResult(boolean success, Integer code, String message, T data) {
        ResultVo<T> apiResult = new ResultVo<>();
        apiResult.setSuccess(success);
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMessage(message);
        return apiResult;
    }

    /**
     * 返回成功消息
     * @return 统一返回结果集
     **/
    public static <T> ResultVo<T> success() {
        return restResult(Boolean.TRUE, ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), null);
    }

    /**
     * 返回成功消息
     * @param data 响应数据
     * @return 统一返回结果集
     **/
    public static <T> ResultVo<T> success(T data) {
        return restResult(Boolean.TRUE, ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    /**
     * 返回错误消息
     * @return 统一返回结果集
     **/
    public static <T> ResultVo<T> error() {
        return restResult(Boolean.FALSE, ResultEnum.SERVER_ERROR.getCode(), ResultEnum.SERVER_ERROR.getMessage(), null);
    }

    /**
     * 返回错误消息
     * @param message 响应信息
     * @return 统一返回结果集
     **/
    public static <T> ResultVo<T> error(String message) {
        return restResult(Boolean.FALSE, ResultEnum.CUSTOM_ERROR.getCode(), message, null);
    }

    /**
     * 返回错误消息
     * @param message 响应信息
     * @return 统一返回结果集
     **/
    public static <T> ResultVo<T> error(int code, String message) {
        return restResult(Boolean.FALSE, code, message, null);
    }

    /**
     * 返回错误消息
     * @param resultEnum 响应代码枚举
     * @return 统一返回结果集
     **/
    public static <T> ResultVo<T> error(ResultEnum resultEnum) {
        return restResult(Boolean.FALSE, resultEnum.getCode(), resultEnum.getMessage(), null);
    }
}