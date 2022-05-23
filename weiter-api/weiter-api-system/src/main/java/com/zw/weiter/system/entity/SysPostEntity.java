package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zw.weiter.common.core.annotation.Excel;
import com.zw.weiter.common.core.annotation.Excel.ColumnType;
import com.zw.weiter.common.core.web.domain.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 岗位信息表 sys_post
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_post")
public class SysPostEntity extends CommonEntity {

	/** 岗位序号 */
	@Excel(name = "岗位序号", cellType = ColumnType.NUMERIC)
	@TableId(value = "post_id", type = IdType.AUTO)
	private Long postId;

	/** 岗位编码 */
	@Excel(name = "岗位编码")
	private String postCode;

	/** 岗位名称 */
	@Excel(name = "岗位名称")
	private String postName;

	/** 显示顺序 */
	@Excel(name = "显示顺序")
	private String postSort;

	/** 状态（0正常 1停用） */
	@Excel(name = "状态", readConverterExp = "0=正常,1=停用")
	private String status;
}