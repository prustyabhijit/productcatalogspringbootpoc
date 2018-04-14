package com.example.springboot.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	public static Long nextId = 0L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "PRODUCT_NAME")
	protected String productName;
	
	@Column(name = "TYPE")
	protected String type;
	
	@Column(name = "LIST_PRICE")
	protected BigDecimal listPrice;
	
	@Column(name="PRODUCT_CODE")
	protected String productCode;

	protected static Long getNextId() {
		synchronized (nextId) {
			return nextId++;
		}
	}

	protected Product() {
		
	}

	public Product(String productName, String type, BigDecimal listPrice, String productCode) {
		this.productName = productName;
		this.type=type;
		this.listPrice = listPrice;
		this.productCode = productCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}
	
	

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", type=" + type + ", listPrice=" + listPrice
				+ "]";
	}

	

	
	

}
