package cn.edu.jlu.hotelms.system.service;

import java.util.List;

import cn.edu.jlu.hotelms.common.entity.Page;
import cn.edu.jlu.hotelms.system.entity.User;

/**
 * �����û���service����
 * @author ���
 *
 */
public interface UserService {
	/**
	 *  <br>
	 * <b>���ܣ�</b>����page ���ص�ǰҳ�����е�user<br>
	 * <b>���ߣ�</b>���<br>
	 * <b>���ڣ�</b> 2014-11-16 <br>
	 * �о����е�����˵�
	 * ����page ���ص�ǰҳ�����е�user
	 * @param page
	 * @return
	 */
	public List<User> listPageUser(Page page);
	
	/**
	 *  <br>
	 * <b>���ܣ�</b>����������ѯ���ҷ�ҳ<br>
	 * <b>���ߣ�</b>���<br>
	 * <b>���ڣ�</b> 2014-11-29 <br>
	 * 
	 * ����condition ���ص�ǰҳ�����е�user
	 * @param page
	 * @return
	 */
	public List<User> listPageUserByCondition(Page page,String condition);
	
	
	/*
	 * �ȴ�����
	 */
	/**
	 *  <br>
	 * <b>���ܣ�</b> ����userId�õ�User<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	User getUserById(Integer userId);
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
	void insertUser(User user,Integer roleId,String userName,String loginname, String password1);
	
	boolean insertUser(User user);
	/**
	 *  <br>
	 * <b>���ܣ�</b>����User<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-23<br>
	 **/
	void updateUser(User user, String username, String loginname, String newpassword1);
	/**
	 <br>
	 * <b>���ܣ�</b>�����û�Id�����ɫ�����޸�<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param userId
	 * @param roleId
	 */
	void updateUserRole(int userId , int roleId);
	/**
	 *<br>
	 * <b>���ܣ�</b>�г�û�з����ɫ���û� ����ҳ<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	public List<User> listPageNoRole(Page page);
	/**
	 *<br>
	 * <b>���ܣ�</b>�г��Ѿ������ɫ���û� ����ҳ<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	public List<User> listPageRole(Page page);
	User getUserByNameAndPwd(String username,String password);
	
	void updateUserBaseInfo(User user);
	
	void updateUserRights(User user);
	
	/**
	 *  <br>
	 * <b>���ܣ�</b> ɾ��ĳ���û�<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	void deleteUser(int userId);
	
	List<User> listPageUser(User user);
	
	void updateLastLogin(User user);
	
	User getUserAndRoleById(Integer userId);
	
	List<User> listAllUser();
}
