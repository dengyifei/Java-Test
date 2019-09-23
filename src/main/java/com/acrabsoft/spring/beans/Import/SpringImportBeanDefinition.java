package com.acrabsoft.spring.beans.Import;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 *   手动注入
 * @author efei
 *
 */
public class SpringImportBeanDefinition implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		//if (!registry.containsBeanDefinition("testRegistrar")) {
			//BeanDefinition definition = new RootBeanDefinition(Student.class);
			registry.registerBeanDefinition(Student.class.getName(), new RootBeanDefinition(Student.class));
			registry.registerBeanDefinition(Teacher.class.getName(), new RootBeanDefinition(Teacher.class));

		//}
	}

}
