package com.zx.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.zx.dao.ILogRoomDao;
import com.zx.po.LogRoom;
import com.zx.vo.LogRoomVo;


public class LogRoomDaoImpl implements ILogRoomDao {
	
	private SessionFactory sf;
	
	@Override
	public boolean addLogRoom(LogRoom logRoom) {
		Configuration config = new Configuration().configure();
		sf = config.buildSessionFactory();
		Session session  = sf.openSession();
		Transaction transaction = null;
		 try {  
	            //用session开启事务进行数据插入  
	            transaction=session.beginTransaction();  
	            session.save(logRoom);  
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
	public List<LogRoom> selectLogRoom() {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = "from LogRoom";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setFirstResult(0).setMaxResults(5);//从1开始查，查询5个
		List<LogRoom> logRoomList = query.list();
		for(LogRoom l:logRoomList) {
			System.out.println(l.toString());
		}
		session.close();
		return logRoomList;
	}

	@Override
	public List<LogRoom> searchLogRoomByContent(String content) {
		content = "入住";
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from LogRoom where logOp  like :content  or guestId like :content or deposit like :content";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("content", "%"+content+"%").setFirstResult(0).setMaxResults(5);//从1开始查，查询5个
		List<LogRoom> logRoomList = query.list();
		for(LogRoom l:logRoomList) {
			System.out.println(l.toString());
		}
		session.close();
		return logRoomList;
	}
	

}
