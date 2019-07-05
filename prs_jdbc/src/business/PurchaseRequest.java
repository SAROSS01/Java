package business;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class PurchaseRequest {
	
	private int id;
	private int userId;
	private String desc;
	private String justification;
	private LocalDate dateNeeded;
	private String delivereyMode;
	private String status;
	private double total;
	private LocalDateTime subDate;
	private String reasonForRej;


public PurchaseRequest(int id, int userId, String desc, String justification, LocalDate dateNeeded,
		String delivereyMode, String status, double total, LocalDateTime subDate, String reasonForRej) {
	super();
	this.id = id;
	this.userId = userId;
	this.desc = desc;
	this.justification = justification;
	this.dateNeeded = dateNeeded;
	this.delivereyMode = delivereyMode;
	this.status = status;
	this.total = total;
	this.subDate = subDate;
	this.reasonForRej = reasonForRej;
	}


public PurchaseRequest() {
	super();
	id = 0;
	userId = 0;
	desc = " ";
	justification = " ";
	dateNeeded = null;
	delivereyMode = " ";
	status = " ";
	total = 0;
	subDate = null;
	reasonForRej = " ";
	}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
}


public String getDesc() {
	return desc;
}


public void setDesc(String desc) {
	this.desc = desc;
}


public String getJustification() {
	return justification;
}


public void setJustification(String justification) {
	this.justification = justification;
}


public LocalDate getDateNeeded() {
	return dateNeeded;
}


public void setDateNeeded(LocalDate dateNeeded) {
	this.dateNeeded = dateNeeded;
}


public String getDelivereyMode() {
	return delivereyMode;
}


public void setDelivereyMode(String delivereyMode) {
	this.delivereyMode = delivereyMode;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public double getTotal() {
	return total;
}


public void setTotal(double total) {
	this.total = total;
}


public LocalDateTime getSubDate() {
	return subDate;
}


public void setSubDate(LocalDateTime subDate) {
	this.subDate = subDate;
}


public String getReasonForRej() {
	return reasonForRej;
}


public void setReasonForRej(String reasonForRej) {
	this.reasonForRej = reasonForRej;
}


@Override
public String toString() {
	return "PurchaseRequest [id=" + id + ", userId=" + userId + ", desc=" + desc + ", justification=" + justification
			+ ", dateNeeded=" + dateNeeded + ", delivereyMode=" + delivereyMode + ", status=" + status + ", total="
			+ total + ", subDate=" + subDate + ", reasonForRej=" + reasonForRej + "]";
}




}

