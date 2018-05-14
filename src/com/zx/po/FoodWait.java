package com.zx.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="food_wait")
public class FoodWait {

	private String foodName;
	private int foodPrice;
	private char foodUnit;
	private String food_waitTime;
	private int empId;
	private String foodWaitStatus;
	@Id
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
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
	public String getFoodWaitStatus() {
		return foodWaitStatus;
	}
	public void setFoodWaitStatus(String foodWaitStatus) {
		this.foodWaitStatus = foodWaitStatus;
	}
	public FoodWait(String foodName, int foodPrice, char foodUnit, String food_waitTime, int empId,
			String foodWaitStatus) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodUnit = foodUnit;
		this.food_waitTime = food_waitTime;
		this.empId = empId;
		this.foodWaitStatus = foodWaitStatus;
	}
	public FoodWait() {
		super();
	}
	@Override
	public String toString() {
		return "FoodWait [foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodUnit=" + foodUnit
				+ ", food_waitTime=" + food_waitTime + ", empId=" + empId + ", foodWaitStatus=" + foodWaitStatus + "]";
	}

}
