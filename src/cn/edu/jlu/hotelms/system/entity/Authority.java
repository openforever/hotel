package cn.edu.jlu.hotelms.system.entity;


import java.util.List;

import cn.edu.jlu.hotelms.common.entity.Page;


/**
 * Ȩ�����ɫ�Ĺ�ϵʵ����
 * @author ���
 *
 */
public class Authority {
	
	private Integer authorityId;//����id
	private Integer roleId;//��ɫid ���ڱ�־����һ�ֽ�ɫ
	private Integer menuId;//�˵�id���ڱ�־�����ɫ���Է��ʵĲ˵�
	private Integer isDelete;//��ʾ�Ƿ�ɾ��
	private Page page;  //���ڷ�д���
	private Role role;
	private List<Menu> menus;
	/*
	 *get set ����
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
