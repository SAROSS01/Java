package com.prs.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.PurchaseRequest;
import com.prs.business.User;

public class PurchaseRequestDB {
	public static List<PurchaseRequest>getAll() {
		List<PurchaseRequest> prs = null;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			Query q = em.createQuery("Select prs from PurchaseRequest prs");
			prs = q.getResultList();
		}
		finally {
			em.close();
		}
		return prs;
		
	}

}
