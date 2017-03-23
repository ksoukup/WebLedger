package com.fdmgroup.springmvcproject.dao;

import com.fdmgroup.springmvcproject.model.CashBox;

public interface CashBoxDAO {
	
	public void addCashBox(CashBox cashBox);
	public CashBox getCashBox(int casBoxId);
	public void editCashBox(CashBox cashBox);
	public void removeCashBox(CashBox cashbox);

}
