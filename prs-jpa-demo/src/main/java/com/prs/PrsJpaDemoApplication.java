package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.Product;
import com.prs.business.PurchaseRequest;
import com.prs.business.PurchaseRequestLineItem;
import com.prs.business.User;
import com.prs.business.Vendor;
import com.prs.db.ProductDb;
import com.prs.db.PurchaseRequestDb;
import com.prs.db.PurchaseRequestLineItemDb;
import com.prs.db.UserDB;
import com.prs.db.VendorDB;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		System.out.println("Hello");
		
		List<User> users = UserDB.getAll();
		
		if (users!=null) {
			for (User u : users) {
				System.out.println(u);
			}
		}
//		System.out.println(VendorDB.getAll());
//		List<Vendor> vendors = VendorDB.getAll();
//		
//		if (vendors !=null) {
//			for (Vendor v : vendors) {
//				System.out.println(v);
//			}
//		}
//		
//		List<Product> products = ProductDb.getAll();
//		
//		if (products != null) {
//			for (Product p: products) {
//				System.out.println(p);
//			}
//		}
//		
//		List<PurchaseRequest> purchaserequests = PurchaseRequestDb.getAll();
//		
//		if (purchaserequests != null) {
//			for (PurchaseRequest pr: purchaserequests) {
//				System.out.println(pr);
//			}
//		}
//		
//		List<PurchaseRequestLineItem> purchaserequestlineitems = PurchaseRequestLineItemDb.getAll();
//		
//		if (purchaserequestlineitems != null) {
//			for (PurchaseRequestLineItem prli: purchaserequestlineitems) {
//				System.out.println(prli);
//			}
//			
//		}
//		
		
		
		
		
		
		
		
		System.out.println("Goodbye");
	
	}
}
