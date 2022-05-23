package com.zw.weiter.system.form.qery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 组织信息条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("组织信息条件查询Form")
public class SysOrgQueryForm{

	/** 组织ID */
	@ApiModelProperty("组织ID")
	private Long orgId;

	/** 组织名称 */
	@ApiModelProperty("组织名称")
	private String orgName;

	/** 父组织ID */
	@ApiModelProperty("父组织ID")
	private Long parentId;

	/** 组织状态（0.正常，1.停用） */
	@ApiModelProperty("组织状态（0.正常，1.停用）")
	private String status;

	/** 数据权限 */
	private String dataScopeParam;
}
