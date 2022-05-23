package com.zw.weiter.system.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 字典数据Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("字典数据Form")
public class SysDictDataForm{

	/** 字典编码 */
	@ApiModelProperty("字典编码")
	private Long dictCode;

	/** 字典排序 */
	@ApiModelProperty("字典排序")
	private Long dictSort;

	/** 字典标签 */
	@NotBlank(message = "字典标签不能为空")
	@Size(max = 100, message = "字典标签长度不能超过100个字符")
	@ApiModelProperty("字典标签")
	private String dictLabel;

	/** 字典键值 */
	@NotBlank(message = "字典键值不能为空")
	@Size(max = 100, message = "字典键值长度不能超过100个字符")
	@ApiModelProperty("字典键值")
	private String dictValue;

	/** 字典类型 */
	@NotBlank(message = "字典类型不能为空")
	@Size(max = 100, message = "字典类型长度不能超过100个字符")
	@ApiModelProperty("字典类型")
	private String dictType;

	/** 样式属性（其他样式扩展） */
	@Size(max = 100, message = "样式属性长度不能超过100个字符")
	@ApiModelProperty("样式属性（其他样式扩展）")
	private String cssClass;

	/** 表格字典样式 */
	@ApiModelProperty("表格字典样式")
	private String listClass;

	/** 是否默认（Y.是 N.否） */
	@ApiModelProperty("是否默认（Y.是 N.否）")
	private String isDefault;

	/** 状态（0.正常 1.停用） */
	@ApiModelProperty("状态（0.正常 1.停用）")
	private String status;

	/** 备注 */
	@ApiModelProperty("备注")
	private String remark;
}