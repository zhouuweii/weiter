package com.zw.weiter.system.form.qery;

import com.zw.weiter.common.core.web.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 操作日志条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("操作日志条件查询Form")
public class SysOperationLogQueryForm extends PageForm {

	/** 操作模块 */
	@ApiModelProperty("操作模块")
	private String title;

	/** 业务类型（0.其它，1.新增，2.修改，3.删除，4.授权，5.导出，6.导入，7.强退，8.生成代码，9.清空数据） */
	@ApiModelProperty("业务类型（0.其它，1.新增，2.修改，3.删除，4.授权，5.导出，6.导入，7.强退，8.生成代码，9.清空数据）")
	private Integer businessType;

	/** 业务类型数组 */
	@ApiModelProperty("业务类型数组")
	private Integer[] businessTypes;

	/** 操作人员 */
	@ApiModelProperty("操作人员")
	private String operName;

	/** 操作状态（0.正常 1.异常） */
	@ApiModelProperty("操作状态（0.正常 1.异常）")
	private Integer status;

	/** 开始时间检索 */
	@ApiModelProperty("开始时间检索")
	private String beginTime;

	/** 结束时间检索 */
	@ApiModelProperty("结束时间检索")
	private String endTime;
}
