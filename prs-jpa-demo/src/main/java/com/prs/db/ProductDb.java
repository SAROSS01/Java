package com.prs.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.Product;
import com.prs.business.Vendor;

public class ProductDb {
	public static List<Product>getAll() {
	List<Product> products = null;
	EntityManager em = DBUtil.getEmFactory().createEntityManager();
	try {
		Query q = em.createQuery("Select p from Products p");
		products = q.getResultList();
	}
	finally {
		em.close();
	}
	return products;
	}
}
