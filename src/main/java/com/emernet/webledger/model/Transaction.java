package com.emernet.webledger.model;

import java.math.BigDecimal;
import java.util.Date;


public class Transaction {

	private int transactionId;
	private int cashBoxId;
	private Date transactionDate;
	private String storeName;
	private BigDecimal amount;
	public BigDecimal getAmount() {
		return amount;
	}
	public int getCashBoxId() {
		return cashBoxId;
	}
	public String getStoreName() {
		return storeName;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public void setCashBoxId(int cashBoxId) {
		this.cashBoxId = cashBoxId;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	
}
