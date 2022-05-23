package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zw.weiter.common.core.annotation.Excel;
import com.zw.weiter.common.core.annotation.Excel.ColumnType;
import com.zw.weiter.common.core.constant.UserConstants;
import com.zw.weiter.common.core.web.domain.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字典数据表 sys_dict_data
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_dict_data")
public class SysDictDataEntity extends CommonEntity {

	/** 字典编码 */
	@Excel(name = "字典编码", cellType = ColumnType.NUMERIC)
	@TableId(value = "dict_code", type = IdType.AUTO)
	private Long dictCode;

	/** 字典排序 */
	@Excel(name = "字典排序", cellType = ColumnType.NUMERIC)
	private Long dictSort;

	/** 字典标签 */
	@Excel(name = "字典标签")
	private String dictLabel;

	/** 字典键值 */
	@Excel(name = "字典键值")
	private String dictValue;

	/** 字典类型 */
	@Excel(name = "字典类型")
	private String dictType;

	/** 样式属性（其他样式扩展） */
	private String cssClass;

	/** 表格字典样式 */
	private String listClass;

	/** 是否默认（Y.是 N.否） */
	@Excel(name = "是否默认", readConverterExp = "Y=是,N=否")
	private String isDefault;

	/** 状态（0.正常 1.停用） */
	@Excel(name = "状态", readConverterExp = "0=正常,1=停用")
	private String status;

	public boolean getDefault() {
		return UserConstants.YES.equals(this.isDefault);
	}
}