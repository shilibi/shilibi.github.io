package com.zx.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.zx.dao.IRoomGuestOrderDao;
import com.zx.po.RoomGuestOrder;

public class RoomGuestDaoImpl implements IRoomGuestOrderDao {
	private SessionFactory sf ;

	@Override
	public List<RoomGuestOrder> searchAllOrder() {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from RoomGuestOrder order by orderTime desc";
		Session session = sf.openSession();
		Query query = session.createQuery(hql);
		List<RoomGuestOrder> rgoList = query.list();
		for(RoomGuestOrder rgo:rgoList) {
			System.out.println(rgo.toString());
		}
		session.close();
		return rgoList;	
	}

	@Override
	public List<RoomGuestOrder> searchNotInOrder() {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		//String md5 = Md5Utils.md5(empPwd);
		String hql = " from RoomGuestOrder where orderStatus = :orderStatus";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("orderStatus", "未入住");
		List<RoomGuestOrder> rgoList = query.list();
		for(RoomGuestOrder rgo:rgoList) {
			System.out.println(rgo.toString());
		}
		session.close();
		return rgoList;	
	}

	@Override
	public List<RoomGuestOrder> searchOrderByGuestPhone(String accountPhone) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		//String md5 = Md5Utils.md5(empPwd);
		String hql = " from RoomGuestOrder where accountPhone = :accountPhone";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("accountPhone", accountPhone);
		List<RoomGuestOrder> rgoList = query.list();
		for(RoomGuestOrder rgo:rgoList) {
			System.out.println(rgo.toString());
		}
		session.close();
		return rgoList;	
	}

	@Override
	public boolean updateOrder(RoomGuestOrder rgo) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(rgo);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
		return true;
	}

	@Override
	public boolean addRgo(RoomGuestOrder rgo) {
		Configuration configuration=new Configuration().configure();  
        //创建SessionFactory实例  
        SessionFactory sessionFactory=configuration.buildSessionFactory();  
        //获取一个全新的session对象  
        Session session=sessionFactory.openSession();  
        //创建一个事务  
        org.hibernate.Transaction transaction=null;
        try {  
            //用session开启事务进行数据插入  
            transaction=session.beginTransaction();  
            session.save(rgo);  
            //提交事务  
            transaction.commit();  
        } catch (Exception e) {  
            //如果数据插入失败这回滚到初始化状态  
            if(transaction!=null){  
                transaction.rollback();  
                e.printStackTrace();  
                return false;//报异常则插入失败
            }  
        }finally{  
            //记得最后关闭session  
            session.close();  
        } 
		return true;
	}

	@Override
	public RoomGuestOrder searchOrderByOrderTime(String  orderTime) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		System.out.println(orderTime);
		String hql = " from RoomGuestOrder where orderTime = :orderTime";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("orderTime", orderTime);
		RoomGuestOrder rgo = (RoomGuestOrder) query.uniqueResult();
		session.close();
		return rgo;	
	}

}
