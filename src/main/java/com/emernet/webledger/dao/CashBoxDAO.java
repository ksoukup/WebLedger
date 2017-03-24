package com.emernet.webledger.dao;

import com.emernet.webledger.model.CashBox;

public interface CashBoxDAO {
	
	public void addCashBox(CashBox cashBox);
	public CashBox getCashBox(int casBoxId);
	public void editCashBox(CashBox cashBox);
	public void removeCashBox(CashBox cashbox);

}
