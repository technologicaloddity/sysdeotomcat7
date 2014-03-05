package com.technologicaloddity.sysdeotomcat7.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan(basePackages={"com.technologicaloddity"}, excludeFilters={@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=StartupConfiguration.class), @ComponentScan.Filter(type=FilterType.ANNOTATION, value=Controller.class)})
public class ApplicationContextConfig implements StartupConfiguration {

	@Bean
	public ViewResolver viewResolver() {
		UrlBasedViewResolver bean = new UrlBasedViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/jsp/");
		bean.setSuffix(".jsp");
		return bean;
	}
	
}
