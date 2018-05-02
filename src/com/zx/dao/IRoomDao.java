package com.zx.dao;

import java.util.List;

import com.zx.po.Room;

/**
 * @author SenseChuang
 * IRoomDao.java
 * 上午11:42:45
 */
public interface IRoomDao {

	
	
	
	/*
	 * 查看房间
	 * 参数：null
	 * 返回值：room
	 */
	List<Room> selectRoom();
	/*
	 * 添加房间
	 * 参数；room
	 * 返回值：boolean
	 */
	boolean addRoom(Room room);
	
	/*
	 * 删除房间
	 * 参数：roomId
	 * 返回值：boolean
	 */
	boolean deleteRoom(int roomId);
	
	/*
	 * 修改房间
	 * 参数：room
	 * 返回值：boolean
	 */
	boolean updateRoom(Room room);
	
	/*
	 * 通过房间名搜索
	 * 
	 */
	List<Room> searchRoomByName(String roomName);
	/*
	 * 根据房间id搜索
	 * 参数：int empId
	 * 返回值：Room
	 */
	Room searchRoomByRoomId(int roomId);
	/*
	 * 查询今日入住收入金额
	 * 参数：null
	 * 返回值：int
	 */
	int searchTodayRoomSale();
	/*
	 * 查询今日入住房间数
	 * 参数：null
	 * 返回值：int
	 */
	int searchTodayRoomSaleNo();
	/*
	 * 查询指定日期入住房间数
	 */
}
