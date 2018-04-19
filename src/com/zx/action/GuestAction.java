package com.zx.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IGuestAccountDao;
import com.zx.dao.impl.GuestAccountDaoImpl;
import com.zx.po.Guest;

public class GuestAction extends ActionSupport {

	public String login() {
		//1.得到request对象
		HttpServletRequest request = ServletActionContext.getRequest();
		String guestId = request.getParameter("guestId");
		String guestPwd = request.getParameter("guestPwd");
		IGuestAccountDao guestAccountDao = new GuestAccountDaoImpl();
		Guest g = guestAccountDao.GuestLogin(guestId, guestPwd);
		if(g!=null) {
			//成功---向session放值
			request.getSession().setAttribute("guestId", guestId);
			
			return "loginsuccess";
		}else {
			return "login";
			//失败
		}
	}
}
