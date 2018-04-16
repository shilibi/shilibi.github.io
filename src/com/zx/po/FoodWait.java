package com.zx.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="food_wait")
public class FoodWait {

	private String foodName;
	private double foodPrice;
	private char foodUnit;
	private String food_waitTime;
	private int empId;
	@Id
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public char getFoodUnit() {
		return foodUnit;
	}
	public void setFoodUnit(char foodUnit) {
		this.foodUnit = foodUnit;
	}
	public String getFood_waitTime() {
		return food_waitTime;
	}
	public void setFood_waitTime(String food_waitTime) {
		this.food_waitTime = food_waitTime;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public FoodWait(String foodName, double foodPrice, char foodUnit, String food_waitTime, int empId) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodUnit = foodUnit;
		this.food_waitTime = food_waitTime;
		this.empId = empId;
	}
	public FoodWait() {
		super();
	}
	@Override
	public String toString() {
		return "FoodWait [foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodUnit=" + foodUnit
				+ ", food_waitTime=" + food_waitTime + ", empId=" + empId + "]";
	}
}
