package com.zw.weiter.common.core.web.domain;

import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 通用Entity
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@Data
public class CommonEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 备注 */
	private String remark;

	/** 创建者 */
	private String createBy;

	/** 创建时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/** 更新者 */
	private String updateBy;

	/** 更新时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 设置创建信息
	 * @param createBy 创建用户
	 **/
	public void setCreateMessage(String createBy) {
		this.createBy = createBy;
		this.createTime = DateUtil.date();
	}

	/**
	 * 设置更新信息
	 * @param updateBy 更新用户
	 **/
	public void setUpdateMessage(String updateBy) {
		this.updateBy = updateBy;
		this.updateTime = DateUtil.date();
	}
}