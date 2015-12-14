package cn.edu.jlu.hotelms.system.service;

import java.util.List;

import cn.edu.jlu.hotelms.common.entity.Page;
import cn.edu.jlu.hotelms.system.entity.User;

/**
 * 对于用户的service操作
 * @author 李成
 *
 */
public interface UserService {
	/**
	 *  <br>
	 * <b>功能：</b>根据page 返回当前页的所有的user<br>
	 * <b>作者：</b>李成<br>
	 * <b>日期：</b> 2014-11-16 <br>
	 * 列举所有的子类菜单
	 * 根据page 返回当前页的所有的user
	 * @param page
	 * @return
	 */
	public List<User> listPageUser(Page page);
	
	/**
	 *  <br>
	 * <b>功能：</b>根据条件查询并且分页<br>
	 * <b>作者：</b>李成<br>
	 * <b>日期：</b> 2014-11-29 <br>
	 * 
	 * 根据condition 返回当前页的所有的user
	 * @param page
	 * @return
	 */
	public List<User> listPageUserByCondition(Page page,String condition);
	
	
	/*
	 * 等待修正
	 */
	/**
	 *  <br>
	 * <b>功能：</b> 根据userId得到User<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	User getUserById(Integer userId);
	/**
	 *  <br>
	 * <b>功能：</b>插入用户信息<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
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
	 * <b>功能：</b>更新User<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-23<br>
	 **/
	void updateUser(User user, String username, String loginname, String newpassword1);
	/**
	 <br>
	 * <b>功能：</b>根据用户Id对其角色进行修改<br>
	 * <b>作者：</b>袁鑫<br>
	 * <b>日期：</b> 2014-12-3<br>
	 * @param userId
	 * @param roleId
	 */
	void updateUserRole(int userId , int roleId);
	/**
	 *<br>
	 * <b>功能：</b>列出没有分配角色的用户 并分页<br>
	 * <b>作者：</b>袁鑫<br>
	 * <b>日期：</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	public List<User> listPageNoRole(Page page);
	/**
	 *<br>
	 * <b>功能：</b>列出已经分配角色的用户 并分页<br>
	 * <b>作者：</b>袁鑫<br>
	 * <b>日期：</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	public List<User> listPageRole(Page page);
	User getUserByNameAndPwd(String username,String password);
	
	void updateUserBaseInfo(User user);
	
	void updateUserRights(User user);
	
	/**
	 *  <br>
	 * <b>功能：</b> 删除某个用户<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	void deleteUser(int userId);
	
	List<User> listPageUser(User user);
	
	void updateLastLogin(User user);
	
	User getUserAndRoleById(Integer userId);
	
	List<User> listAllUser();
}
