package com.zw.weiter.system.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TreeSelect树结构
 * @Author: ZhouWei
 * @Date: 2021-11
 */
@Data
@ApiModel("TreeSelect树结构")
public class TreeSelect implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 节点ID */
	@ApiModelProperty("节点ID")
	private Long id;

	/** 节点名称 */
	@ApiModelProperty("节点名称")
	private String label;

	/** 子节点 */
	@ApiModelProperty("子节点")
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<TreeSelect> children;

	public TreeSelect() {

	}

	public TreeSelect(SysOrgVo orgVo) {
		this.id = orgVo.getOrgId();
		this.label = orgVo.getOrgName();
		this.children = orgVo.getChildren().stream().map(TreeSelect::new).collect(Collectors.toList());
	}

	public TreeSelect(SysMenuVo menu) {
		this.id = menu.getMenuId();
		this.label = menu.getMenuName();
		this.children = menu.getChildren().stream().map(TreeSelect::new).collect(Collectors.toList());
	}
}