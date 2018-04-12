/**
 * 
 */
package com.zx.dao;

import com.zx.po.Emp;

/**
 * @author SenseChuang
 * IEmpAccount.java
 * 下午8:49:41
 */
public interface IEmpAccount {


	/*
	 * 员工登录
	 * 返回值  emp
	 * 参数  int empId,String empPwd
	 */
	Emp EmpLogin(int empId,String empPwd);
}
