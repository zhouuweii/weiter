package com.zw.weiter.common.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应代码枚举
 * @Author: ZhouWei
 * @Date: 2021-11
 **/
@Getter
@AllArgsConstructor
public enum ResultEnum {

	/**响应代码枚举*/
	// 操作成功
	SUCCESS(200, "操作成功！"),

	// 业务异常
	BAD_REQUEST(4001, "错误请求！"),

	// 业务异常
	BUSINESS_ERROR(5001, "业务异常"),

	// 全局异常
	UNAUTHORIZED(6401, "没有权限访问，请联系管理员授权！"),
	REJECT_OPERATION_SUPER_ADMIN(6401, "不允许操作超级管理员角色!"),

	UNSUPPORTED_REQUEST_MODE(9801, "该请求方式不支持!"),
	INTERNAL_AUTHENTICATION_EXCEPTION(9802, "内部认证异常!"),
	DEMO_MODE_EXCEPTION(9803, "演示模式，不允许操作!"),

	REFUSE_REGISTER(9804, "当前系统没有开启注册功能！"),
	EXISTS_USER_NAME_FOR_REGISTER(9806, "用户 %s 已存在，请更换用户名注册！"),

	// 自定义异常
	CUSTOM_ERROR(9998, "描述：自定义响应提示信息"),

	// 通用错误
	SERVER_ERROR(9999, "抱歉，系统繁忙，请稍候重试！");

	/** 响应代码 */
	private final Integer code;

	/** 响应信息 */
	private final String message;

	public Integer code() {
		return this.code;
	}

	public String message() {
		return this.message;
	}

	public String format(Object... obj) {
		return String.format(this.message, obj);
	}
}