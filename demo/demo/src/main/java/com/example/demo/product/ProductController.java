package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	
@Autowired
private ProductRepository productRepository;
	
@GetMapping(value= "/")
public String index (Product product) {
return "product/index";
}

private Product product;
@PostMapping(value = "/")
public String addNewProduct(Product product, Model model) {
	
	productRepository.save(new Product(product.getPrice(),product.getBrand(), product.getName(), product.getSignedUp()));
		model.addAttribute("Price", product.getPrice());
		model.addAttribute("Name", product.getName());
		model.addAttribute("Brand", product.getBrand());
		return "product/result";
	}
}
