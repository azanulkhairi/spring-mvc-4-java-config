package com.honeyBadger.akunMonster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/*The @Configuration annotation indicates that this class declares one or more @Bean methods and may be processed by the spring container to generate bean definitions and service requests for those beans at runtime.

The @EnableWebMvc enables support for the @Controller annotation that uses @RequestMapping to map incomming requests to specific methods.

The @ComponentScan will instruct spring which packages it may scan to discover spring annotated beans.

The InternalResourceViewResolver will prefix and suffix the return value of the controller to construct the real path of the view file.
*/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.honeyBadger.akunMonster")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver view() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
