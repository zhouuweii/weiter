package com.zw.weiter.system.form.qery;

import com.zw.weiter.common.core.web.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通知公告条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("通知公告条件查询Form")
public class SysNoticeQueryForm extends PageForm {

	/** 公告标题 */
	@ApiModelProperty("公告标题")
	private String noticeTitle;

	/** 公告类型（1.通知，2.公告） */
	@ApiModelProperty("公告类型（1.通知，2.公告）")
	private String noticeType;

	/** 创建者 */
	@ApiModelProperty("创建者")
	private String createBy;
}
