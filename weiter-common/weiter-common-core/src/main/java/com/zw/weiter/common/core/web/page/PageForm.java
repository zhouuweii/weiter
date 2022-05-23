package com.zw.weiter.common.core.web.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 分页PageForm
 * @Author: ZhouWei
 * @Date: 2021-12
 **/
@Data
@ApiModel("分页PageForm")
public class PageForm {

	/** 当前页 */
	@ApiModelProperty("当前页")
	private Integer pageNum = 1;

	/** 页面大小 */
	@ApiModelProperty("页面大小")
	private Integer pageSize = 10;
}