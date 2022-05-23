package com.zw.weiter.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 角色信息Vo
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@ApiModel("角色信息Vo")
public class SysRoleVo   {

	/** 角色ID */
	@ApiModelProperty("角色ID")
	private Long roleId;

	/** 角色名称 */
	@ApiModelProperty("角色名称")
	private String roleName;

	/** 角色权限 */
	@ApiModelProperty("角色权限")
	private String roleKey;

	/** 角色排序 */
	@ApiModelProperty("角色排序")
	private Integer roleSort;

	/** 数据范围（1.所有数据权限，2.自定义数据权限，3.本组织数据权限，4.本组织及以下数据权限，5.仅本人数据权限） */
	@ApiModelProperty("数据范围（1.所有数据权限，2.自定义数据权限，3.本组织数据权限，4.本组织及以下数据权限，5.仅本人数据权限）")
	private String dataScope;

	/** 菜单树选择项是否关联显示（0.父子不互相关联显示，1.父子互相关联显示） */
	@ApiModelProperty("菜单树选择项是否关联显示（0.父子不互相关联显示，1.父子互相关联显示）")
	private boolean menuCheckStrictly;

	/** 组织树选择项是否关联显示（0.父子不互相关联显示，1.父子互相关联显示） */
	@ApiModelProperty("组织树选择项是否关联显示（0.父子不互相关联显示，1.父子互相关联显示）")
	private boolean orgCheckStrictly;

	/** 角色状态（0.正常，1.停用） */
	@ApiModelProperty("角色状态（0.正常，1.停用）")
	private String status;

	/** 删除标志（0.存在，2.删除） */
	@ApiModelProperty("删除标志（0.存在，2.删除）")
	private String delFlag;

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

	/** 用户是否存在此角色标识 默认不存在 */
	@ApiModelProperty("用户是否存在此角色标识 默认不存在")
	private boolean flag = false;

	/** 菜单组 */
	@ApiModelProperty("菜单组")
	private Long[] menuIds;

	/** 组织组（数据权限） */
	@ApiModelProperty("组织组（数据权限）")
	private Long[] orgIds;

	public SysRoleVo() {
	}

	public SysRoleVo(Long roleId) {
		this.setRoleId(roleId);
	}

	public static boolean isAdmin(Long roleId) {
		return roleId != null && 1L == roleId;
	}

	public boolean isAdmin() {
		return isAdmin(this.getRoleId());
	}
}
