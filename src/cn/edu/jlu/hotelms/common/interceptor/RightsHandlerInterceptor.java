package cn.edu.jlu.hotelms.common.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RightsHandlerInterceptor/* extends HandlerInterceptorAdapter*/{
/*
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		String path = request.getServletPath();
		System.err.println(path+"preHandle");
		if(path.matches(Const.NO_INTERCEPTOR_PATH))
			return true;
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute(Const.SESSION_USER);
	
		Integer menuId = null;
		List<Menu> subList = ServiceHelper.getMenuService().listAllSubMenu();
		for(Menu m : subList){
			String menuUrl = m.getUrl();
			if(Tools.notEmpty(menuUrl)){
				if(path.contains(menuUrl)){
					menuId = m.getMenuId();
					break;
				}else{
					String[] arr = menuUrl.split("\\.");
					for (int i = 0; i < arr.length; i++) {
						System.err.println(arr[i]);
					}
					String regex = "";
					if(arr.length==2){
						regex = "/?"+arr[0]+"(/.*)?."+arr[1];
						
					}else{
						regex = "/?"+menuUrl+"(/.*)?.html";
					}
					if(path.matches(regex)){
						menuId = m.getMenuId();
						break;
					}
				}
			}
		}
		//鍦ㄨ繖閲屽緱鍒颁簡琚姹傜殑menuId
		System.err.println(path+"===="+menuId);
		if(menuId!=null){
			//user = ServiceHelper.getUserService().getUserAndRoleById(user.getUserId());
			//String userRights = (String) session.getAttribute(Const.SESSION_USER_RIGHTS);
			//String roleRights = (String) session.getAttribute(Const.SESSION_ROLE_RIGHTS);
			String AllcanView = (String) session.getAttribute(Const.ROLE_MENU_ID);
			System.err.println(AllcanView);
			System.err.println(AllcanView.contains(menuId+""));
			if(RightsHelper.testRights(userRights, menuId) || RightsHelper.testRights(roleRights, menuId)){
				return true;
			}else{
				System.out.println("鐢ㄦ埛锛�+user.getLoginname()+"璇曞浘璁块棶"+path+"琚樆姝紒");
				ModelAndView mv = new ModelAndView();
				mv.setViewName("no_rights");
				throw new  ModelAndViewDefiningException(mv);
			}
			if(AllcanView.contains(menuId+"")){
				return true;
			}else{
				System.out.println("鐢ㄦ埛锛�+user.getLoginname()+"璇曞浘璁块棶"+path+"琚樆姝紒");
				ModelAndView mv = new ModelAndView();
				mv.setViewName("/system/no_rights");
				throw new  ModelAndViewDefiningException(mv);
			}
		}
		return super.preHandle(request, response, handler);
	}*/
	
}
