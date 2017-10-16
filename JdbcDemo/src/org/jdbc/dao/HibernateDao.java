package org.jdbc.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HibernateDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public int getCircleCount() {
        String sql="select count(*) from Circle";
        Query query =getSessionFactory().openSession().createQuery(sql);
        return  ((Long)query.uniqueResult()).intValue();
        
       }


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
