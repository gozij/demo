package com.example.demo.product;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Product {
	
	@Id
	@GeneratedValue()
	
	private Long id;
	private double price;
	private String name;
	private String brand;
	
	
	@Column
	@CreationTimestamp
	private Date SignedUp;
	
	
	public Product() {}
	
	
	
	
	public Product(String brand, double price, Date signedUp) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		
		
		
	
	
	//ProductRepository  =  context.getBean(ProductRepository.class);
	
	//Product computer = new Product{
		//"Desktop Computer", BigDecimal.ONE);
		//pants = repo.save(pants);
		
	//Product computer = new Product{
		//"Desktop Computer", 905.52);
		//computer = repo.save(computer);
	

		//Long computerId;
		//Product computerINDB = repo.findById(computerId).get();
		//computerINDB.setPrice(908.30);
		//repo.save(computerINDB);
	
	}
	
	
	
	
	public Product(double price2, String brand2, String name2, Date signedUp2) {
		// TODO Auto-generated constructor stub
	}




	public Long getId() {
		return id;
		
		
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
	
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}


    public Date getSignedUp() {
    	Date signedUp = null;
		return signedUp;
    }
    public void setSignedUp(Date signedUp) {
    	this.SignedUp = signedUp;
    }




	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", brand=" + brand + ", SignedUp="
				+ SignedUp + ", getId()=" + getId() + ", getPrice()=" + getPrice() + ", getName()=" + getName()
				+ ", getBrand()=" + getBrand() + ", getSignedUp()=" + getSignedUp() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	}
	

	
	


