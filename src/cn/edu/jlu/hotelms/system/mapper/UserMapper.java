package cn.edu.jlu.hotelms.system.mapper;

import java.util.List;
import java.util.Map;

import cn.edu.jlu.hotelms.common.annotation.MyBatisDao;
import cn.edu.jlu.hotelms.common.entity.Page;
import cn.edu.jlu.hotelms.system.entity.User;

/**
 * 对于用户的数据库操作
 * @author 赵开永
 *
 */
@MyBatisDao
public interface UserMapper  {
	/**
	 * 利用它的分页工具进行分页查询 所有的user对象
	 * @param page
	 * @return
	 */
	public List<User> listPageUser(Page page);
	
	public List<User> listPageUserByCondition(Map<String, Object> map);
	
	/**
	 *<br>
	 * <b>功能：</b>列出没有分配角色的用户 并分页<br>
	 * <b>作者：</b>袁鑫<br>
	 * <b>日期：</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	List<User> listPageNoRole(Page page);
	/**
	 *<br>
	 * <b>功能：</b>列出已经分配角色的用户 并分页<br>
	 * <b>作者：</b>袁鑫<br>
	 * <b>日期：</b> 2014-12-3<br>
	 * @param page
	 * 
	 */
	List<User> listPageRole(Page page);
	/*
	 * 等待修正
	 */
	List<User> listAllUser();
	List<User> listPageUser(User user);
	
	
	/**
	 * 得到一个user的具体对象信息 根据传入的user对象中的不同的信息
	 * @param user
	 * @return
	 */
	User getUserInfo(User user);
	
	/**
	 *  <br>
	 * <b>功能：</b> 根据userId得到User<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	User getUserById(Integer userId);
	int getCountByName(String loginname);
	int getCount(User user);
	/**
	 *  <br>
	 * <b>功能：</b> 根据userId得到User(含role)<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	User getUserAndRoleById(Integer userId);
	
	
	/**
	 * 更新一个user对象的上次登录时间这个字段
	 * @param user
	 */
	void updateLastLogin(User user);
	
	/**
	 *<br>
	 * <b>功能：</b>根据用户Id对其角色进行修改<br>
	 * <b>作者：</b>袁鑫<br>
	 * <b>日期：</b> 2014-12-3<br>
	 * @param user
	 * 
	 */
	
	void updateUserRole(User user);
	
	
	
	
	/**
	 *  <br>
	 * <b>功能：</b>更新User<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-23<br>
	 **/
	void updateUser(User user);
	
	void updateUserBaseInfo(User user);
	
	void updateUserRights(User user);
	
	
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
	void insertUser(User user);
	
	/**
	 *  <br>
	 * <b>功能：</b> 删除某个用户<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
	 * @param userId
	 * @return
	 */
	void deleteUser(int userId);
	
	
	
	
}
