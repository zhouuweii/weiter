package com.zw.weiter.system.form.qery;

import com.zw.weiter.common.core.web.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 岗位信息条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("岗位信息条件查询Form")
public class SysPostQueryForm extends PageForm {

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

	/** 状态（0正常 1停用） */
	@ApiModelProperty("状态（0正常 1停用）")
	private String status;
}
