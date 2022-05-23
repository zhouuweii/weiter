package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zw.weiter.common.core.web.domain.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 组织表 sys_org
 * @Author: ZhouWei
 * @Date: 2021-11
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_org")
public class SysOrgEntity extends CommonEntity {

	/** 组织ID */
	@TableId(value = "org_id", type = IdType.AUTO)
	private Long orgId;

	/** 组织名称 */
	private String orgName;

	/** 父组织ID */
	private Long parentId;

	/** 父组织ID集合 */
	private String parentIds;

	/** 显示顺序 */
	private Integer orderNum;

	/** 负责人 */
	private String leader;

	/** 联系电话 */
	private String phone;

	/** 邮箱 */
	private String email;

	/** 组织状态（0.正常，1.停用） */
	private String status;

	/** 删除标志（0.存在，2.删除） */
	private String delFlag;
}