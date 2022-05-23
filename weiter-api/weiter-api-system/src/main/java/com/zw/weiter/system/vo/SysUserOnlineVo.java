package com.zw.weiter.system.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 在线用户
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("在线用户Vo")
public class SysUserOnlineVo {

	/** 会话编号 */
	@ApiModelProperty("会话编号")
	private String tokenId;

	/** 用户名称 */
	@ApiModelProperty("用户名称")
	private String userName;

	/** 登录IP地址 */
	@ApiModelProperty("登录IP地址")
	private String ipAddress;

	/** 登录地址 */
	@ApiModelProperty("登录地址")
	private String loginLocation;

	/** 浏览器类型 */
	@ApiModelProperty("浏览器类型")
	private String browser;

	/** 操作系统 */
	@ApiModelProperty("操作系统")
	private String os;

	/** 登录时间 */
	@ApiModelProperty("登录时间")
	private Long loginTime;
}