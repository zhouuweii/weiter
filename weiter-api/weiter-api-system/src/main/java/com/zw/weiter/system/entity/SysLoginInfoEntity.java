package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zw.weiter.common.core.annotation.Excel;
import com.zw.weiter.common.core.annotation.Excel.ColumnType;
import lombok.Data;

import java.util.Date;

/**
 * 登陆日志 sys_login_info
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@TableName("sys_login_info")
public class SysLoginInfoEntity{

	/** 唯一标识 */
	@Excel(name = "序号", cellType = ColumnType.NUMERIC)
	@TableId(value = "info_id", type = IdType.AUTO)
	private Long infoId;

	/** 用户账号 */
	@Excel(name = "用户账号")
	private String userName;

	/** 登录IP地址 */
	@Excel(name = "登录IP地址")
	private String ipAddress;

	/** 状态（0.成功 1.失败） */
	@Excel(name = "状态", readConverterExp = "0=成功,1=失败")
	private String status;

	/** 提示信息 */
	@Excel(name = "提示信息")
	private String message;

	/** 访问时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Excel(name = "访问时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
	private Date accessTime;
}