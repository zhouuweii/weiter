package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zw.weiter.common.core.annotation.Excel;
import com.zw.weiter.common.core.web.domain.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色表 sys_role
 * @Author: ZhouWei
 * @Date: 2021-11
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_role")
public class SysRoleEntity extends CommonEntity {

	/** 角色ID */
	@Excel(name = "角色序号", cellType = Excel.ColumnType.NUMERIC)
	@TableId(value = "role_id", type = IdType.AUTO)
	private Long roleId;

	/** 角色名称 */
	@Excel(name = "角色名称")
	private String roleName;

	/** 角色权限 */
	@Excel(name = "角色权限")
	private String roleKey;

	/** 角色排序 */
	@Excel(name = "角色排序")
	private Integer roleSort;

	/** 数据范围（1.所有数据权限，2.自定义数据权限，3.本组织数据权限，4.本组织及以下数据权限，5.仅本人数据权限） */
	@Excel(name = "数据范围", readConverterExp = "1=所有数据权限,2=自定义数据权限,3=本组织数据权限,4=本组织及以下数据权限,5=仅本人数据权限")
	private String dataScope;

	/** 菜单树选择项是否关联显示（0.父子不互相关联显示，1.父子互相关联显示） */
	private boolean menuCheckStrictly;

	/** 组织树选择项是否关联显示（0.父子不互相关联显示，1.父子互相关联显示） */
	private boolean orgCheckStrictly;

	/** 角色状态（0.正常，1.停用） */
	@Excel(name = "角色状态", readConverterExp = "0=正常,1=停用")
	private String status;

	/** 删除标志（0.存在，2.删除） */
	private String delFlag;

	public static boolean isAdmin(Long roleId) {
		return roleId != null && 1L == roleId;
	}

	public boolean isAdmin() {
		return isAdmin(this.getRoleId());
	}
}
