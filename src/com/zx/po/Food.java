package com.zx.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="food")
public class Food {
	
	private int foodId;
	private String foodName;
	private int foodPrice;
	private char foodUnit;
	@Id
	@GenericGenerator(name="foodGenerator",strategy="native")//主键自增
	@GeneratedValue(generator="foodGenerator")
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
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
	
	public Food(int foodId, String foodName, int foodPrice, char foodUnit) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodUnit = foodUnit;
	}
	public Food(String foodName, int foodPrice, char foodUnit) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodUnit = foodUnit;
	}
	public Food() {
		super();
	}
	@Override
	public String toString() {
		return "food [foodId=" + foodId + ", foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodUnit="
				+ foodUnit + "]";
	}
	
}
