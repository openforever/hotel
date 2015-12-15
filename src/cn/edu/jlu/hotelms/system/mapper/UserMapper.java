package cn.edu.jlu.hotelms.system.mapper;

import java.util.List;
import java.util.Map;

import cn.edu.jlu.hotelms.common.annotation.MyBatisDao;
import cn.edu.jlu.hotelms.common.entity.Page;
import cn.edu.jlu.hotelms.system.entity.User;

/**
 * �����û������ݿ����
 * @author �Կ���
 *
 */
@MyBatisDao
public interface UserMapper  {
	/**
	 * �������ķ�ҳ���߽��з�ҳ��ѯ ���е�user����
	 * @param page
	 * @return
	 */
	public List<User> listPageUser(Page page);
	
	public List<User> listPageUserByCondition(Map<String, Object> map);
	
	/**
	 *<br>
	 * <b>���ܣ�</b>�г�û�з����ɫ���û� ����ҳ<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	List<User> listPageNoRole(Page page);
	/**
	 *<br>
	 * <b>���ܣ�</b>�г��Ѿ������ɫ���û� ����ҳ<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	List<User> listPageRole(Page page);
	/*
	 * �ȴ�����
	 */
	List<User> listAllUser();
	List<User> listPageUser(User user);
	
	
	/**
	 * �õ�һ��user�ľ��������Ϣ ���ݴ����user�����еĲ�ͬ����Ϣ
	 * @param user
	 * @return
	 */
	User getUserInfo(User user);
	
	/**
	 *  <br>
	 * <b>���ܣ�</b> ����userId�õ�User<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	User getUserById(Integer userId);
	int getCountByName(String loginname);
	int getCount(User user);
	/**
	 *  <br>
	 * <b>���ܣ�</b> ����userId�õ�User(��role)<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	User getUserAndRoleById(Integer userId);
	
	
	/**
	 * ����һ��user������ϴε�¼ʱ������ֶ�
	 * @param user
	 */
	void updateLastLogin(User user);
	
	/**
	 *<br>
	 * <b>���ܣ�</b>�����û�Id�����ɫ�����޸�<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param user
	 * 
	 */
	
	void updateUserRole(User user);
	
	
	
	
	/**
	 *  <br>
	 * <b>���ܣ�</b>����User<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-23<br>
	 **/
	void updateUser(User user);
	
	void updateUserBaseInfo(User user);
	
	void updateUserRights(User user);
	
	
	/**
	 *  <br>
	 * <b>���ܣ�</b>�����û���Ϣ<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-22<br>
	 * @param model
	 * @param roleId
	 * @param userName
	 * @param loginname
	 * @param password1
	 * @return
	 */
	void insertUser(User user);
	
	/**
	 *  <br>
	 * <b>���ܣ�</b> ɾ��ĳ���û�<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	void deleteUser(int userId);
	
	
	
	
}
