package com.zw.weiter.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zw.weiter.common.core.annotation.Excel;
import com.zw.weiter.common.core.web.domain.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户表 sys_user
 * @Author: ZhouWei
 * @Date: 2021-11
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_user")
public class SysUserEntity extends CommonEntity {

    /** 用户ID */
    @Excel(name = "用户序号", cellType = Excel.ColumnType.NUMERIC, prompt = "用户编号")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /** 组织ID */
    @Excel(name = "组织编号", type = Excel.Type.IMPORT)
    private Long orgId;

    /** 用户账号 */
    @Excel(name = "登录名称")
    private String userName;

    /** 用户昵称 */
    @Excel(name = "用户名称")
    private String nickName;

    /** 用户邮箱 */
    @Excel(name = "用户邮箱")
    private String email;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phone;

    /** 用户性别（0.男，1.女，2.未知） */
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 用户头像 */
    private String avatar;

    /** 密码 */
    @JsonProperty
    private String password;

    /** 帐号状态（0.正常，1.停用） */
    @Excel(name = "帐号状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0.存在，2.删除） */
    private String delFlag;

    /** 最后登录IP */
    @Excel(name = "最后登录IP", type = Excel.Type.EXPORT)
    private String loginIp;

    /** 最后登录时间 */
    @Excel(name = "最后登录时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date loginDate;
}