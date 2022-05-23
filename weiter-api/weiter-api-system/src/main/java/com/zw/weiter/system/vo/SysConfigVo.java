package com.zw.weiter.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 参数配置Vo
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("参数配置Vo")
public class SysConfigVo {

	/** 参数主键 */
	@ApiModelProperty("参数主键")
	private Long configId;

	/** 参数名称 */
	@ApiModelProperty("参数名称")
	private String configName;

	/** 参数键名 */
	@ApiModelProperty("参数键名")
	private String configKey;

	/** 参数键值 */
	@ApiModelProperty("参数键值")
	private String configValue;

	/** 系统内置（Y是 N否） */
	@ApiModelProperty("系统内置（Y是 N否）")
	private String configType;

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