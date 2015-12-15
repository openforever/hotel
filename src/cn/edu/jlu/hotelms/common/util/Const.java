package cn.edu.jlu.hotelms.common.util;



public class Const {
	public static final String SESSION_SECURITY_CODE = "sessionSecCode";
	public static final String SESSION_USER = "sessionUser";
	public static final String SESSION_USER_RIGHTS = "sessionUserRights";
	public static final String SESSION_ROLE_RIGHTS = "sessionRoleRights";
	//不对匹配该值的访问路径拦截(正则)
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(code)).*";
	//用户可以浏览的菜单ID组合
	public static  final String ROLE_MENU_ID = "sessionMenuCanView";
	//public static ApplicationContext WEB_APP_CONTEXT = null; //该值会在web容器启动时由WebAppContextListener初始化
	
}
