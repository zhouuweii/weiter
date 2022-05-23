package com.zw.weiter.system.form.qery;

import com.zw.weiter.common.core.web.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字典类型条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("字典类型条件查询Form")
public class SysDictTypeQueryForm extends PageForm {

	/** 字典名称 */
	@ApiModelProperty("字典名称")
	private String dictName;

	/** 字典类型 */
	@ApiModelProperty("字典类型")
	private String dictType;

	/** 状态（0.正常，1.停用） */
	@ApiModelProperty("状态（0.正常，1.停用")
	private String status;

	/** 开始时间检索 */
	@ApiModelProperty("开始时间检索")
	private String beginTime;

	/** 结束时间检索 */
	@ApiModelProperty("结束时间检索")
	private String endTime;
}
