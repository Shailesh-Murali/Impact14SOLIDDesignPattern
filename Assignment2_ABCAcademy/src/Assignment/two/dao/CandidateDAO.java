package Assignment.two.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Assignment.two.util.HibernateUtil;

import Assignment.two.model.Candidate;

public class CandidateDAO {

	public String addCandidate(Candidate candidate) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(candidate);
		session.getTransaction().commit();
		return "Candidate details are successfully added.";
	}

	public List<Candidate> loadCandidates() {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Query query=session.createQuery("from Candidate"); 
		List<Candidate> list=query.list();  	
		return list;
	}


}
