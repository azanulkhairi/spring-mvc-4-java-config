package com.honeyBadger.akunMonster.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*The DispatcherServlet acts like a front-controller and is used to dispatch the requests 
 * to the appropriate controller methods. We configure it by extending the 
 * AbstractAnnotationConfigDispatcherServletInitializer class which is a base class 
 * for the WebApplicationInitializer, this will configure the servlet context 
 * programatically. We need to tell it where the location of our Spring MVC Java 
 * Configuration file is located. We do this by registering the class – of our java configuration – 
 * in the getServletConfigClasses method.
*/
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
