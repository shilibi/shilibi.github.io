package com.zx.po;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="room_guest_order")
public class RoomGuestOrder {
	
	private int roomId;
	private String guestPhone;
	private Date orderTime;
	private String liveTime;
	private String leaveTime;
	private String orderStatus;
	private String accountPhone;
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getGuestPhone() {
		return guestPhone;
	}
	public void setGuestPhone(String guestPhone) {
		this.guestPhone = guestPhone;
	}
	@Id
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getLiveTime() {
		return liveTime;
	}
	public void setLiveTime(String liveTime) {
		this.liveTime = liveTime;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getAccountPhone() {
		return accountPhone;
	}
	public void setAccountPhone(String accountPhone) {
		this.accountPhone = accountPhone;
	}
	@Override
	public String toString() {
		return "RoomGuestOrder [roomId=" + roomId + ", guestPhone=" + guestPhone + ", orderTime=" + orderTime
				+ ", liveTime=" + liveTime + ", leaveTime=" + leaveTime + ", orderStatus=" + orderStatus
				+ ", accountPhone=" + accountPhone + "]";
	}
	public RoomGuestOrder(int roomId, String guestPhone, Date orderTime, String liveTime, String leaveTime,
			String orderStatus, String accountPhone) {
		super();
		this.roomId = roomId;
		this.guestPhone = guestPhone;
		this.orderTime = orderTime;
		this.liveTime = liveTime;
		this.leaveTime = leaveTime;
		this.orderStatus = orderStatus;
		this.accountPhone = accountPhone;
	}
	public RoomGuestOrder() {
		super();
	}
	
	
	
}
