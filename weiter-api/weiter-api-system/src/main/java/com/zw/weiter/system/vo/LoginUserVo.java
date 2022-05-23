package com.zw.weiter.system.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * 用户信息
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
public class LoginUserVo implements Serializable {

	/** 用户唯一标识 */
	@ApiModelProperty("用户唯一标识")
	private String token;

	/** 用户名id */
	@ApiModelProperty("用户名id")
	private Long userid;

	/** 用户名 */
	@ApiModelProperty("用户名")
	private String username;

	/** 登录时间 */
	@ApiModelProperty("登录时间")
	private Long loginTime;

	/** 过期时间 */
	@ApiModelProperty("过期时间")
	private Long expireTime;

	/** 登录IP地址 */
	@ApiModelProperty("登录IP地址")
	private String ipAddress;

	/** 权限列表 */
	@ApiModelProperty("权限列表")
	private Set<String> permissions;

	/** 角色列表 */
	@ApiModelProperty("角色列表")
	private Set<String> roles;

	/** 用户信息 */
	@ApiModelProperty("用户信息")
	private SysUserVo sysUserVo;
}