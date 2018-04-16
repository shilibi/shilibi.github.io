package com.zx.dao;

import java.util.List;

import com.zx.po.LogRoom;

public interface ILogRoomDao {
		
	/*
	 * 添加日志
	 * 参数：LogRoom
	 * 返回值：boolean
	 */
	boolean addLogRoom(LogRoom logRoom);
	
	/*
	 * 查看日志
	 * 参数：无参
	 * 返回值：List<LogRoom>
	 */
	List<LogRoom> selectLogRoom();
	
	/*
	 * 根据内容查询日志
	 * 参数：String content
	 * 返回值：List<LogRoom>
	 */
	List<LogRoom> searchLogRoomByContent(String content);
}
