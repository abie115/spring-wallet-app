package com.abiewska.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Transaction {

	private Integer transactionId;
	private String type;
	private String description;
	private BigDecimal amount;
	private String category;
	private Calendar date;

	public Transaction(Integer transactionId, String type, BigDecimal amount, String category, Calendar date) {
		super();
		this.transactionId = transactionId;
		this.type = type;
		this.amount = amount;
		this.category = category;
		this.date = date;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", type=" + type + ", description=" + description
				+ ", amount=" + amount + ", category=" + category + ", date=" + date + "]";
	}

}
