package com.zw.weiter.system.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 角色信息Form
 * @Author: ZhouWei
 * @Date: 2021-11
 **/
@Data
@ApiModel("角色信息Form")
public class SysRoleForm{

	/** 角色ID */
	@ApiModelProperty("角色ID")
	private Long roleId;

	/** 角色名称 */
	@NotBlank(message = "角色名称不能为空")
	@Size(max = 30, message = "角色名称长度不能超过30个字符")
	@ApiModelProperty("角色名称")
	private String roleName;

	/** 角色权限 */
	@NotBlank(message = "权限字符不能为空")
	@Size(max = 100, message = "权限字符长度不能超过100个字符")
	@ApiModelProperty("角色权限")
	private String roleKey;

	/** 角色排序 */
	@NotNull(message = "显示顺序不能为空")
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

	/** 菜单组 */
	@ApiModelProperty("菜单组")
	private Long[] menuIds;

	/** 组织组（数据权限） */
	@ApiModelProperty("组织组（数据权限）")
	private Long[] orgIds;

	public SysRoleForm() {
	}

	public SysRoleForm(Long roleId) {
		this.roleId = roleId;
	}
}
