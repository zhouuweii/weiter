package com.zw.weiter.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 组织信息
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("组织信息Vo")
public class SysOrgVo {

	/** 组织ID */
	@ApiModelProperty("组织ID")
	private Long orgId;

	/** 组织名称 */
	@ApiModelProperty("组织名称")
	private String orgName;

	/** 父组织ID */
	@ApiModelProperty("父组织ID")
	private Long parentId;

	/** 父组织ID集合 */
	@ApiModelProperty("父组织ID集合")
	private String parentIds;

	/** 显示顺序 */
	@ApiModelProperty("显示顺序")
	private Integer orderNum;

	/** 负责人 */
	@ApiModelProperty("负责人")
	private String leader;

	/** 联系电话 */
	@ApiModelProperty("联系电话")
	private String phone;

	/** 邮箱 */
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

	/** 创建者 */
	@ApiModelProperty("创建者")
	private String createBy;

	/** 创建时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty("创建时间")
	private Date createTime;

	/** 更新者 */
	@ApiModelProperty("更新者")
	private String updateBy;

	/** 更新时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty("更新时间")
	private Date updateTime;

	/** 子组织 */
	@ApiModelProperty("子组织")
	private List<SysOrgVo> children = new ArrayList<>();
}