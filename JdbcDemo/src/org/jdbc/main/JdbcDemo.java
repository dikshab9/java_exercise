package org.jdbc.main;

import org.jdbc.Circle;
import org.jdbc.dao.HibernateDao;
import org.jdbc.dao.JdbcDao;
import org.jdbc.dao.SimpleJdbcDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
//		JdbcDao dao=ctx.getBean("jdbcDao",JdbcDao.class);
//	Circle circle=dao.getCircle(1);
//		System.out.println(circle.getName());
//		System.out.println(dao.getCircleCount());
//		System.out.println(dao.getCircleName(1));
//		System.out.println(dao.getCircleforId(1).getName());
//		dao.insertCircle(new Circle(4,"Fourth circle"));
//		System.out.println("Size of the database: "+dao.getAllCircle().size());

//		dao.createTriangletable();
//		SimpleJdbcDao dao=ctx.getBean("simpleJdbcDao",SimpleJdbcDao.class);
		HibernateDao dao=ctx.getBean("hibernateDao",HibernateDao.class);
		System.out.println(dao.getCircleCount());

	}

}
