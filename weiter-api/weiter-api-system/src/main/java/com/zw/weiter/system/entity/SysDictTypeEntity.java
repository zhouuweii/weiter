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
 * 字典类型表 sys_dict_type
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_dict_type")
public class SysDictTypeEntity extends CommonEntity {

	/** 字典主键 */
	@Excel(name = "字典主键", cellType = ColumnType.NUMERIC)
	@TableId(value="dict_id",type = IdType.AUTO)
	private Long dictId;

	/** 字典名称 */
	@Excel(name = "字典名称")
	private String dictName;

	/** 字典类型 */
	@Excel(name = "字典类型")
	private String dictType;

	/** 状态（0.正常，1.停用） */
	@Excel(name = "状态", readConverterExp = "0=正常,1=停用")
	private String status;
}