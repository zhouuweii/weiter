package com.zw.weiter.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zw.weiter.common.core.annotation.Sensitive;
import com.zw.weiter.common.core.enums.SensitiveTypeEnum;
import com.zw.weiter.system.entity.SysOrgEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 用户信息
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
public class SysUserVo{

	/** 用户ID */
	@ApiModelProperty("用户ID")
	private Long userId;

	/** 组织ID */
	@ApiModelProperty("组织ID")
	private Long orgId;

	/** 用户账号 */
	@ApiModelProperty("用户账号")
	private String userName;

	/** 用户昵称 */
	@ApiModelProperty("用户昵称")
	private String nickName;

	/** 用户邮箱 */
	@Sensitive(type=SensitiveTypeEnum.EMAIL)
	@ApiModelProperty("用户邮箱")
	private String email;

	/** 手机号码 */
	@Sensitive(type=SensitiveTypeEnum.MOBILE_PHONE)
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

	/** 创建者 */
	@ApiModelProperty("创建者")
	private String createBy;

	/** 创建时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty("创建时间")
	private Date createTime;

	/** 更新者 */
	@ApiModelProperty("更新者")
	private String updateBy;

	/** 更新时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty("更新时间")
	private Date updateTime;

	/** 密码盐加密 */
	@ApiModelProperty("密码盐加密")
	private String salt;

	/** 组织对象 */
	@ApiModelProperty("组织对象")
	private SysOrgEntity org;

	/** 角色对象 */
	@ApiModelProperty("角色对象")
	private List<SysRoleVo> roles;

	/** 组织名称 */
	@ApiModelProperty("组织名称")
	private String orgName;

	/** 角色组 */
	@ApiModelProperty("角色组")
	private Long[] roleIds;

	/** 岗位组 */
	@ApiModelProperty("岗位组")
	private Long[] postIds;

	/** 角色ID */
	@ApiModelProperty("角色ID")
	private Long roleId;

	public SysUserVo() {
	}

	public SysUserVo(Long userId) {
		this.setUserId(userId);
	}

	public boolean isAdmin() {
		return isAdmin(this.getUserId());
	}

	public static boolean isAdmin(Long userId) {
		return userId != null && 1L == userId;
	}
}
