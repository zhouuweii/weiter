package com.zw.weiter.system.form.qery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 角色信息条件查询Form
 * @Author: ZhouWei
 * @Date: 2022-01
 **/
@Data
@ApiModel("角色信息条件查询Form")
public class SysRoleQueryForm{

	/** 角色ID */
	@ApiModelProperty("角色ID")
	private Long roleId;

	/** 角色名称 */
	@ApiModelProperty("角色名称")
	private String roleName;

	/** 角色权限 */
	@ApiModelProperty("角色权限")
	private String roleKey;

	/** 角色状态（0.正常，1.停用） */
	@ApiModelProperty("角色状态（0.正常，1.停用）")
	private String status;

	/** 开始时间检索 */
	@ApiModelProperty("开始时间检索")
	private String beginTime;

	/** 结束时间检索 */
	@ApiModelProperty("结束时间检索")
	private String endTime;

	/** 数据权限 */
	@ApiModelProperty("数据权限")
	private String dataScopeParam;
}
