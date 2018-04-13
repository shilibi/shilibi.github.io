package com.zx.dao;

import com.zx.po.Guest;

public interface IGuestAccountDao {

	
	/*
	 * 顾客注册
	 * 参数：Emp 
	 * 返回值 boolean
	 * true ：注册成功
	 * false ：注册失败
	 */
	boolean GuestRegister(Guest guest);
	
	/*
	 * 顾客登录
	 * 参数：
	 * 用户手机号：String guestPhone
	 * 用户密码:String guestPwd
	 * 返回值：从数据库获取的guest对象
	 */
	Guest GuestLogin(String guestPhone,String guestPwd);
}
