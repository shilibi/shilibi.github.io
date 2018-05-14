package com.zx.po;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foodsale")
public class FoodSale {
	
	private Date saleDate;
	private int foodId;
	private int foodNumber;
	private int foodTotalPrice;
	@Id
	
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public int getFoodNumber() {
		return foodNumber;
	}
	public void setFoodNumber(int foodNumber) {
		this.foodNumber = foodNumber;
	}
	public int getFoodTotalPrice() {
		return foodTotalPrice;
	}
	public void setFoodTotalPrice(int foodTotalPrice) {
		this.foodTotalPrice = foodTotalPrice;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	@Override
	public String toString() {
		return "FoodSale [saleDate=" + saleDate + ", foodId=" + foodId + ", foodNumber=" + foodNumber
				+ ", foodTotalPrice=" + foodTotalPrice + "]";
	}
	
}
