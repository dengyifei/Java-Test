package com.acrabsoft.spring.beans.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.acrabsoft.spring.beans.Source;
import com.acrabsoft.spring.beans.annotation.LOG;

@Component
//@EnableAspectJAutoProxy 能让scan 扫到即可,最好放在配置类上
public class BusinessService {
	@Autowired
	private BeanFactory factory;
	
	@Autowired
	private Source source;
	
	@Value("${apple.color}")
	private String color;
	
	@LOG(operation = "测试")
	public void buy() {
		System.out.println("color:"+color);
	}
	
}
