package com.yc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 后台静态页面的访问拦截器 
 * @author Lydia
 *
 */
public class BackForwardInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String path =  request.getServletPath();
		//System.out.println(path+"-----------拦截器-----------------");
		path =path.substring(path.lastIndexOf("/"));
		//System.out.println(path+"------------截取路径---------------");
		//内部转发  
		request.getRequestDispatcher("/WEB-INF/manager/"+path).forward(request, response);
		return false;
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
