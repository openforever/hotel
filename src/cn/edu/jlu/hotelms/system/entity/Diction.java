package cn.edu.jlu.hotelms.system.entity;

import java.util.Date;
import java.util.List;

/**
 * �ֵ�ʵ��
 * @author ���
 *
 */
public class Diction {
	private int dictionId;//id
	private String childId;//����id
	private String fatherId;//����id
	private String dictionName;//�ֵ���
	private String describle;//����
	private Date buildTime;//����ʱ��
	private int isDelete;//�Ƿ�ɾ��
	
	
	private List<Diction> subDiction;//�����ֵ�
	private Diction fatherDiction;//�����ֵ�ֵ
	
	public List<Diction> getSubDiction() {
		return subDiction;
	}
	public void setSubDiction(List<Diction> subDiction) {
		this.subDiction = subDiction;
	}
	public Diction getFatherDiction() {
		return fatherDiction;
	}
	public void setFatherDiction(Diction fatherDiction) {
		this.fatherDiction = fatherDiction;
	}
	public int getDictionId() {
		return dictionId;
	}
	public void setDictionId(int dictionId) {
		this.dictionId = dictionId;
	}
	public String getChildId() {
		return childId;
	}
	public void setChildId(String childId) {
		this.childId = childId;
	}
	public String getFatherId() {
		return fatherId;
	}
	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}
	public String getDictionName() {
		return dictionName;
	}
	public void setDictionName(String dictionName) {
		this.dictionName = dictionName;
	}
	public String getDescrible() {
		return describle;
	}
	public void setDescrible(String describle) {
		this.describle = describle;
	}
	public Date getBuildTime() {
		return buildTime;
	}
	public void setBuildTime(Date buildTime) {
		this.buildTime = buildTime;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	
	
}
