package com.zx.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IEmpAccountDao;
import com.zx.dao.IRoomDao;
import com.zx.dao.IRoomGuestOrderDao;
import com.zx.dao.impl.EmpAccountDaoImpl;
import com.zx.dao.impl.RoomDaoImpl;
import com.zx.dao.impl.RoomGuestDaoImpl;
import com.zx.po.Emp;
import com.zx.po.Guest;
import com.zx.po.Room;
import com.zx.po.RoomGuestOrder;
import com.zx.util.Md5Utils;

/**
 * @author SenseChuang
 * EmpAction.java
 * 上午11:46:22
 */
public class EmpAction extends ActionSupport{

	/**
	 * 
	 */
	
	IRoomGuestOrderDao rgoDao = new RoomGuestDaoImpl();
	IRoomDao  roomDao = new RoomDaoImpl();
	IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
	private List<Emp> list = new ArrayList<Emp>();
	private List<Room> roomList = new ArrayList<Room>();
	private List<RoomGuestOrder> rgoList = new ArrayList<RoomGuestOrder>();
	
	private String info;
	private String empName;
	private Date empLastLoginTime;
	private int totalSaleFood;
	
	public int getTotalSaleFood() {
		return totalSaleFood;
	}
	
	public List<RoomGuestOrder> getRgoList() {
		return rgoList;
	}

	public void setRgoList(List<RoomGuestOrder> rgoList) {
		this.rgoList = rgoList;
	}

	public void setTotalSaleFood(int totalSaleFood) {
		this.totalSaleFood = totalSaleFood;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getEmpLastLoginTime() {
		return empLastLoginTime;
	}

	public void setEmpLastLoginTime(Date empLastLoginTime) {
		this.empLastLoginTime = empLastLoginTime;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	private Emp emp = new Emp();
	
	public List<Emp> getList() {
		return list;
	}
	
	public Emp getEmp() {
		return emp;
	}
	
	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	private static final long serialVersionUID = 3355992534711651459L;
	public String list() throws Exception{
		IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
		list = empAccountDao.SearchAllEmp();
		System.out.println(list);
		return "success";
	}
	public String EmpInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
		String empId = request.getParameter("empId");
		emp.setEmpId(empId);
		emp = empAccountDao.SearchEmpById(emp.getEmpId());
		System.out.println(empId);
		
		return "success";
	}
	public String deleteEmp() {
		HttpServletRequest request = ServletActionContext.getRequest();
		IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
		String empId = request.getParameter("empId");
		System.out.println(empId);
		boolean flag = empAccountDao.deleteEmp(empId);
		if(flag==true) {
			return "success";
		}
		else
		{
			return "error";
		}
	}
	public String updateEmpInfo() {
		Emp e = new Emp();
		HttpServletRequest request = ServletActionContext.getRequest();
		IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
		String empId = request.getParameter("empId");
		String empName = request.getParameter("empName");
		String empSex = request.getParameter("empSex");
		String empPhone = request.getParameter("empPhone");
		String empDepart = request.getParameter("empDepart");
		String empJob = request.getParameter("empJob");
		int empDepart1 = Integer.parseInt(empDepart);
		e = empAccountDao.SearchEmpById(empId);
		e.setEmpName(empName);
		e.setEmpSex(empSex);
		e.setEmpJob(empJob);
		e.setEmpPhone(empPhone);
		e.setEmpDepart(empDepart1);
		System.out.println(e.toString());
		boolean flag = empAccountDao.updateEmp(e);
		if(flag==true) {
			return "success";
		}
		else {
			return "error";
		}
	}
	public String searchEmpInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String info = request.getParameter("info");
		IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
		System.out.println(info);
		list = empAccountDao.SearchEmpByInfo(info);
		System.out.println(list);
		return "success";
	}
	public String addEmp() {
		HttpServletRequest request = ServletActionContext.getRequest();
		IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
		Emp e = new Emp();
		e.setEmpName(request.getParameter("empName"));
		e.setEmpSex(request.getParameter("empSex"));
		System.out.println(e.getEmpSex());
		e.setEmpPhone(request.getParameter("empPhone"));
		e.setEmpJob(request.getParameter("empJob"));
		e.setEmpDepart(Integer.parseInt(request.getParameter("empDepart")));
		System.out.println(e.toString());
		boolean flag = empAccountDao.addEmp(e);
		if(flag==true) {
			return "success";
		}
		else {
			return "error";
		}
	}
	public String roomList() {
		IRoomDao roomDao = new RoomDaoImpl();
		roomList = roomDao.selectRoom();
		return "success";
	}
	public String selectOrder() {
		rgoList = rgoDao.searchAllOrder();
		return "success";
	}
	public String liveOrder() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String date= request.getParameter("orderTime");
		RoomGuestOrder rgo = rgoDao.searchOrderByOrderTime(date);
		rgo.setOrderStatus("已入住");
		boolean f = rgoDao.updateOrder(rgo);
		Room r = roomDao.searchRoomByRoomId(rgo.getRoomId());
		r.setRoomStatus("已入住");
		boolean flag = roomDao.updateRoom(r);
		if(flag==true && f==true) {
			return "success";
		}
		else {
			return "error";
		}
	}
	public String updatePwd() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String Phone = (String) request.getSession().getAttribute("empId");
		Emp e = new Emp();
		e.setEmpId(Phone);
		e.setEmpPwd(request.getParameter("empPwd"));
		Emp rsEmp = empAccountDao.EmpLoginAdmin(e.getEmpId(), e.getEmpPwd());
		if(rsEmp==null){
			return "retry";
		}
		else {
			System.out.println(rsEmp.toString());
			System.out.println(request.getParameter("newPwd"));
			rsEmp.setEmpPwd(Md5Utils.md5(request.getParameter("newPwd")));
			boolean flag = empAccountDao.updateEmp(rsEmp);
			if(flag==true) {
				return "success";
			}
			else{
				return "error";
			}
		}
	}
	public String updatePwdFood() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String Phone = (String) request.getSession().getAttribute("empId");
		Emp e = new Emp();
		e.setEmpId(Phone);
		e.setEmpPwd(request.getParameter("empPwd"));
		Emp rsEmp = empAccountDao.EmpLoginFood(e.getEmpId(), e.getEmpPwd());
		if(rsEmp==null){
			return "retry";
		}
		else {
			System.out.println(rsEmp.toString());
			System.out.println(request.getParameter("newPwd"));
			rsEmp.setEmpPwd(Md5Utils.md5(request.getParameter("newPwd")));
			boolean flag = empAccountDao.updateEmp(rsEmp);
			if(flag==true) {
				return "success";
			}
			else{
				return "error";
			}
		}
	}public String updatePwdRoom() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String Phone = (String) request.getSession().getAttribute("empId");
		Emp e = new Emp();
		e.setEmpId(Phone);
		e.setEmpPwd(request.getParameter("empPwd"));
		Emp rsEmp = empAccountDao.EmpLoginRoom(e.getEmpId(), e.getEmpPwd());
		if(rsEmp==null){
			return "retry";
		}
		else {
			System.out.println(rsEmp.toString());
			System.out.println(request.getParameter("newPwd"));
			rsEmp.setEmpPwd(Md5Utils.md5(request.getParameter("newPwd")));
			boolean flag = empAccountDao.updateEmp(rsEmp);
			if(flag==true) {
				return "success";
			}
			else{
				return "error";
			}
		}
	}
}
