/**
 * 
 */
package com.zx.dao;

import java.util.List;

import com.zx.po.Emp;

/**
 * @author SenseChuang
 * IEmpAccount.java
 * 下午8:49:41
 */
public interface IEmpAccountDao {

	/*
	 * 客房员工登录
	 * 返回值  emp
	 * 参数  String empId,String empPwd
	 */
	Emp EmpLoginRoom(String empId,String empPwd);
	/*
	 * 餐厅员工登录
	 * 返回值  emp
	 * 参数  String empId,String empPwd
	 */
	Emp EmpLoginFood(String empId,String empPwd);
	/*
	 * 管理员登录
	 * 返回值  emp
	 * 参数  String empId,String empPwd
	 */
	Emp EmpLoginAdmin(String empId,String empPwd);
	/*
	 * 添加员工
	 * 参数：emp
	 * 返回值：boolean
	 */
	boolean  addEmp(Emp emp);
	/*
	 * 删除员工
	 * 参数:empId
	 * 返回值：boolean
	 */
	boolean deleteEmp(String empId);
	/*
	 * 更新员工
	 * 参数：emp
	 * 返回值：boolean
	 */
	boolean updateEmp(Emp emp);
	/*
	 * 查询所有员工
	 * 参数：null
	 * 返回值：List<Emp>
	 */
	List<Emp> SearchAllEmp();
	
	/*
	 *根据输入信息查询员工
	 *参数:String 
	 *返回值:List<Emp> 
	 */
	List<Emp> SearchEmpByInfo(String info);
	/*
	 * 根据id查询员工
	 * 参数：int empId
	 * 返回值:emp
	 */
	Emp SearchEmpById(String empId);
}
