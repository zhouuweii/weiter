package com.zw.weiter.system.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 操作日志Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("操作日志Form")
public class SysOperationLogForm {

	/** 日志主键 */
	@ApiModelProperty("日志主键")
	private Long operId;

	/** 操作模块 */
	@ApiModelProperty("操作模块")
	private String title;

	/** 业务类型（0.其它，1.新增，2.修改，3.删除，4.授权，5.导出，6.导入，7.强退，8.生成代码，9.清空数据） */
	@ApiModelProperty("业务类型（0.其它，1.新增，2.修改，3.删除，4.授权，5.导出，6.导入，7.强退，8.生成代码，9.清空数据）")
	private Integer businessType;

	/** 业务类型数组 */
	@ApiModelProperty("业务类型数组")
	private Integer[] businessTypes;

	/** 请求方法 */
	@ApiModelProperty("请求方法")
	private String method;

	/** 请求方式 */
	@ApiModelProperty("请求方式")
	private String requestMethod;

	/** 操作类别（0.其它 1.后台用户 2.手机端用户） */
	@ApiModelProperty("操作类别（0.其它 1.后台用户 2.手机端用户）")
	private Integer operatorType;

	/** 操作人员 */
	@ApiModelProperty("操作人员")
	private String operName;

	/** 组织名称 */
	@ApiModelProperty("组织名称")
	private String orgName;

	/** 请求url */
	@ApiModelProperty("请求url")
	private String operUrl;

	/** 操作地址 */
	@ApiModelProperty("操作地址")
	private String operIp;

	/** 请求参数 */
	@ApiModelProperty("请求参数")
	private String operParam;

	/** 返回参数 */
	@ApiModelProperty("返回参数")
	private String jsonResult;

	/** 操作状态（0.正常 1.异常） */
	@ApiModelProperty("操作状态（0.正常 1.异常）")
	private Integer status;

	/** 错误消息 */
	@ApiModelProperty("错误消息")
	private String errorMsg;

	/** 操作时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty("操作时间")
	private Date operTime;
}