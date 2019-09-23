package com.acrabsoft.spring.beans.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public  @interface LOG {
	// 日志分类  对应 es 等 index
		String   index() default "";
		
		//String   type() default "";
		// 操作类型 对用业务
		
		String   operation() ;
		
		// 日志标签 logstash 过滤可能用到
		// String[] tags() default {};
		
		// 日志简要输出信息,会放在es的message中
		String   info() default "";
		
		// JSON 内容, 会返回对象中提取 提取 字段 
		String[] content() default {};
}
