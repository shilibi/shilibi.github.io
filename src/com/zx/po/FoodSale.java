package com.zx.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foodsale")
public class FoodSale {
	
	private String saleDate;
	private int foodId;
	private int foodNumber;
	private int foodTotalPrice;
	@Id
	public String getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}
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
	@Override
	public String toString() {
		return "FoodSale [saleDate=" + saleDate + ", foodId=" + foodId + ", foodNumber=" + foodNumber
				+ ", foodTotalPrice=" + foodTotalPrice + "]";
	}
	
}
