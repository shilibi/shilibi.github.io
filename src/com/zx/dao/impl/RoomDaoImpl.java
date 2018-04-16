package com.zx.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.zx.dao.IRoomDao;
import com.zx.po.Room;

public class RoomDaoImpl implements IRoomDao {

	private SessionFactory sf;
	
	@Override
	public List<Room> selectRoom() {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from Room";
		Session session = sf.openSession();
		Query query = session.createQuery(hql);
		List<Room> roomList = query.list();
		for(Room r:roomList) {
			System.out.println(r.toString());
		}
		return roomList;
	}

	@Override
	public boolean addRoom(Room room) {
	
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
            session.save(room);  
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
	public boolean deleteRoom(int roomId) {
		Configuration configuration=new Configuration().configure();  
        //创建SessionFactory实例  
        SessionFactory sessionFactory=configuration.buildSessionFactory();  
        //获取一个全新的session对象  
        Session session=sessionFactory.openSession();  
        //创建一个事务  
        org.hibernate.Transaction transaction=null;
        try {  
            //用session开启事务进行数据删除
            transaction=session.beginTransaction();  
            session.delete(roomId);  
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
	public boolean updateRoom(Room room) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(room);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<Room> searchRoomByName(String roomName) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from Room where roomName like :roomName";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("roomName", "%"+roomName+"%");
		List<Room> roomList = query.list();
		for(Room r:roomList) {
			System.out.println(r.toString());
		}
		session.close();
		return roomList;		
	}

}
