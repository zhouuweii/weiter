package com.zw.weiter.system.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 字典类型Vo
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("字典类型Vo")
public class SysDictTypeVo {

	/** 字典主键 */
	@ApiModelProperty("字典主键")
	private Long dictId;

	/** 字典名称 */
	@ApiModelProperty("字典名称")
	private String dictName;

	/** 字典类型 */
	@ApiModelProperty("字典类型")
	private String dictType;

	/** 状态（0.正常，1.停用） */
	@ApiModelProperty("状态（0.正常，1.停用）")
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