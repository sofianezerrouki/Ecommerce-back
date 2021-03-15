package com.cama.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products/")
public class ProductController {
	
	@GetMapping
	public String getProduct() {
		
		return "ProductController Work :) ";
	}
	@GetMapping("{theId}")
	public String getProduct(@PathVariable long theId) {
		
		return "Product : "+theId+" for 10$ :) lol";
	}

}
