package com.zx.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room {

	private int roomId;
	private String roomName;
	private int roomPrice;
	private String roomType;
	private char roomTv;
	private char roomPc;
	private String roomLct;
	private String roomStatus;
	private String roomArea;
	@Id
/*	@GenericGenerator(name = "roomGenerator",strategy = "native")
	@GeneratedValue(generator = "roomGenerator")*/
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public char getRoomTv() {
		return roomTv;
	}
	public void setRoomTv(char roomTv) {
		this.roomTv = roomTv;
	}
	public char getRoomPc() {
		return roomPc;
	}
	public void setRoomPc(char roomPc) {
		this.roomPc = roomPc;
	}
	public String getRoomLct() {
		return roomLct;
	}
	public void setRoomLct(String roomLct) {
		this.roomLct = roomLct;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	public String getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomName=" + roomName + ", roomPrice=" + roomPrice + ", roomType="
				+ roomType + ", roomTv=" + roomTv + ", roomPc=" + roomPc + ", roomLct=" + roomLct + ", roomStatus="
				+ roomStatus + ", roomArea=" + roomArea + "]";
	}

	
}
