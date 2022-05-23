package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zw.weiter.common.core.web.domain.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通知公告表 sys_notice
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_notice")
public class SysNoticeEntity extends CommonEntity {

	/** 公告ID */
	@TableId(value = "notice_id", type = IdType.AUTO)
	private Long noticeId;

	/** 公告标题 */
	private String noticeTitle;

	/** 公告类型（1.通知，2.公告） */
	private String noticeType;

	/** 公告内容 */
	private String noticeContent;

	/** 公告状态（0.正常，1.关闭） */
	private String status;
}
