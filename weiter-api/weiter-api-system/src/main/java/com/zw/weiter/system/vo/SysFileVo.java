package com.zw.weiter.system.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 文件信息Vo
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@ApiModel("文件信息Vo")
public class SysFileVo {

	/** 文件名称 */
	@ApiModelProperty("文件名称")
	private String name;

	/** 文件地址 */
	@ApiModelProperty("文件地址")
	private String url;
}