package com.zx.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IEmpAccountDao;
import com.zx.dao.IFoodSaleDao;
import com.zx.dao.IGuestAccountDao;
import com.zx.dao.IRoomDao;
import com.zx.dao.impl.EmpAccountDaoImpl;
import com.zx.dao.impl.FoodSaleDaoImpl;
import com.zx.dao.impl.GuestAccountDaoImpl;
import com.zx.dao.impl.RoomDaoImpl;
import com.zx.po.Emp;
import com.zx.po.Guest;
import com.zx.po.Room;
import com.zx.util.DateTime;

public class GuestAction extends ActionSupport {
	IGuestAccountDao guestAccountDao = new GuestAccountDaoImpl();
	private String guestPhone;
	private String guestPwd;
	private String loginType;
	/*
	 * private String loginType;
	 */
	public String getLoginType() {
		return loginType;
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
			if (g != null) {
				// 成功---向session放值
				request.getSession().setAttribute("guestPhone", guestPhone);
				return "loginsuccess";
			} else {
				return "login";
				// 失败
			}
		case "Food":	
			Emp emp = empAccountDao.EmpLoginRoom(empId, empPwd);
			if(emp !=null) {
				request.getSession().setAttribute("guestPhone", empPwd);
				return "loginsuccess";
			}
			else {
				return "login";
			}
		case "Depart":
			Emp emp1 = empAccountDao.EmpLoginFood(empId, empPwd);
			if(emp1 !=null) {
				request.getSession().setAttribute("guestPhone", empPwd);
				return "loginsuccess";
			}
			else {
				return "login";
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
				List<Room> roomList = roomDao.selectRoom();//总房间数
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
				return "login";
			}
		default:
			return "login";
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
		guest.setGuestRegisterTime(DateTime.getSecondTimestamp());
		flag = guestAccountDao.GuestRegister(guest);
		if (flag == false) {
			return ERROR;
		} else {
			return SUCCESS;
		}
	}
}
