package cn.edu.jlu.hotelms.system.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.jlu.hotelms.base.service.BaseService;
import cn.edu.jlu.hotelms.common.entity.Page;
import cn.edu.jlu.hotelms.system.entity.User;
import cn.edu.jlu.hotelms.system.mapper.UserMapper;
import cn.edu.jlu.hotelms.system.service.UserService;

/**
 * ����service ������ʵ��
 * @author ���
 *
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
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
	public List<User> listPageUser(User user){
		return userMapper.listPageUser(user);
	}
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
	public List<User> listPageUserByCondition(Page page,String condition){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("condition", condition);
		return userMapper.listPageUserByCondition(map);
	}
	
public List<User> listAllUser() {
		
		return userMapper.listAllUser();
	}
	/**
	 *  <br>
	 * <b>���ܣ�</b>�������ķ�ҳ���߽��з�ҳ��ѯ ���е�user����<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-26<br>
	  * @param page
	 * @return
	 */
	public List<User> listPageUser(Page page) {		
		return userMapper.listPageUser(page);
	}
	/**
	 *<br>
	 * <b>���ܣ�</b>�г�û�з����ɫ���û� ����ҳ<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	public List<User> listPageNoRole(Page page) {
		return userMapper.listPageNoRole(page);
	}
	/**
	 *<br>
	 * <b>���ܣ�</b>�г��Ѿ������ɫ���û� ����ҳ<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	public List<User> listPageRole(Page page) {
		return userMapper.listPageRole(page);
	}
	
	
	public User getUserById(Integer userId) {
		return userMapper.getUserById(userId);
	}

	public User getUserByNameAndPwd(String loginname, String password) {
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		return userMapper.getUserInfo(user);
	}
	public User getUserAndRoleById(Integer userId) {
		return userMapper.getUserAndRoleById(userId);
	}
	
	
	public boolean insertUser(User user) {
		int count = userMapper.getCountByName(user.getLoginname());
		if(count>0){
			return false;
		}else{
			userMapper.insertUser(user);
			return true;
		}
	}
	/**
	 *  <br>
	 * <b>���ܣ�</b>�����û���Ϣ<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-22<br>
	 * @param model
	 * @param roleId
	 * @param username
	 * @param loginname
	 * @param password1
	 * @return
	 */
	public void insertUser(User user, Integer roleId, String username,
			String loginname, String password1) {
		user.setUsername(username);
		user.setLoginname(loginname);
		user.setPassword(password1);
		user.setRoleId(roleId);
		user.setRegisterTime(new Date());
		userMapper.insertUser(user);
	}
	
	
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	public void updateUserBaseInfo(User user){
		userMapper.updateUserBaseInfo(user);
	}
	
	public void updateUserRights(User user){
		userMapper.updateUserRights(user);
	}
	
	

	

	

	public void updateLastLogin(User user) {
		userMapper.updateLastLogin(user);
	}

	/**
	 *  <br>
	 * <b>���ܣ�</b>����User<br>
	 * <b>���ߣ�</b>�ܳ�<br>
	 * <b>���ڣ�</b> 2014-11-23<br>
	 **/
	public void updateUser(User user, String username, String loginname,
			String newpassword1) {
		user.setUsername(username);
		user.setLoginname(loginname);
		user.setPassword(newpassword1);
		userMapper.updateUser(user);
	}
	/**
	 <br>
	 * <b>���ܣ�</b>�����û�Id�����ɫ�����޸�<br>
	 * <b>���ߣ�</b>Ԭ��<br>
	 * <b>���ڣ�</b> 2014-12-3<br>
	 * @param userId
	 * @param roleId
	 */
	public void updateUserRole(int userId, int roleId) {
		User user=new User();
		user.setUserId(userId);
		user.setRoleId(roleId);
		userMapper.updateUserRole(user);
	}
	
	
	public void deleteUser(int userId){
		userMapper.deleteUser(userId);
	}
	
}
