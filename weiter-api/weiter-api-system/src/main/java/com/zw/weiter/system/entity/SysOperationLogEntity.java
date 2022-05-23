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
 * 操作日志表 sys_operation_log
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@TableName("sys_operation_log")
public class SysOperationLogEntity {

	/** 日志主键 */
	@Excel(name = "操作序号", cellType = ColumnType.NUMERIC)
	@TableId(value = "oper_id", type = IdType.AUTO)
	private Long operId;

	/** 操作模块 */
	@Excel(name = "操作模块")
	private String title;

	/** 业务类型（0.其它，1.新增，2.修改，3.删除，4.授权，5.导出，6.导入，7.强退，8.生成代码，9.清空数据） */
	@Excel(name = "业务类型", readConverterExp = "0=其它,1=新增,2=修改,3=删除,4=授权,5=导出,6=导入,7=强退,8=生成代码,9=清空数据")
	private Integer businessType;

	/** 请求方法 */
	@Excel(name = "请求方法")
	private String method;

	/** 请求方式 */
	@Excel(name = "请求方式")
	private String requestMethod;

	/** 操作类别（0.其它 1.后台用户 2.手机端用户） */
	@Excel(name = "操作类别", readConverterExp = "0=其它,1=后台用户,2=手机端用户")
	private Integer operatorType;

	/** 操作人员 */
	@Excel(name = "操作人员")
	private String operName;

	/** 组织名称 */
	@Excel(name = "组织名称")
	private String orgName;

	/** 请求url */
	@Excel(name = "请求地址")
	private String operUrl;

	/** 操作地址 */
	@Excel(name = "操作地址")
	private String operIp;

	/** 请求参数 */
	@Excel(name = "请求参数")
	private String operParam;

	/** 返回参数 */
	@Excel(name = "返回参数")
	private String jsonResult;

	/** 操作状态（0.正常 1.异常） */
	@Excel(name = "状态", readConverterExp = "0=正常,1=异常")
	private Integer status;

	/** 错误消息 */
	@Excel(name = "错误消息")
	private String errorMsg;

	/** 操作时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
	private Date operTime;
}