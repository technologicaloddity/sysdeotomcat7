package com.technologicaloddity.sysdeotomcat7.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages={"com.technologicaloddity.sysdeotomcat7"}, includeFilters={@ComponentScan.Filter(type=FilterType.ANNOTATION, value=Controller.class)})
public class ServletContextConfig implements StartupConfiguration {

}
