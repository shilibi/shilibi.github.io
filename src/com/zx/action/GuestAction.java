package com.zx.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IGuestAccountDao;
import com.zx.dao.impl.GuestAccountDaoImpl;
import com.zx.po.Guest;
import com.zx.util.DateTime;

public class GuestAction extends ActionSupport {
	IGuestAccountDao guestAccountDao = new GuestAccountDaoImpl();
	private String guestPhone;
	private String guestPwd;
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

	@Override
	public String execute() throws Exception {
		Guest guest = null;
		guest = guestAccountDao.GuestLogin(guestPhone, guestPwd);
		if (guest == null) {
			return ERROR;
		}else {
			return SUCCESS;
		}
	}

	public String login() {
		//1.得到request对象
		HttpServletRequest request = ServletActionContext.getRequest();
		String guestPhone = request.getParameter("guestPhone");
		String guestPwd = request.getParameter("guestPwd");
		IGuestAccountDao guestAccountDao = new GuestAccountDaoImpl();
		Guest g = guestAccountDao.GuestLogin(guestPhone, guestPwd);
		if(g!=null) {
			//成功---向session放值
			request.getSession().setAttribute("guestPhone", guestPhone);
			return "loginsuccess";
		}else {
			return "login";
			//失败
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
		if(flag == false) {
			return ERROR;
		}
		else {
			return SUCCESS;
		}
	}
}
