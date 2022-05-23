package com.zw.weiter.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 岗位信息Vo
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@ApiModel("岗位信息Vo")
public class SysPostVo {

	/** 岗位序号 */
	@ApiModelProperty("岗位序号")
	private Long postId;

	/** 岗位编码 */
	@ApiModelProperty("岗位编码")
	private String postCode;

	/** 岗位名称 */
	@ApiModelProperty("岗位名称")
	private String postName;

	/** 显示顺序 */
	@ApiModelProperty("显示顺序")
	private String postSort;

	/** 状态（0正常 1停用） */
	@ApiModelProperty("状态（0正常 1停用）")
	private String status;

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
}