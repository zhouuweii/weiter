package com.zw.weiter.system.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 菜单信息Form
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@ApiModel("菜单信息Form")
public class SysMenuForm{

	/** 菜单ID */
	@ApiModelProperty("菜单ID")
	private Long menuId;

	/** 菜单名称 */
	@NotBlank(message = "菜单名称不能为空")
	@Size(max = 50, message = "菜单名称长度不能超过50个字符")
	@ApiModelProperty("菜单名称")
	private String menuName;

	/** 父菜单名称 */
	@ApiModelProperty("父菜单名称")
	private String parentName;

	/** 父菜单ID */
	@ApiModelProperty("父菜单ID")
	private Long parentId;

	/** 显示顺序 */
	@NotNull(message = "显示顺序不能为空")
	@ApiModelProperty("显示顺序")
	private Integer orderNum;

	/** 路由地址 */
	@Size(max = 200, message = "路由地址不能超过200个字符")
	@ApiModelProperty("路由地址")
	private String path;

	/** 组件路径 */
	@Size(max = 200, message = "组件路径不能超过255个字符")
	@ApiModelProperty("组件路径")
	private String component;

	/** 路由参数 */
	@ApiModelProperty("路由参数")
	private String query;

	/** 是否为外链（0是 1否） */
	@ApiModelProperty("是否为外链（0是 1否）")
	private String isFrame;

	/** 是否缓存（0缓存 1不缓存） */
	@ApiModelProperty("是否缓存（0缓存 1不缓存）")
	private String isCache;

	/** 类型（M目录 C菜单 F按钮） */
	@NotBlank(message = "菜单类型不能为空")
	@ApiModelProperty("类型（M目录 C菜单 F按钮）")
	private String menuType;

	/** 显示状态（0显示 1隐藏） */
	@ApiModelProperty("显示状态（0显示 1隐藏）")
	private String visible;

	/** 菜单状态（0显示 1隐藏） */
	@ApiModelProperty("菜单状态（0显示 1隐藏）")
	private String status;

	/** 权限字符串 */
	@Size(max = 100, message = "权限标识长度不能超过100个字符")
	@ApiModelProperty("权限字符串")
	private String perms;

	/** 菜单图标 */
	@ApiModelProperty("菜单图标")
	private String icon;

	/** 备注 */
	@ApiModelProperty("备注")
	private String remark;
}
