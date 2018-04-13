package com.zx.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="room")
public class Room {

	private int roomId;
	private String roomName;
	private float roomPrice;
	private char roomType;
	private char roomTv;
	private char roomPc;
	private String roomLct;
	private char roomStatus;
	private float roomArea;
	@Id
	@GenericGenerator(name = "roomGenerator",strategy = "native")
	@GeneratedValue(generator = "roomGenerator")
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
	public float getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(float roomPrice) {
		this.roomPrice = roomPrice;
	}
	public char getRoomType() {
		return roomType;
	}
	public void setRoomType(char roomType) {
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
	public char getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(char roomStatus) {
		this.roomStatus = roomStatus;
	}
	public float getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(float roomArea) {
		this.roomArea = roomArea;
	}
	@Override
	public String toString() {
		return "room [roomId=" + roomId + ", roomName=" + roomName + ", roomPrice=" + roomPrice + ", roomType="
				+ roomType + ", roomTv=" + roomTv + ", roomPc=" + roomPc + ", roomLct=" + roomLct + ", roomStatus="
				+ roomStatus + ", roomArea=" + roomArea + "]";
	}
	
}
