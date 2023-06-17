package com.ismo.crjj.efm.idao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.crjj.Utils.HibernateUtils;
import com.ismo.crjj.efm.beans.Etablissement;


public class DAOEtablissement implements IDao<Etablissement> {


    @Override
    public List<Etablissement> getAll() {
    	Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Etablissement> etablissements = s.createQuery("from Etablissement").getResultList();
		t.commit();
		s.close();
		return etablissements;
    }

    @Override
    public Etablissement getOne(int id) {
    	Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		return s.get(Etablissement.class, id);
    }

    @Override
    public boolean create(Etablissement obj) {
    	Session session = HibernateUtils.getSessionfactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        return true;
    }

    @Override
    public boolean update(Etablissement obj) {
        // Rechercher l'établissement à mettre à jour
    	Session session = HibernateUtils.getSessionfactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(obj);
        transaction.commit();
        return true;
    }

    @Override
    public boolean delete(Etablissement obj) {
    	Session session = HibernateUtils.getSessionfactory().getCurrentSession();
	     Transaction transaction = session.beginTransaction();
	     session.delete(obj);
	     transaction.commit();
	     return true;
    }
}
