package com.yc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yc.po.AdminInfo;

public class LoginInterceptor implements HandlerInterceptor{
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
				return false;
//		String path =  request.getServletPath();
//		path =path.substring(path.lastIndexOf("/"));
//		//获取请求的URL 
//		  String url = request.getRequestURI(); 
//		  //URL:index.html是公开的;除了index.html是可以公开访问的，其它的URL都进行拦截控制 
//		  if(url.indexOf("login")>=0){ 
//		   return true; 
//		  } 
//		HttpSession session=request.getSession();
//		AdminInfo admin=(AdminInfo) session.getAttribute("admin");
//		if(admin!=null) {
//			return true;
//		}
//		request.getRequestDispatcher("/WEB-INF/manager/"+path).forward(request, response);
//
//		return false;
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
