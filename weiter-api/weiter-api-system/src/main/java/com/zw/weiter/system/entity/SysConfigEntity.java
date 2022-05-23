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
 * 参数配置表 sys_config
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_config")
public class SysConfigEntity extends CommonEntity {

	/** 参数主键 */
	@Excel(name = "参数主键", cellType = ColumnType.NUMERIC)
	@TableId(value = "config_id", type = IdType.AUTO)
	private Long configId;

	/** 参数名称 */
	@Excel(name = "参数名称")
	private String configName;

	/** 参数键名 */
	@Excel(name = "参数键名")
	private String configKey;

	/** 参数键值 */
	@Excel(name = "参数键值")
	private String configValue;

	/** 系统内置（Y是 N否） */
	@Excel(name = "系统内置", readConverterExp = "Y=是,N=否")
	private String configType;
}