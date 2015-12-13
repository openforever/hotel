package cn.edu.jlu.hotelms.system.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.edu.jlu.hotelms.common.entity.Page;

/**
 * ��ʾ�˵�ʵ����
 * @author ���
 *
 */
public class Menu {
	private static final long serialVersionUID = 1L;  //�������к�
	private Integer menuId;//�˵���id ��ʾ������һ���˵�
	private String menuName;//�˵���
	private Integer fatherId;//�˵��ĸ���id
	private String url;//��ʾ�˵����ӵ�url
	private Date buildTime;//��ʾ����˵�������ʱ��
	private String remark;//��ʾ��������˵�������
	private Integer isDelete;//��ʾ�Ƿ�ɾ��
	
	private Menu parentMenu;
	private List<Menu> subMenu=new ArrayList<Menu>();
	
	
	private Page page;
	
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
	private boolean hasMenu = false;
	
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Integer getFatherId() {
		return fatherId;
	}
	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Date getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(Date buildTime) {
		this.buildTime = buildTime;
	}

	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	public Menu getParentMenu() {
		return parentMenu;
	}
	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}
	public List<Menu> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(List<Menu> subMenu) {
		this.subMenu = subMenu;
	}
	public boolean isHasMenu() {
		return hasMenu;
	}
	public void setHasMenu(boolean hasMenu) {
		this.hasMenu = hasMenu;
	}
}
