import org.junit.Test;

import com.zx.dao.IEmpAccount;
import com.zx.dao.impl.EmpAccount;
import com.zx.po.Emp;

public class test {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = null;
		e.setEmpId(100000);
		e.setEmpPwd("123456");
		IEmpAccount empDao = new EmpAccount();
		empDao.EmpLogin(e.getEmpId(), e.getEmpPwd());
	}
	*/

	@Test
	public void testLogin() {
	//	Emp e = null;
		//e.setEmpId(100000);
		//e.setEmpPwd("123456");
		IEmpAccount empDao = new EmpAccount();
		empDao.EmpLogin(100000, "123456");
	}
}
