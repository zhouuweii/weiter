package com.zw.weiter.system.form.qery;

import com.zw.weiter.common.core.web.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Size;

/**
 * 字典数据条件查询Form
 * @Author: ZhouWei
 * @Date: 2022-01
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("字典数据条件查询Form")
public class SysDictDataQueryForm extends PageForm {

	/** 字典标签 */
	@ApiModelProperty("字典标签")
	private String dictLabel;

	/** 字典类型 */
	@Size(max = 100, message = "字典类型长度不能超过100个字符")
	private String dictType;

	/** 状态（0.正常 1.停用） */
	@ApiModelProperty("状态（0.正常 1.停用）")
	private String status;
}
