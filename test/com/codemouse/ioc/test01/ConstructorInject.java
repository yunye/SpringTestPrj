package com.codemouse.ioc.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;


public class ConstructorInject {
	
	@Test
	public void testConstructorInject(){
//		InputStream is = null;
//		try {
//			is = new FileInputStream(new File("conf/iocTestBeans.xml"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Resource resource = new InputStreamResource(is);
		
		Resource resource = new FileSystemResource("conf/iocTestBeans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		HelloWorldApi byIndex = (HelloWorldApi)beanFactory.getBean("byIndex", HelloWorldApi.class);
		byIndex.sayHello();
		HelloWorldApi byType = (HelloWorldApi)beanFactory.getBean("byType", HelloWorldApi.class);
		byType.sayHello();
//		HelloWorldApi byName = (HelloWorldApi)beanFactory.getBean("byName", HelloWorldApi.class);
//		byName.sayHello();
	}
}
