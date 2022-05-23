package com.zw.weiter.system.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 字典数据Vo
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("字典数据Vo")
public class SysDictDataVo {

	/** 字典编码 */
	@ApiModelProperty("字典编码")
	private Long dictCode;

	/** 字典排序 */
	@ApiModelProperty("字典排序")
	private Long dictSort;

	/** 字典标签 */
	@ApiModelProperty("字典标签")
	private String dictLabel;

	/** 字典键值 */
	@ApiModelProperty("字典键值")
	private String dictValue;

	/** 字典类型 */
	@ApiModelProperty("字典类型")
	private String dictType;

	/** 样式属性（其他样式扩展） */
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

	/** 创建者 */
	@ApiModelProperty("创建者")
	private String createBy;

	/** 创建时间 */
	@ApiModelProperty("创建时间")
	private Date createTime;

	/** 更新者 */
	@ApiModelProperty("更新者")
	private String updateBy;

	/** 更新时间 */
	@ApiModelProperty("更新时间")
	private Date updateTime;
}