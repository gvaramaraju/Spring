package com.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.feign.accounts.AccountsAll;


@RestController
public class AlphaCosumerController {
	
	@Autowired
	private AccountsAll accountsAll;
	
	@GetMapping("/all")
	public String getAll() {
		return accountsAll.getAll();
	}
}
