package com.zw.weiter.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 菜单权限Vo
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@ApiModel("菜单权限Vo")
public class SysMenuVo{

	/** 菜单ID */
	@ApiModelProperty("菜单ID")
	private Long menuId;

	/** 菜单名称 */
	@ApiModelProperty("菜单名称")
	private String menuName;

	/** 父菜单名称 */
	@ApiModelProperty("父菜单名称")
	private String parentName;

	/** 父菜单ID */
	@ApiModelProperty("父菜单ID")
	private Long parentId;

	/** 显示顺序 */
	@ApiModelProperty("显示顺序")
	private Integer orderNum;

	/** 路由地址 */
	@ApiModelProperty("路由地址")
	private String path;

	/** 组件路径 */
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
	@ApiModelProperty("类型（M目录 C菜单 F按钮）")
	private String menuType;

	/** 显示状态（0显示 1隐藏） */
	@ApiModelProperty("显示状态（0显示 1隐藏）")
	private String visible;

	/** 菜单状态（0显示 1隐藏） */
	@ApiModelProperty("菜单状态（0显示 1隐藏）")
	private String status;

	/** 权限字符串 */
	@ApiModelProperty("权限字符串")
	private String perms;

	/** 菜单图标 */
	@ApiModelProperty("菜单图标")
	private String icon;

	/** 备注 */
	@ApiModelProperty("备注")
	private String remark;

	/** 创建者 */
	@ApiModelProperty("创建者")
	private String createBy;

	/** 创建时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty("创建时间")
	private Date createTime;

	/** 更新者 */
	@ApiModelProperty("更新者")
	private String updateBy;

	/** 更新时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty("更新时间")
	private Date updateTime;

	/** 子菜单 */
	@ApiModelProperty("子菜单")
	private List<SysMenuVo> children = new ArrayList<>();
}
