package cn.edu.jlu.hotelms.system.entity;

import cn.edu.jlu.hotelms.common.entity.Page;


/**
 * ��ɫʵ����
 * @author ���
 *
 */
public class Role {
	private static final long serialVersionUID = 1L;//��·���к�
	private Integer roleId;//��ʾ��ɫid
	private String roleName;//��ʾ��ɫ����
	private String describle;//��ʾ���ڽ�ɫ������
	private Integer isDelete;//��ʾ�Ƿ�ɾ��
	
	private Page page;//��ҳ����
	
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescrible() {
		return describle;
	}
	public void setDescrible(String describle) {
		this.describle = describle;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}

	
}
