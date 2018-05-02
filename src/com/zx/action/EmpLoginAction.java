package com.zx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zx.dao.IEmpAccountDao;
import com.zx.dao.impl.EmpAccountDaoImpl;
import com.zx.po.Emp;
import com.zx.po.Guest;


public class EmpLoginAction extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4791439472313031547L;
	/**
	 * 
	 */
	private String empId;
	private String empPwd;
	

	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	@Override
	public String execute() throws Exception {
		IEmpAccountDao empAccountDao = new EmpAccountDaoImpl();
		Emp e = null;
		e = empAccountDao.EmpLoginRoom(empId, empPwd);
		if(e == null) {
			return ERROR;
		}
		else {
			return SUCCESS;
		}
	}



	
}
