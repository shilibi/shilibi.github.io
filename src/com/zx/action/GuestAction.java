package com.zx.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IEmpAccountDao;
import com.zx.dao.IFoodSaleDao;
import com.zx.dao.IGuestAccountDao;
import com.zx.dao.IRoomDao;
import com.zx.dao.IRoomGuestOrderDao;
import com.zx.dao.impl.EmpAccountDaoImpl;
import com.zx.dao.impl.FoodSaleDaoImpl;
import com.zx.dao.impl.GuestAccountDaoImpl;
import com.zx.dao.impl.RoomDaoImpl;
import com.zx.dao.impl.RoomGuestDaoImpl;
import com.zx.po.Emp;
import com.zx.po.Guest;
import com.zx.po.Room;
import com.zx.po.RoomGuestOrder;
import com.zx.util.Md5Utils;

public class GuestAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3013140172130206330L;
	IGuestAccountDao guestAccountDao = new GuestAccountDaoImpl();
	IRoomGuestOrderDao rgoDao = new RoomGuestDaoImpl();
	private List<RoomGuestOrder>  rgoList= new ArrayList<RoomGuestOrder>();
	private String guestPhone;
	private String guestPwd;
	private String loginType;
	private List<Room> roomList = new ArrayList<Room>();
	/*
	 * private String loginType;
	 */
	
	public String getLoginType() {
		return loginType;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getGuestPhone() {
		return guestPhone;
	}

	public void setGuestPhone(String guestPhone) {
		this.guestPhone = guestPhone;
	}

	public String getGuestPwd() {
		return guestPwd;
	}

	public void setGuestPwd(String guestPwd) {
		this.guestPwd = guestPwd;
	}

	public IGuestAccountDao getGuestAccountDao() {
		return guestAccountDao;
	}

	public void setGuestAccountDao(IGuestAccountDao guestAccountDao) {
		this.guestAccountDao = guestAccountDao;
	}

	public List<RoomGuestOrder> getRgoList() {
		return rgoList;
	}

	public void setRgoList(List<RoomGuestOrder> rgoList) {
		this.rgoList = rgoList;
	}

	@Override
	public String execute() throws Exception {
		Guest guest = null;
		guest = guestAccountDao.GuestLogin(guestPhone, guestPwd);
		if (guest == null) {
			return ERROR;
		} else {
			return SUCCESS;
		}
	}

	public String login() {
		// 1.得到request对象
		HttpServletRequest request = ServletActionContext.getRequest();
		String loginType = request.getParameter("loginType");
		String empId = request.getParameter("guestPhone");
		String empPwd = request.getParameter("guestPwd");
		IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
		switch (loginType) {
		case "Customer":			
			String guestPhone = request.getParameter("guestPhone");
			String guestPwd = request.getParameter("guestPwd");
			IGuestAccountDao guestAccountDao = new GuestAccountDaoImpl();
			Guest g = guestAccountDao.GuestLogin(guestPhone, guestPwd);
			if (g != null) {//获取上次登陆时间，并将登录时间更新为现在时间
				// 成功---向session放值
				request.getSession().setAttribute("guestPhone", guestPhone);
			    Guest guest = guestAccountDao.searchGuestById(guestPhone);
				//将值传到前台页面
				request.getSession().setAttribute("empName", guest.getGuestName());
				request.getSession().setAttribute("empLastLoginTime", guest.getGuestLastLoginTime());	
				//更新登录时间
				Date date = new Date();
				guest.setGuestLastLoginTime(date);
				boolean flag = guestAccountDao.updateGuest(guest);
				if(flag==true) {
					return "guest_Loginsuccess";
				}
				else {
					return "error";
				}
			} else {
				return "error";
				// 失败
			}
		case "Food":	
			Emp emp = empAccountDao.EmpLoginFood(empId, empPwd);
			if(emp !=null) {
				request.getSession().setAttribute("empId", empId);
				request.getSession().setAttribute("empName", emp.getEmpName());
				request.getSession().setAttribute("empLastLoginTime", emp.getEmpLastLoginTime());
				//更新最后一次登录时间
				Date date = new Date();
				emp.setEmpLastLoginTime(date);
				boolean flag = empAccountDao.updateEmp(emp);
				if(flag==true) {
					return "loginsuccess_room";
				}
				return "error";
			}
			else {
				return "error";
			}
			//客房部
		case "Depart":
			Emp emp1 = empAccountDao.EmpLoginRoom(empId, empPwd);
			if(emp1 !=null) {
				request.getSession().setAttribute("guestPhone", empPwd);
				request.getSession().setAttribute("empId", empId);
				request.getSession().setAttribute("empName", emp1.getEmpName());
				request.getSession().setAttribute("empLastLoginTime", emp1.getEmpLastLoginTime());
				Date date = new Date();
				emp1.setEmpLastLoginTime(date);
				boolean flag = empAccountDao.updateEmp(emp1);
				IRoomDao roomDao = new RoomDaoImpl();
				int roomSale = roomDao.searchTodayRoomSale();//今日房间收入
				int roomSaleNo = roomDao.searchTodayRoomSaleNo();//今日房间入住个数
				List<Room> roomList = roomDao.selectRoom();//总房间数
				int roomNo = roomList.size();
				request.getSession().setAttribute("roomSale", roomSale);
				request.getSession().setAttribute("roomSaleNo", roomSaleNo);
				request.getSession().setAttribute("roomNo", roomNo);
				if(flag==true) {
					return "departLoginsuccess";
				}
				else {
					return "error";
				}
			}
			else {
				return "error";
			}
		case "Admin":
			Emp emp2 = empAccountDao.EmpLoginAdmin(empId, empPwd);
			if(emp2 !=null) {
				Date currentTime = new Date();
				//获取当前时间（yyyy-MM-dd)
			    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			    String dateString = formatter.format(currentTime);
				emp = empAccountDao.SearchEmpById(empId);
				IFoodSaleDao foodSaleDao = new FoodSaleDaoImpl();
				//根据当前日期获取今日菜品收入
				int totalSaleFood = foodSaleDao.searchTotalFoodSale(dateString);
				System.out.println(totalSaleFood);
				Emp empById = empAccountDao.SearchEmpById(empId);
				String empName = empById.getEmpName();
				Date empLastLoginTime = empById.getEmpLastLoginTime();
				//查询今日入住人数
				IRoomDao roomDao = new RoomDaoImpl();
				int roomSale = roomDao.searchTodayRoomSale();//今日房间收入
				int roomSaleNo = roomDao.searchTodayRoomSaleNo();//今日房间入住个数
				 roomList = roomDao.selectRoom();//总房间数
				int roomNo = roomList.size();
				//将值传到前台页面
				request.getSession().setAttribute("empName", empName);
				request.getSession().setAttribute("empLastLoginTime", empLastLoginTime);	
				request.getSession().setAttribute("totalSaleFood", totalSaleFood);
				request.getSession().setAttribute("roomSale", roomSale);
				request.getSession().setAttribute("roomSaleNo", roomSaleNo);
				request.getSession().setAttribute("roomNo", roomNo);
				//更新登录时间
				Date date = new Date();
				empById.setEmpLastLoginTime(date);
				empAccountDao.updateEmp(empById);
				return "loginsuccess";
			}
			else {
				return "error";
			}
		default:
			return "error";
		}
		
	}

	public String register() {
		boolean flag = false;
		Guest guest = new Guest();
		HttpServletRequest request = ServletActionContext.getRequest();
		String guestPhone = request.getParameter("guestPhone");
		String guestPwd = request.getParameter("guestPwd");
		guest.setGuestPhone(guestPhone);
		guest.setGuestPwd(guestPwd);
		Date date = new Date();
		guest.setGuestRegisterTime(date);
		flag = guestAccountDao.GuestRegister(guest);
		if (flag == false) {
			return ERROR;
		} else {
			return SUCCESS;
		}
	}
	public String orderGuest() {
		HttpServletRequest request = ServletActionContext.getRequest();
		//将订单加入到预约订单
		Date date = new Date();
		String Phone = (String) request.getSession().getAttribute("guestPhone");
		RoomGuestOrder rgo = new RoomGuestOrder();
		rgo.setRoomId(Integer.parseInt(request.getParameter("roomId")));
		rgo.setAccountPhone(Phone);
		rgo.setGuestPhone(request.getParameter("guestPhone"));
		rgo.setLiveTime(request.getParameter("liveTime"));
		rgo.setLeaveTime(request.getParameter("leaveTime"));
		rgo.setOrderTime(date);
		rgo.setOrderStatus("已预约");
		System.out.println(rgo.toString());
		boolean flag = rgoDao.addRgo(rgo);
		if(flag==true) {
			return "success";
		}
		else {
			return "error";
		}
	}
	public String listOrder() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String Phone = (String) request.getSession().getAttribute("guestPhone");
		rgoList = rgoDao.searchOrderByGuestPhone(Phone);
		return "success";
	}
	public String updatePwd() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String Phone = (String) request.getSession().getAttribute("guestPhone");
		Guest g = new Guest();
		g.setGuestPhone(Phone);
		g.setGuestPwd(request.getParameter("guestPwd"));
		System.out.println(g.toString());
		Guest gue = guestAccountDao.GuestLogin(g.getGuestPhone(), g.getGuestPwd());
		if(gue==null){
			return "retry";
		}
		else {
			System.out.println(gue.toString());
			System.out.println(request.getParameter("newPwd"));
			gue.setGuestPwd(Md5Utils.md5(request.getParameter("newPwd")));
			boolean flag = guestAccountDao.updateGuest(gue);
			if(flag==true) {
				return "success";
			}
			else{
				return "error";
			}
		}
	}
}
