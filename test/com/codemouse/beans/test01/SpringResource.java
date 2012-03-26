package com.codemouse.beans.test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import com.codemouse.beans.Country;


public class SpringResource {
	
	@Test
	public void testBeanInfo() throws FileNotFoundException{
		
		FileInputStream is = new FileInputStream("conf/myBeans.xml");
		
		Resource resource = new InputStreamResource(is);
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Country country = (Country)beanFactory.getBean("country");
	}
	
}
