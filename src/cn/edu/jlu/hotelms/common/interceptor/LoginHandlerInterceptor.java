package cn.edu.jlu.hotelms.common.interceptor;


public class LoginHandlerInterceptor/* extends HandlerInterceptorAdapter*/{
/*
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		String path = request.getServletPath();
		if(path.matches(Const.NO_INTERCEPTOR_PATH)){
			return true;
		}else{
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute(Const.SESSION_USER);
			if(user!=null){
				return true;
			}else{
				response.sendRedirect(request.getContextPath()+"/login.html");
				return false;
			}
		}
	}*/
	
}
