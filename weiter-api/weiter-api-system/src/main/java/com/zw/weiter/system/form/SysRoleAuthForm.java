package com.zw.weiter.system.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 角色批量选择用户授权Form
 * @Author: ZhouWei
 * @Date: 2022-03
 **/
@Data
@ApiModel("角色批量选择用户授权Form")
public class SysRoleAuthForm {

	/** 角色ID */
	@NotNull(message = "角色ID不能为空")
	@ApiModelProperty("角色ID")
	private Long roleId;

	/** 用户ID集合 */
	@NotEmpty(message = "用户ID集合不能为空")
	@ApiModelProperty("用户ID集合")
	private Long[] userIds;
}