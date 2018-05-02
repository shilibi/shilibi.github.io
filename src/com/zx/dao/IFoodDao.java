package com.zx.dao;

import java.util.List;

import com.zx.po.Food;

public interface IFoodDao {

	/*
	 * 查询食品
	 * 参数：null
	 * 返回值:List<Food>
	 */
	List<Food> selectFood();
	
	/*
	 * 添加食品
	 * 参数：Food food
	 * 返回值：boolean
	 */
	boolean addFood(Food food);
	/*
	 * 删除食品
	 * 参数：Food 
	 * 返回值：boolean
	 */
	boolean deleteFood(Food food);
	/*
	 * 更新食品
	 * 参数:Food
	 * 返回值：boolean
	 */
	boolean updateFood(Food food);
	/*
	 * 查询食品
	 * 参数:String foodContent
	 * 返回值：List<Food>
	 */
	List<Food> selectFoodByContent(String foodContent);
	/*
	 * 根据id查询食品
	 * 参数:int foodId
	 * 返回值：Food
	 */
	Food searchFoodByFoodId(int foodId);
}
