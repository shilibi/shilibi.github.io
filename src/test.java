import org.junit.Test;

import com.zx.dao.IEmpAccount;
import com.zx.dao.IGuestAccount;
import com.zx.dao.impl.EmpAccountImpl;
import com.zx.dao.impl.GuestAccountImpl;
import com.zx.po.Guest;

public class test {

/*	guest.setGuestName("黄仁勋");
	guest.setGuestPwd("123456");
	guest.setGuestCdtType("身份证");
	guest.setGuestId("178151425562114978");*/
	@Test
	public void testEmpLogin() {
	//	Emp e = null;
		//e.setEmpId(100000);
		//e.setEmpPwd("123456");
		IEmpAccount empDao = new EmpAccountImpl();
		empDao.EmpLogin(100000, "123456");
	}
	
	@Test
	public void testGuestLogin() {
		String guestPhone = "15544845878";
		String guestPwd = "123456";
		IGuestAccount guestDao = new GuestAccountImpl();
		Guest guestLoginRs = guestDao.GuestLogin(guestPhone,guestPwd);
	}
	@Test
	public void testGuestRegister()
	{
		Guest guest = new Guest("黄仁勋","123456","male","身份证","178151425562124978","15544845878");
		IGuestAccount guestDao = new GuestAccountImpl();
		guestDao.GuestRegister(guest);
		System.out.println(guest.toString());
	}

}
