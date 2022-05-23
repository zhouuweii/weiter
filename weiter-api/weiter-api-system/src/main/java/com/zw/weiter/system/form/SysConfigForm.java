package com.zw.weiter.system.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 参数配置Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("参数配置Form")
public class SysConfigForm {

	/** 参数主键 */
	@ApiModelProperty("参数主键")
	private Long configId;

	/** 参数名称 */
	@NotBlank(message = "参数名称不能为空")
	@Size(max = 100, message = "参数名称不能超过100个字符")
	@ApiModelProperty("参数名称")
	private String configName;

	/** 参数键名 */
	@NotBlank(message = "参数键名长度不能为空")
	@Size(max = 100, message = "参数键名长度不能超过100个字符")
	@ApiModelProperty("参数键名")
	private String configKey;

	/** 参数键值 */
	@NotBlank(message = "参数键值不能为空")
	@Size(max = 500, message = "参数键值长度不能超过500个字符")
	@ApiModelProperty("参数键值")
	private String configValue;

	/** 系统内置（Y是 N否） */
	@ApiModelProperty("系统内置（Y是 N否）")
	private String configType;

	/** 备注 */
	@ApiModelProperty("备注")
	private String remark;
}