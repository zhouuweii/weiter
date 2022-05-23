package com.zw.weiter.system.form.qery;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zw.weiter.common.core.web.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 登陆日志条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("登陆日志条件查询Form")
public class SysLoginInfoQueryForm extends PageForm {

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

	/** 开始时间检索 */
	@ApiModelProperty("开始时间检索")
	private String beginTime;

	/** 结束时间检索 */
	@ApiModelProperty("结束时间检索")
	private String endTime;
}
