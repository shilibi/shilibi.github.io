package com.zx.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


import com.zx.dao.IEmpAccountDao;
import com.zx.po.Emp;
import com.zx.po.Food;
import com.zx.util.Md5Utils;


public class EmpAccountDaoImpl implements IEmpAccountDao {
	private SessionFactory sf ;

	@Override
	public Emp EmpLoginRoom(String empId, String empPwd) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		//String md5 = Md5Utils.md5(empPwd);
		String hql = " from Emp where empId = :empId  and empPwd = MD5(:empPwd) and empDepart = 8888";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("empId", empId).setString("empPwd", empPwd);
		Emp e = (Emp) query.uniqueResult();
		session.close();
		return e;
	}

	@Override
	public Emp EmpLoginFood(String empId, String empPwd) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		//String md5 = Md5Utils.md5(empPwd);
		String hql = " from Emp where empId = :empId  and empPwd = MD5(:empPwd) and empDepart = 6666";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("empId", empId).setString("empPwd", empPwd);
		Emp e = (Emp) query.uniqueResult();
		session.close();
		return e;
	}

	@Override
	public boolean addEmp(Emp emp) {
		Configuration config = new Configuration().configure();
		sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = null;
		emp.setEmpPwd(Md5Utils.md5(emp.getEmpPwd()));
		try {
			transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
		} catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();
				e.printStackTrace();
				return false;
			}
			
		}finally {
			session.close();
		}
		return true;
	}

	@Override
	public boolean deleteEmp(String empId) {
		Configuration configuration=new Configuration().configure();  
        //创建SessionFactory实例  
        SessionFactory sessionFactory=configuration.buildSessionFactory();  
        //获取一个全新的session对象  
        Session session=sessionFactory.openSession();  
        //创建一个事务  
        org.hibernate.Transaction transaction=null;
        Emp emp = new Emp();
        emp.setEmpId(empId);
        try {  
            //用session开启事务进行数据删除
            transaction=session.beginTransaction();  
            session.delete(emp);  
            //提交事务  
            transaction.commit();  
        } catch (Exception e) {  
            //如果数据删除失败这回滚到初始化状态  
            if(transaction!=null){  
                transaction.rollback();  
                e.printStackTrace();  
                return false;//报异常则删除失败
            }  
        }finally{  
            //记得最后关闭session  
            session.close();  
        } 
		return true;
	}

	@Override
	public boolean updateEmp(Emp emp) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(emp);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		session.close();
		return true;
	}

	@Override
	public List<Emp> SearchAllEmp() {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from Emp ";
		Session session = sf.openSession();
		Query query = session.createQuery(hql);
		List<Emp> empList = query.list();
		for(Emp r:empList) {
			System.out.println(r.toString());
		}
		session.close();
		return empList;	
	}

	@Override
	public List<Emp> SearchEmpByInfo(String info) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from Emp where empName like :info or empJob like :info or empDepart like :info ";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("info", "%"+info+"%").setString("info", "%"+info+"%").setString("info", "%"+info+"%");
		List<Emp> empList = query.list();
		for(Emp r:empList) {
			System.out.println(r.toString());
		}
		session.close();
		return empList;	
	}

	@Override
	public Emp SearchEmpById(String empId) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		//String md5 = Md5Utils.md5(empPwd);
		String hql = " from Emp where empId = :empId";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("empId", empId);
		Emp e = (Emp) query.uniqueResult();
		System.out.println(e.toString());
		session.close();
		return e;
	}
	 
	@Override
	public Emp EmpLoginAdmin(String empId, String empPwd) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		//String md5 = Md5Utils.md5(empPwd);
		String hql = " from Emp where empId = :empId  and empPwd = MD5(:empPwd) and empDepart = 7777";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("empId", empId).setString("empPwd", empPwd);
		Emp e = (Emp) query.uniqueResult();
		session.close();
		return e;		
	}
}
