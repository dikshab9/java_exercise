package org.beanFactory;


import org.springframework.context.ApplicationContext;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;


public class DrawingApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		@SuppressWarnings("deprecation")
		
//		Triangle triangle=(Triangle) context.getBean("triangle1");
		/*Triangle triangle2=(Triangle) context.getBean("triangle2");
		System.out.println("Points of Triangle 1: ");
		triangle.draw();
		System.out.println("Points of Triangle 2: ");
		triangle2.draw();*/
		
		Circle circle=(Circle) context.getBean("circle");
		circle.draw();
	}

}
