package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.User;
import com.prs.db.ProductDB;
import com.prs.db.PurchaseRequestDB;
import com.prs.db.PurchaseRequestLineItemDB;
import com.prs.db.UserDB;
import com.prs.db.VendorDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaApplication.class, args);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		int choice1 = Console.getIntWithinRange("Hello Mr.Blessing, which list would you like to see?\n\n1.User\n2.Product\n3.Vendor\n4.Purchase Request\n5.Purchase Request Line Item\n-", 0, 6);
		switch (choice1) {
		case 1:
			System.out.println(UserDB.getAll());
			break;
		case 2:
			System.out.println(ProductDB.getAll());
			break;
		case 3:
			System.out.println(VendorDB.getAll());
			break;
		case 4:
			System.out.println(PurchaseRequestDB.getAll());
			break;
		case 5:
			System.out.println(PurchaseRequestDB.getAll());
			break;

			}
		Console.getChoiceString("Would you like to continue?", "y", "n");
		}
	}
}
