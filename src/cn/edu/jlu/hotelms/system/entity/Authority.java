package cn.edu.jlu.hotelms.system.entity;


import java.util.List;

import cn.edu.jlu.hotelms.common.entity.Page;


/**
 * 权限与角色的关系实体类
 * @author 李成
 *
 */
public class Authority {
	
	private Integer authorityId;//主键id
	private Integer roleId;//角色id 用于标志是哪一种角色
	private Integer menuId;//菜单id用于标志这个角色可以访问的菜单
	private Integer isDelete;//表示是否删除
	private Page page;  //用于分写插件
	private Role role;
	private List<Menu> menus;
	/*
	 *get set 方法
	 */
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Integer getauthorityId() {
		return authorityId;
	}
	public void setauthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}
	public Integer getroleId() {
		return roleId;
	}
	public void setroleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getmenuId() {
		return menuId;
	}
	public void setmenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	
}
