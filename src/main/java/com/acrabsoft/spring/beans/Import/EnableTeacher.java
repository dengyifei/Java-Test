package com.acrabsoft.spring.beans.Import;



import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.acrabsoft.spring.beans.DataConfig;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

//@Import({Student.class,Teacher.class,DataConfig.class})
//@Import(SpringImportSelector.class)
@Import(SpringImportBeanDefinition.class)
public @interface EnableTeacher {

}
