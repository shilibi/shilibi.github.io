package com.zx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IGuestAccountDao;
import com.zx.dao.impl.GuestAccountDaoImpl;
import com.zx.po.Guest;

public class GuestLoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8613666989371537582L;
	private String guestPhone;
	private String guestPwd;

	public String getGuestId() {
		return guestPhone;
	}

	public void setGuestId(String guestId) {
		this.guestPhone = guestId;
	}

	public String getGuestPwd() {
		return guestPwd;
	}

	public void setGuestPwd(String guestPwd) {
		this.guestPwd = guestPwd;
	}

	@Override
	public String execute() throws Exception {
		IGuestAccountDao guestAccountDao = new GuestAccountDaoImpl();
		Guest guest = null;
		System.out.println(guestPhone+":"+guestPwd);
		guest = guestAccountDao.GuestLogin(guestPhone, guestPwd);
		if (guest == null) {
			return ERROR;
		}else {
			return SUCCESS;
		}
	}

}
