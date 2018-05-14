package com.zx.dao;

import java.util.Date;
import java.util.List;

import com.zx.po.RoomGuestOrder;

public interface IRoomGuestOrderDao {

	/*
	 * 查询所有订单
	 *参数：null
	 *返回值：List<RoomGuestOrder>
	 */
	List<RoomGuestOrder> searchAllOrder();
	

	/*
	 * 查询未入住订单
	 * 参数: null
	 * 返回值：List<RoomGuestOrder>
	 */
	List<RoomGuestOrder> searchNotInOrder();
	/*
	 * 根据入住人查询
	 * 参数 :string guestPhone
	 * 返回值: List<RoomGuestOrder>
	 */
	List<RoomGuestOrder> searchOrderByGuestPhone(String accountPhone);
	/*
	 * 更新订单
	 * 参数：RoomGuestOrder
	 * 返回值：boolean
	 */
	boolean updateOrder(RoomGuestOrder rgo);
	/*
	 * 添加预约订单
	 * 参数：RoomGuestOrder rgo
	 * 返回值：boolean
	 */
	boolean addRgo(RoomGuestOrder rgo);
	/*
	 * 根据订单日期查询
	 * 参数:orderTime
	 * 返回值:RoomGuestOrder
	 */
	RoomGuestOrder searchOrderByOrderTime(String orderTime);
}
