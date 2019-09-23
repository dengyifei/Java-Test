package com.acrabsoft.spring.beans.Import;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.acrabsoft.spring.beans.DataConfig;

/**
 *    选择注入
 * @author efei
 *
 */
public class SpringImportSelector implements ImportSelector, BeanFactoryAware{

	 private BeanFactory beanFactory;
	 
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.beanFactory = beanFactory;
	}

	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		//importingClassMetadata.getAnnotationTypes().forEach(System.out::println);
		//System.out.println(beanFactory);
		return new String[]{Student.class.getName(),Teacher.class.getName(),DataConfig.class.getName()};
	}

}
