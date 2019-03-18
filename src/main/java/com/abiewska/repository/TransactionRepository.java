package com.abiewska.repository;

import java.util.List;

import com.abiewska.model.Transaction;

public interface TransactionRepository {
	List<Transaction> getAllTransactions();
	Transaction getTransactionById(Integer transactionId);
}
