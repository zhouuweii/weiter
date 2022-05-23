package com.zw.weiter.system.form;

import com.zw.weiter.common.core.annotation.Xss;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 通知公告Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
@ApiModel("通知公告Form")
public class SysNoticeForm {

	/** 公告ID */
	@ApiModelProperty("公告ID")
	private Long noticeId;

	/** 公告标题 */
	@Xss(message = "公告标题不能包含脚本字符")
	@NotBlank(message = "公告标题不能为空")
	@Size(max = 50, message = "公告标题不能超过50个字符")
	@ApiModelProperty("公告标题")
	private String noticeTitle;

	/** 公告类型（1.通知，2.公告） */
	@ApiModelProperty("公告类型（1.通知，2.公告）")
	private String noticeType;

	/** 公告内容 */
	@ApiModelProperty("公告内容")
	private String noticeContent;

	/** 公告状态（0.正常，1.关闭） */
	@ApiModelProperty("公告状态（0.正常，1.关闭）")
	private String status;

	/** 备注 */
	@ApiModelProperty("备注")
	private String remark;
}
