package com.zw.weiter.system.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zw.weiter.common.core.annotation.Xss;
import com.zw.weiter.common.core.constant.RegexConst;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * 用户信息Form
 * @Author: ZhouWei
 * @Date: 2021-11
 **/
@Data
@ApiModel("用户信息Form")
public class SysUserForm{

    /** 用户ID */
    @ApiModelProperty("用户ID")
    private Long userId;

    /** 组织ID */
    @ApiModelProperty("组织ID")
    private Long orgId;

    /** 用户账号 */
    @Xss(message = "用户账号不能包含脚本字符")
    @NotBlank(message = "用户账号不能为空")
    @Size(max = 30, message = "用户账号长度不能超过30个字符")
    @ApiModelProperty("用户账号")
    private String userName;

    /** 用户昵称 */
    @Xss(message = "用户昵称不能包含脚本字符")
    @Size(max = 30, message = "用户昵称长度不能超过30个字符")
    @ApiModelProperty("用户昵称")
    private String nickName;

    /** 用户邮箱 */
    @Pattern(regexp = RegexConst.PATTERN_IGNORE_EMPTY+RegexConst.EMAIL_REGEXP, message = "邮箱格式错误")
    @Email(message = "邮箱格式不正确")
    @Size(max = 50, message = "邮箱长度不能超过50个字符")
    @ApiModelProperty("用户邮箱")
    private String email;

    /** 手机号码 */
    @Size(max = 11, message = "手机号码长度不能超过11个字符")
    @ApiModelProperty("手机号码")
    private String phone;

    /** 用户性别（0.男，1.女，2.未知） */
    @ApiModelProperty("用户性别（0.男，1.女，2.未知）")
    private String sex;

    /** 用户头像 */
    @ApiModelProperty("用户头像")
    private String avatar;

    /** 密码 */
    @JsonProperty
    @ApiModelProperty("密码")
    private String password;

    /** 帐号状态（0.正常，1.停用） */
    @ApiModelProperty("帐号状态（0.正常，1.停用）")
    private String status;

    /** 删除标志（0.存在，2.删除） */
    @ApiModelProperty("删除标志（0.存在，2.删除）")
    private String delFlag;

    /** 最后登录IP */
    @ApiModelProperty("最后登录IP")
    private String loginIp;

    /** 最后登录时间 */
    @ApiModelProperty("最后登录时间")
    private Date loginDate;

    /** 备注 */
    @ApiModelProperty("备注")
    private String remark;

    /** 角色组 */
    @ApiModelProperty("角色组")
    private Long[] roleIds;

    /** 岗位组 */
    @ApiModelProperty("岗位组")
    private Long[] postIds;

    /** 角色ID */
    @ApiModelProperty("角色ID")
    private Long roleId;

    public SysUserForm() {
    }

    public SysUserForm(Long userId) {
        this.userId = userId;
    }

    public static boolean isAdmin(Long roleId) {
        return roleId != null && 1L == roleId;
    }

    public boolean isAdmin() {
        return isAdmin(this.getRoleId());
    }
}