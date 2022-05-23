package com.zw.weiter.system.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 登陆日志Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("登陆日志Form")
public class SysLoginInfoForm {

	/** 唯一标识 */
	@ApiModelProperty("唯一标识")
	private Long infoId;

	/** 用户账号 */
	@ApiModelProperty("用户账号")
	private String userName;

	/** 登录IP地址 */
	@ApiModelProperty("登录IP地址")
	private String ipAddress;

	/** 状态（0.成功 1.失败） */
	@ApiModelProperty("状态（0.成功 1.失败）")
	private String status;

	/** 提示信息 */
	@ApiModelProperty("提示信息")
	private String message;

	/** 访问时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty("访问时间")
	private Date accessTime;
}