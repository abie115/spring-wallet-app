package com.abiewska.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abiewska.model.Transaction;
import com.abiewska.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;

	public List<Transaction> getAllTransactions() {
		return transactionRepository.getAllTransactions();
	}

	public Transaction getTransactionById(Integer transactionId) {
		return transactionRepository.getTransactionById(transactionId);
	}

}
