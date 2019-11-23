package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.projet.model.Languages;

public class LanguageDAO implements ILanguageDAO {

	private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
    @Transactional(readOnly=true)
	public List<Languages> recupererListeLangue() {
		Session session = sessionFactory.getCurrentSession();
        List<Languages> languageList = session.createQuery("from Languages").list();
        return languageList;
	}
}
