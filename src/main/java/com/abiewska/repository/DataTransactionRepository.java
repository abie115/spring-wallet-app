package com.abiewska.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.abiewska.model.Transaction;

@Repository
public class DataTransactionRepository implements TransactionRepository {
	private List<Transaction> listTrans = new ArrayList<Transaction>();

	public DataTransactionRepository() {
		Transaction w1 = new Transaction(1, "Wydatek", new BigDecimal(55), "Bar", new GregorianCalendar(2019, 3, 17));
		Transaction w2 = new Transaction(2, "Wydatek", new BigDecimal(5.5), "Zakupy",
				new GregorianCalendar(2019, 3, 17));
		Transaction w3 = new Transaction(3, "Dochód", new BigDecimal(200), "Praca", new GregorianCalendar(2019, 3, 18));

		listTrans.add(w1);
		listTrans.add(w2);
		listTrans.add(w3);
	}

	public List<Transaction> getAllTransactions() {
		return listTrans;
	}

	public Transaction getTransactionById(Integer transactionId) {
		Transaction transactionById = null;
		for (Transaction t : listTrans) {
			if (t.getTransactionId().equals(transactionId)) {
				transactionById = t;
				break;
			}
		}
		if (transactionById == null) {
			throw new IllegalArgumentException("No found transaction: " + transactionId);
		}
		return transactionById;
	}

}
