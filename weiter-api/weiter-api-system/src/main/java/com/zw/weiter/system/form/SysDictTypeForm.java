package com.zw.weiter.system.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 字典类型Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("字典类型Form")
public class SysDictTypeForm {

	/** 字典主键 */
	@ApiModelProperty("字典主键")
	private Long dictId;

	/** 字典名称 */
	@NotBlank(message = "字典名称不能为空")
	@Size(max = 100, message = "字典类型名称长度不能超过100个字符")
	@ApiModelProperty("字典名称")
	private String dictName;

	/** 字典类型 */
	@NotBlank(message = "字典类型不能为空")
	@Size(max = 100, message = "字典类型类型长度不能超过100个字符")
	@Pattern(regexp = "^[a-z][a-z0-9_]*$", message = "字典类型必须以字母开头，且只能为（小写字母，数字，下滑线）")
	@ApiModelProperty("字典类型")
	private String dictType;

	/** 状态（0.正常，1.停用） */
	@ApiModelProperty("状态（0.正常，1.停用")
	private String status;

	/** 备注 */
	@ApiModelProperty("备注")
	private String remark;
}
