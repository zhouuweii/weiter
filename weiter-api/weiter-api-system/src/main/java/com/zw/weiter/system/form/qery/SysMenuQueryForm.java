package com.zw.weiter.system.form.qery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 菜单信息条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("菜单信息条件查询Form")
public class SysMenuQueryForm {

	/** 菜单名称 */
	@ApiModelProperty("菜单名称")
	private String menuName;

	/** 显示状态（0显示 1隐藏） */
	@ApiModelProperty("显示状态（0显示 1隐藏）")
	private String visible;

	/** 菜单状态（0显示 1隐藏） */
	@ApiModelProperty("菜单状态（0显示 1隐藏）")
	private String status;

	/** 用户ID */
	@ApiModelProperty("用户ID")
	private Long userId;
}
