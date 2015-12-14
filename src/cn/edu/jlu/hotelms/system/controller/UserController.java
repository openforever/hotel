package cn.edu.jlu.hotelms.system.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.jlu.hotelms.base.controller.BaseController;
import cn.edu.jlu.hotelms.common.entity.Page;
import cn.edu.jlu.hotelms.system.entity.Role;
import cn.edu.jlu.hotelms.system.entity.User;
import cn.edu.jlu.hotelms.system.service.UserService;

/**
 * 
 * @author 赵开永
 *对于用户的请求操作
 */
@Controller
@RequestMapping(value="/user")
public class UserController extends BaseController {
	
	@Autowired
	private UserService userService;
	/*@Autowired
	private RoleService roleService;
	@Autowired
	private MenuService menuService;*/
	 
	/**
	 *  <br>
	 * <b>功能：</b>请求新增用户页面<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/add")
	public String toAdd(Model model){
		System.err.println("to add");
		/*List<Role> roleList = roleService.listAllRoles();
		model.addAttribute("roleList", roleList);*/
		return "system/user/adduser";
	}
	/**
	 *  <br>
	 * <b>功能：</b>保存用户信息<br>
	 * <b>作者：</b>周晨<br>
	 * 
	 * <b>日期：</b> 2014-11-22<br>
	 * @param model
	 * @param roleId
	 * @param username
	 * @param loginname
	 * @param password1
	 * @param password2
	 * @return
	 * 
	 * @update 赵开永 
	 *  <b>事件：</b>删除roleId<br>
	 * <b>作者：</b>赵开永<br>
	 * 
	 * <b>日期：</b> 2014-12-1<br>
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUser(Model model, @RequestParam String username, @RequestParam 
			String loginname, @RequestParam String password1, @RequestParam String password2){
		User user = new User();
		if(password1.equals(password2)){
			userService.insertUser(user, 0, username, loginname, password1);
		}
		model.addAttribute("message", "保存成功");
		return "redirect:"+getPath()+"user.html";
	}
	/**
	 *  <br>
	 * <b>功能：</b> 请求编辑用户页面<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/edit")
	public String toEdit(Model model,@RequestParam int userId){
		User user= userService.getUserAndRoleById(userId);  
		model.addAttribute("user", user);
		return "system/user/edituser";
	}
	
	/**
	 *  <br>
	 * <b>功能：</b> 接收编辑用户页面<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-23<br>
	 * @param model
	 * @param userId
	 * @param username
	 * @param loginname
	 * @param oldpassword
	 * @param newpassword1
	 * @param newpassword2
	 * @return
	 */
	@RequestMapping(value="/saveEdit")
	public String saveEdit(Model model,  @RequestParam Integer userId,@RequestParam String username, @RequestParam 
			              String loginname, @RequestParam String oldpassword, @RequestParam String 
			              newpassword1, @RequestParam String newpassword2){
		User user=userService.getUserById(userId);
		if(oldpassword.equals(user.getPassword()) && newpassword1.equals(newpassword2)){
			userService.updateUser(user,username,loginname,newpassword1);
			System.err.println(11);
		}		
	
		model.addAttribute("message", "修改成功");
		return "redirect:"+getPath()+"user.html";
	}
	/**
	 *  <br>
	 * <b>功能：</b> 删除某个用户<br>
	 * <b>作者：</b>周晨<br>
	 * <b>日期：</b> 2014-11-22<br>
	 * @param userId
	 * @param out
	 */
	@RequestMapping(value="/del/{id}", method=RequestMethod.GET)
	public String deleteUser(@PathVariable("id") Integer userId, Model model){
		userService.deleteUser(userId);
		model.addAttribute("message", "删除成功");
		/*return "redirect:"+getPath()+"user.html";*/
		System.out.println("\n\n*****************************删除成功*********\n\n");
		System.out.println(getPath() + " ********** ");
		return getPath() + "index";
	}
	/**
	 *  <br>
	 * <b>功能：</b> 删除多个用户<br>
	 * <b>作者：</b>袁鑫<br>
	 * <b>日期：</b> 2014-12-1<br>
	 * @param userIds
	 */
	@RequestMapping(value="/delUsers")
	public String  deleteUsers(@RequestParam Integer[] userIds,Model model){
		for(int i=0;i<userIds.length;i++){
			userService.deleteUser(userIds[i]);
		}
		model.addAttribute("message", "删除成功");
		return "redirect:"+getPath()+"user.html";
	}
}
