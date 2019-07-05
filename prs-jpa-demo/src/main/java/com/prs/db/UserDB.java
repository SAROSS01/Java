package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.prs.business.User;

public class UserDB {
	
	public static void insert (User user) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.persist(user);
			trans.commit();
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally {
			em.close();
		}
		
	}
	
	public static List<User>getAll() {
		List<User> users = null;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			Query q = em.createQuery("Select u from User u");
			users = q.getResultList();
		}
		finally {
			em.close();
		}
		return users;
		
	}
	
	public static void delete (User user) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.merge(user);
			trans.commit();
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally {
			em.close();
		}
		
	}
	
	public static User selectUser(String eMail) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String qString = "SELECT u FROM User u " +
				"WHERE u.email = :email";
		TypedQuery<User> q = em.createQuery(qString, User.class);
		try {
			User user = q.getSingleResult();
			return user;
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
		}
		

				 
			 }
		
		
		
	}


