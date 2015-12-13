package cn.edu.jlu.hotelms.system.entity;

import java.io.Serializable;
import java.util.Date;

import cn.edu.jlu.hotelms.common.entity.Page;

/**
 * ��ʾ�û�ʵ����
 * @author ���
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;//��ʾ�������к�
	private Integer userId;//��ʾ�û���id
	private String loginname;//��ʾ�û��ĵ�¼������¼��Ψһ
	private String username;//��ʾ�û����ǳ�  �ǳƿ��������
	private String password;//��ʾ�û�������
	private Date registerTime;//��ʾ�û���ע��ʱ��
	private Date lastLogTime;//��ʾ�û����ϴε�¼ʱ��
	private Integer roleId;//��ʾ�û�������ɫ�Ľ�ɫid
	private Integer isDelete;//��ʾ�Ƿ�ɾ��
	
	private Role role;//��ʾ�û�������ɫ�Ľ�ɫʵ����
	private Page page;//��ҳ����

	
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public Date getLastLogTime() {
		return lastLogTime;
	}
	public void setLastLogTime(Date lastLogTime) {
		this.lastLogTime = lastLogTime;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


	public Page getPage() {
		if(page==null)
			page = new Page();
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
}
