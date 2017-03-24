package com.emernet.webledger.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CashBox {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cashBoxId;
	private BigDecimal total;
	private boolean verified;
	
	protected CashBox(){}
	
	public int getCashBoxId() {
		return cashBoxId;
	}
	public void setCashBoxId(int cBID) {
		this.cashBoxId = cBID;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}

}
