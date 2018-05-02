package com.zx.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IEmpAccountDao;
import com.zx.dao.IFoodSaleDao;
import com.zx.dao.impl.EmpAccountDaoImpl;
import com.zx.dao.impl.FoodSaleDaoImpl;
import com.zx.po.Emp;

/**
 * @author SenseChuang
 * EmpAction.java
 * 上午11:46:22
 */
public class EmpAction extends ActionSupport{

	/**
	 * 
	 */
	private List<Emp> list = new ArrayList<Emp>();
	
	private String info;
	private String empName;
	private Date empLastLoginTime;
	private int totalSaleFood;
	public int getTotalSaleFood() {
		return totalSaleFood;
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
}
