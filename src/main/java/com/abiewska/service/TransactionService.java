package com.abiewska.service;

import java.util.List;

import com.abiewska.model.Transaction;

public interface TransactionService {
	List<Transaction> getAllTransactions();
	Transaction getTransactionById(Integer transactionId);
}
