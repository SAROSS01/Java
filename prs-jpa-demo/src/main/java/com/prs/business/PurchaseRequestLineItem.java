package com.prs.business;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseRequestLineItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int purchaseReqId;
	private int productId;
	private int quantity;
	
	public PurchaseRequestLineItem() {
		id = 0;
		purchaseReqId = 0;
		productId = 0;
		quantity = 0;
	}

	public PurchaseRequestLineItem(int id, int purchaseReqId, int productId, int quantity) {
		super();
		this.id = id;
		this.purchaseReqId = purchaseReqId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPurchaseReqId() {
		return purchaseReqId;
	}

	public void setPurchaseReqId(int purchaseReqId) {
		this.purchaseReqId = purchaseReqId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PurchaseRequestLineItem [id=" + id + ", purchaseReqId=" + purchaseReqId + ", productId=" + productId
				+ ", quantity=" + quantity + "]";
	}
	
	
}

