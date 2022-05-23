package com.zw.weiter.system.form.qery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * 用户信息条件查询Form
 * @Author: ZhouWei
 * @Date: 2021-11
 **/
@Data
@ApiModel("用户信息条件查询Form")
public class SysUserQueryForm {

    /** 用户ID */
    @ApiModelProperty("用户ID")
    private Long userId;

    /** 用户账号 */
    @ApiModelProperty("用户账号")
    private String userName;

    /** 手机号码 */
    @Size(max = 11, message = "手机号码长度不能超过11个字符")
    @ApiModelProperty("手机号码")
    private String phone;

    /** 帐号状态（0.正常，1.停用） */
    @ApiModelProperty("帐号状态（0.正常，1.停用）")
    private String status;

    /** 开始时间检索 */
    @ApiModelProperty("开始时间检索")
    private String beginTime;

    /** 结束时间检索 */
    @ApiModelProperty("结束时间检索")
    private String endTime;

    /** 角色ID */
    @ApiModelProperty("角色ID")
    private Long roleId;

    /** 组织ID */
    @ApiModelProperty("组织ID")
    private Long orgId;

    /** 数据权限 */
    @ApiModelProperty("数据权限")
    private String dataScopeParam;

    public SysUserQueryForm() {
    }

    public SysUserQueryForm(Long userId) {
        this.userId = userId;
    }
}
