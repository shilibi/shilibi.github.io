package com.zx.dao;

import com.zx.po.FoodSale;

public interface IFoodSaleDao {

	/*
	 * 查询某日菜品
	 * 参数：String date
	 * 返回值 ：int
	 */
	int searchTotalFoodSale(String Date);
	/*
	 * 添加销售菜品
	 * 参数 ：foodSale
	 * 返回值:boolean
	 */
	boolean addFoodSale(FoodSale fs);
	
}
