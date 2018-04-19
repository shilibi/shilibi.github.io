package com.zx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zx.dao.IGuestAccountDao;
import com.zx.dao.impl.GuestAccountDaoImpl;
import com.zx.po.Guest;


public class GuestRegisterAction extends ActionSupport implements ModelDriven<Guest> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9121380933213720738L;
	private Guest guest = new Guest();
	
	@Override
	public Guest getModel() {
		return guest;
	}

	
	@Override
	public String execute() throws Exception {
		IGuestAccountDao guestAccountDao = new GuestAccountDaoImpl();
		boolean flag = guestAccountDao.GuestRegister(this.guest);
		if(flag==true) {
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}



	
}
