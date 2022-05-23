package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 角色和组织关联 sys_role_org
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@TableName("sys_role_org")
public class SysRoleDeptEntity {

	/** 角色ID */
	@TableId(value = "role_id", type = IdType.AUTO)
	private Long roleId;

	/** 组织ID */
	private Long orgId;
}
