package com.zw.weiter.system.form.qery;

import com.zw.weiter.common.core.web.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 参数配置条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("参数配置条件查询Form")
public class SysConfigQueryForm extends PageForm {

	/** 参数名称 */
	@ApiModelProperty("参数名称")
	private String configName;

	/** 参数键名 */
	@ApiModelProperty("参数键名")
	private String configKey;

	/** 系统内置（Y是 N否） */
	@ApiModelProperty("系统内置（Y是 N否）")
	private String configType;

	/** 开始时间检索 */
	@ApiModelProperty("开始时间检索")
	private String beginTime;

	/** 结束时间检索 */
	@ApiModelProperty("结束时间检索")
	private String endTime;
}
