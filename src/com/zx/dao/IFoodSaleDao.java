package com.zx.dao;

public interface IFoodSaleDao {

	/*
	 * 查询某日菜品
	 * 参数：String date
	 * 返回值 ：int
	 */
	int searchTotalFoodSale(String Date);
}
