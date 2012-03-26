package com.codemouse.beans.test01;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codemouse.beans.Country;


public class NamingRule {
	
	@Test
	public void testBeanInfo(){
//		String className = "com.codemouse.beans.Country";
//		Class cls = null;
//		try {
//			cls = Class.forName(className);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			BeanInfo bi = Introspector.getBeanInfo(cls);
//			System.out.println(bi);
//		} catch (IntrospectionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		//System.out.println(country.displayInfo());
//		}
	}
	
	@Test
	public void testJavaBeanNamingRule0(){
		Country country = new Country();
		country.setPropertyName("中国");
		country.setXcoordinate(Double.valueOf(123.456f));
		System.out.println(country.getPropertyName());
		System.out.println(country.getXcoordinate());
	}
	
	@Test
	public void testJavaBeanNamingRule(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myBeans.xml");
		Country country = (Country)ctx.getBean("country");
		System.out.println(country.getPropertyName());
		System.out.println(country.getXcoordinate());
	}
}
