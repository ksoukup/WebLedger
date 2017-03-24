package com.emernet.webledger.dao;

import java.util.List;

import com.emernet.webledger.model.Transaction;

public interface TransactionDAO {
	
	public List<Transaction> getAllTransactions();
	public void addTransaction(Transaction tran);
	public Transaction getTransactoin(int tranID);
	public void editTransaction(Transaction tran);
	public void removeTransaction(Transaction tran);

}
