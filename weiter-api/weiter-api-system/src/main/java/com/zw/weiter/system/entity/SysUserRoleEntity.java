package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户和角色关联 sys_user_role
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@TableName("sys_user_role")
public class SysUserRoleEntity {

	/** 用户ID */
	@TableId(value = "user_id", type = IdType.AUTO)
	private Long userId;

	/** 角色ID */
	private Long roleId;
}