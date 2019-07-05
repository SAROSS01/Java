package com.prs.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.PurchaseRequest;
import com.prs.business.PurchaseRequestLineItem;

public class PurchaseRequestLineItemDb {
	public static List<PurchaseRequestLineItem>getAll() {
		List<PurchaseRequestLineItem> purchaserequestslineitems = null;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			Query q = em.createQuery("Select prli from  PurchaseRequestLineItems prli");
			purchaserequestslineitems = q.getResultList();
		}
		finally {
			em.close();
		}
		return purchaserequestslineitems;
	}
}
