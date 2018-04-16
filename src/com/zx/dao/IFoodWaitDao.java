package com.zx.dao;

import java.util.List;

import com.zx.po.FoodWait;

public interface IFoodWaitDao {

	/*
	 * 添加待审核菜品
	 * 参数：foodWait
	 * 返回值：boolean
	 */
	boolean addFoodWait(FoodWait foodWait);
	/*
	 * 查看待审核菜品
	 * 参数: null
	 * 返回值：List<FoodWait>
	 */
	List<FoodWait> selectFoodWait();
	/*
	 * 删除待审核菜品
	 * 参数：foodName
	 * 返回值：boolean
	 */
	boolean deleteFoodWait(FoodWait foodWait);
	/*
	 * 更新待审核菜品
	 * 参数：foodWait
	 * 返回值：boolean
	 */
	boolean updateFoodWait(FoodWait foodWait);
}
