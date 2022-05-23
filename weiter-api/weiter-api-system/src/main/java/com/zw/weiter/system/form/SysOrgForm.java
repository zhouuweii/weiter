package com.zw.weiter.system.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 组织信息Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("组织信息Form")
public class SysOrgForm {

	/** 组织ID */
	@ApiModelProperty("组织ID")
	private Long orgId;

	/** 组织名称 */
	@NotBlank(message = "组织名称不能为空")
	@Size(max = 30, message = "组织名称长度不能超过30个字符")
	@ApiModelProperty("组织名称")
	private String orgName;

	/** 父组织ID */
	@ApiModelProperty("父组织ID")
	private Long parentId;

	/** 显示顺序 */
	@NotNull(message = "显示顺序不能为空")
	@ApiModelProperty("显示顺序")
	private Integer orderNum;

	/** 负责人 */
	@ApiModelProperty("负责人")
	private String leader;

	/** 联系电话 */
	@Size(max = 11, message = "联系电话长度不能超过11个字符")
	@ApiModelProperty("联系电话")
	private String phone;

	/** 邮箱 */
	@Email(message = "邮箱格式不正确")
	@Size(max = 50, message = "邮箱长度不能超过50个字符")
	@ApiModelProperty("邮箱")
	private String email;

	/** 组织状态（0.正常，1.停用） */
	@ApiModelProperty("组织状态（0.正常，1.停用）")
	private String status;

	/** 删除标志（0.存在，2.删除） */
	@ApiModelProperty("删除标志（0.存在，2.删除）")
	private String delFlag;

	/** 备注 */
	@ApiModelProperty("备注")
	private String remark;
}
