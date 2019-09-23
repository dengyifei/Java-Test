package com.acrabsoft.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * *bean 创建的切面方法
 * @author efei
 *
 */
@Component
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean '" + beanName + "' before created : " + bean.toString());
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean '" + beanName + "' after created : " + bean.toString());
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
