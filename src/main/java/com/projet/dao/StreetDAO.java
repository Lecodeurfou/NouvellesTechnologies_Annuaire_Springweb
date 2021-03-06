package com.projet.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import com.projet.model.Street;


public class StreetDAO implements IStreetDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory=sf;
	}
	@Transactional(readOnly=true)
	public List<Street> recupererListeRue(){
		Session session= sessionFactory.getCurrentSession();
		List<Street> Ruelist = session.createQuery("from Street").list();
		return Ruelist;
	}
}
