package com.acrabsoft.spring.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

import com.acrabsoft.spring.beans.Import.EnableTeacher;

@Configuration
@EnableAspectJAutoProxy
@EnableTeacher
@PropertySource(value = "classpath:/test.properties")
public class AppConfig {

}
