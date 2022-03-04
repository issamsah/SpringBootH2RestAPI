package com.springboot.h2.restapi.ex.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author isahmoudi
 *
 */
@Entity
@Table(name = "prices")
public class Prices {
	@Id
	@Column(name = "PRICE_LIST")
	private int priceList;
	@Column(name = "BRAND_ID")
	private int brandId;
	@Column(name = "PRIORITY")
	private int priority;
	@Column(name = "PRODUCT_ID")
	private int productId;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "CURR")
	private String curr;
	@Column(name = "START_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
	private Date startDate;
	@Column(name = "END_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
	private Date endDate;
	
	

	public Prices() {
		super();
	}
	

	public Prices(int priceList, int brandId, int priority, int productID, double price, String curr, Date startDate,
			Date endDate) {
		super();
		this.priceList = priceList;
		this.brandId = brandId;
		this.priority = priority;
		this.productId = productID;
		this.price = price;
		this.curr = curr;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public int getPriceList() {
		return priceList;
	}

	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getProductID() {
		return productId;
	}

	public void setProductID(int productID) {
		this.productId = productID;
	}


	@Override
	public String toString() {
		return "Prices [priceList=" + priceList + ", brandId=" + brandId + ", priority=" + priority + ", productID="
				+ productId + ", price=" + price + ", curr=" + curr + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	

}
