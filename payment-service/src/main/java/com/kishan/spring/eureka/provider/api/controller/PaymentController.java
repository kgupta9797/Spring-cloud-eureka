package com.kishan.spring.eureka.provider.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/payment-provider")
public class PaymentController {
	
	@GetMapping("/paynow/{price}")
	public String payNow(@PathVariable int price)
	{
		return "paymrnt with "+ price + " is successful.";
	}

//	@GetMapping("/index")
//	public String payNow()
//	{
//		return "hello kishan";
//	}
}
