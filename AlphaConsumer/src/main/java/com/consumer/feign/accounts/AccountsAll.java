package com.consumer.feign.accounts;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "Accounts-Provider", path = "/accounts")
public interface AccountsAll {
	@GetMapping("/all")
	String  getAll();
}
