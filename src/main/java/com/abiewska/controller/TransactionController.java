package com.abiewska.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abiewska.service.TransactionServiceImpl;

@Controller
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired
	private TransactionServiceImpl transactionService;

	@RequestMapping
	public String listTransactions(Model model) {
		System.out.println("in controller");
		model.addAttribute("transactions", transactionService.getAllTransactions());

		return "transactions";
	}
	
/*
	@RequestMapping("/transaction/1")
	public String process() {
		// transactionRepository.getTransactionById(1);
		// System.out.println(transactionRepository.getTransactionById(1).getCategory());
		return "redirect:/transactions";
	}*/

}
