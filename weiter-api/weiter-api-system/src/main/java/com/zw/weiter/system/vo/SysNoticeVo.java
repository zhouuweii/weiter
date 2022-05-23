package com.zw.weiter.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 通知公告Vo
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@ApiModel("通知公告Vo")
public class SysNoticeVo {

	/** 公告ID */
	@ApiModelProperty("公告ID")
	private Long noticeId;

	/** 公告标题 */
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
