import java.util.List;

import org.junit.Test;

import com.zx.dao.IEmpAccountDao;
import com.zx.dao.IGuestAccountDao;
import com.zx.dao.IRoomDao;
import com.zx.dao.impl.EmpAccountDaoImpl;
import com.zx.dao.impl.GuestAccountDaoImpl;
import com.zx.dao.impl.RoomDaoImpl;
import com.zx.po.Guest;
import com.zx.po.Room;

public class test {

	@Test
	/*
	 * 员工登录功能测试
	 */
	public void testEmpLogin() {
	//	Emp e = null;
		//e.setEmpId(100000);
		//e.setEmpPwd("123456");
		IEmpAccountDao empDao = new EmpAccountDaoImpl();
		empDao.EmpLogin(100000, "123456");
	}
	
	@Test
	/*
	 * 顾客登录功能测试
	 */
	public void testGuestLogin() {
		String guestPhone = "15544845878";
		String guestPwd = "123456";
		IGuestAccountDao guestDao = new GuestAccountDaoImpl();
		Guest guestLoginRs = guestDao.GuestLogin(guestPhone,guestPwd);
	}
	@Test
	/*
	 * 顾客注册功能测试
	 */
	public void testGuestRegister()
	{
		Guest guest = new Guest("黄仁勋","123456","male","身份证","178151425562124978","15544845878");
		IGuestAccountDao guestDao = new GuestAccountDaoImpl();
		guestDao.GuestRegister(guest);
		System.out.println(guest.toString());
	}
	/*
	 * 查询房间功能测试
	 */
	@Test
	public void testselectRoom() {
		int roomId =6002;
		IRoomDao roomDao = new RoomDaoImpl();
		Room r = roomDao.selectRoom(roomId);
		System.out.println(r.toString());
	}

	@Test
	/*
	 * 添加房间功能测试
	 */
	public void testAddRoom() {
		Room room = new Room();
		room.setRoomId(8888);
		room.setRoomName("堪培拉");
		IRoomDao roomDao = new RoomDaoImpl();
		roomDao.addRoom(room);
		System.out.println(room.toString());
	}
	@Test
	/*
	 * 删除房间功能测试
	 */
	public void testDeleteRoom() {
		int roomId = 8888;
		IRoomDao roomDao = new RoomDaoImpl();
		roomDao.deleteRoom(roomId);
	}
	@Test
	/*
	 * 更新房间功能测试
	 *
	 */
	public void testUpdateRoom() {
		Room room = new Room();
		room.setRoomName("圣都国际");
		room.setRoomId(8888);
		IRoomDao roomDao = new RoomDaoImpl();
		roomDao.updateRoom(room);
		
	}
	@Test
	public void testSearchRoomByName() {
		String  roomName = "港";
		IRoomDao roomDao = new RoomDaoImpl();
		roomDao.searchRoomByName(roomName);
	}
}
