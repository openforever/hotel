package cn.edu.jlu.hotelms.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseController {
	
	@Autowired
	private HttpServletRequest httpServletRequest;
	
	public String getPath(){
		String path = httpServletRequest.getContextPath();
		String basePath = httpServletRequest.getScheme() + "://" 
				+ httpServletRequest.getServerName() + ":" 
				+ httpServletRequest.getServerPort() + path + "/";
		return basePath;
	}
}
