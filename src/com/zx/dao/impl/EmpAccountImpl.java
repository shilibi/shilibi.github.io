package com.zx.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


import com.zx.dao.IEmpAccount;
import com.zx.po.Emp;
import com.zx.util.Md5Utils;


public class EmpAccountImpl implements IEmpAccount {
	private SessionFactory sf ;

	@Override
	public Emp EmpLogin(int empId, String empPwd) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		//String md5 = Md5Utils.md5(empPwd);
		String hql = " from Emp where empId = :empId  and empPwd = MD5(:empPwd)";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setInteger("empId", empId).setString("empPwd", empPwd);
		Emp e = (Emp) query.uniqueResult();
		System.out.println(e.toString());
		session.close();
		return e;
		
	}




}
