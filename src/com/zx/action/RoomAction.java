package com.zx.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IEmpAccountDao;
import com.zx.dao.IRoomDao;
import com.zx.dao.impl.EmpAccountDaoImpl;
import com.zx.dao.impl.RoomDaoImpl;
import com.zx.po.Room;

public class RoomAction extends ActionSupport{

	/**
	 * 
	 */
	private List<Room> roomList = new ArrayList<Room>();
	private Room room = new Room();
	IRoomDao roomDao  = new RoomDaoImpl();
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	private static final long serialVersionUID = 647860644711045889L;

	public String list() {
		IRoomDao roomDao = new RoomDaoImpl();
		roomList = roomDao.selectRoom();
		System.out.println(roomList);
		return "success";
	}
	public String roomInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String roomId = request.getParameter("roomId");
		System.out.println(roomId);
		int roomId1 = Integer.parseInt(roomId);
		System.out.println(roomId);
		room = roomDao.searchRoomByRoomId(roomId1);
		return "success";
	}
	public String updateRoom() {
		Room r = new Room();
		HttpServletRequest request = ServletActionContext.getRequest();
		r.setRoomId(Integer.parseInt(request.getParameter("roomId")));
		r.setRoomName(request.getParameter("roomName"));
		r.setRoomPrice(Integer.parseInt(request.getParameter("roomPrice")));
		r.setRoomType(request.getParameter("roomType"));
		r.setRoomTv(request.getParameter("roomTv").charAt(0));//强转为char类型
		r.setRoomPc(request.getParameter("roomPc").charAt(0));
		r.setRoomLct(request.getParameter("roomLct"));
		r.setRoomStatus(request.getParameter("roomStatus"));
		r.setRoomArea(request.getParameter("roomArea"));
		System.out.println(r.toString());
		IRoomDao roomDao = new RoomDaoImpl();
		boolean flag = roomDao.updateRoom(r);
		if(flag==false) {
			return "error";
		}
		else {
			return "success";
		}
	}
	public String deleteRoom() {
		HttpServletRequest request = ServletActionContext.getRequest();
		IRoomDao roomDaoImpl = new RoomDaoImpl();
		String roomId = request.getParameter("roomId");
		int roomId1 = Integer.parseInt(roomId);
		boolean flag = roomDaoImpl.deleteRoom(roomId1);
		if(flag==true) {
			return "success";
		}
		else
		{
			return "error";
		}
	}
	public String searchRoom() {
		HttpServletRequest request = ServletActionContext.getRequest();
		roomList = roomDao.searchRoomByName(request.getParameter("info"));
		return "success";
	}
}
