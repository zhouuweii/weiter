package com.zw.weiter.system.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 岗位信息Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("岗位信息Form")
public class SysPostForm{

	/** 岗位序号 */
	@ApiModelProperty("岗位序号")
	private Long postId;

	/** 岗位编码 */
	@NotBlank(message = "岗位编码不能为空")
	@Size(max = 64, message = "岗位编码长度不能超过64个字符")
	@ApiModelProperty("岗位编码")
	private String postCode;

	/** 岗位名称 */
	@NotBlank(message = "岗位名称不能为空")
	@Size(max = 50, message = "岗位名称长度不能超过50个字符")
	@ApiModelProperty("岗位名称")
	private String postName;

	/** 显示顺序 */
	@NotBlank(message = "显示顺序不能为空")
	@ApiModelProperty("显示顺序")
	private Integer postSort;

	/** 状态（0正常 1停用） */
	@ApiModelProperty("状态（0正常 1停用）")
	private String status;

	/** 备注 */
	@ApiModelProperty("备注")
	private String remark;
}
