package com.alituran.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;

	private String name;
	
	private String surname;
	
	private String password;
	
	private LocalDate dateOfBirth;

	private String emailAddress;
	
	private String homeAddress;
	
	private String workAddress;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> orderedProduct;
	
    @OneToMany(cascade = CascadeType.ALL)
	private List<Product> favoriteProducts;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<CreditCard> creditCards;

	
	public User(Long id, String username, String name, String surname, String password, LocalDate dateOfBirth,
			String emailAddress, String homeAddress, String workAddress, List<Product> orderedProduct,
			List<Product> favoriteProducts, List<CreditCard> creditCards) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
		this.orderedProduct = orderedProduct;
		this.favoriteProducts = favoriteProducts;
		this.creditCards = creditCards;
	}
	
	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public List<Product> getOrderedProduct() {
		return orderedProduct;
	}

	public void setOrderedProduct(List<Product> orderedProduct) {
		this.orderedProduct = orderedProduct;
	}

	public List<Product> getFavoriteProducts() {
		return favoriteProducts;
	}

	public void setFavoriteProducts(List<Product> favoriteProducts) {
		this.favoriteProducts = favoriteProducts;
	}

	public List<CreditCard> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}
	
	
	
	
}
