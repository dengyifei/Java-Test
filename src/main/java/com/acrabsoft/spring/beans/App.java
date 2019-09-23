package com.acrabsoft.spring.beans;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.acrabsoft.spring.beans.Import.EnableTeacher;
import com.acrabsoft.spring.beans.Import.Student;
import com.acrabsoft.spring.beans.Import.Teacher;
import com.acrabsoft.spring.beans.aspect.LogAspect;
import com.acrabsoft.spring.beans.service.BusinessService;

/**
 * Hello world!
 *
 */



public class App 
{
	static Log log= LogFactory.getLog(App.class);
	
	public static void main( String[] args )
    {
// ---------------------------------------
//    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
//    	
// ---------------------------------------
//        GenericApplicationContext context = new GenericApplicationContext();
//
//        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(context);
//        xmlReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
//        context.refresh();
//        PropertiesBeanDefinitionReader propReader = new PropertiesBeanDefinitionReader(ctx);
//        propReader.loadBeanDefinitions(new ClassPathResource("otherBeans.properties"));
        
        
// ----------------------------------------------        
		@SuppressWarnings("resource")
		//ApplicationContext context = new AnnotationConfigApplicationContext(new String[] {"com.acrabsoft.spring.beans"});
		ApplicationContext context = new AnnotationConfigApplicationContext("com.acrabsoft.spring.beans");
        

        
    	Source source = context.getBean("source",Source.class);
    	BusinessService service = context.getBean(BusinessService.class);
    	LogAspect l = context.getBean(LogAspect.class);
    	service.buy();
    	
    	Teacher t = context.getBean(Teacher.class);
    	System.out.println("Teacher:" +t);
    	
    	Student s = context.getBean(Student.class);
    	System.out.println("Student:" +s);
    	
    	DataConfig dataconfig = context.getBean(DataConfig.class);
    	System.out.println("DataConfig:" +dataconfig);
    	//log.info("xxx");
//        System.out.println(source.getFruit());
//        System.out.println(source.getSugar());
    	
    	
    	String[] beanNames = context.getBeanDefinitionNames();
    	System.out.println("bean names：" + Arrays.asList(beanNames));
        
       
        
   
        
    }
}
