package com.zx.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.zx.dao.IFoodWaitDao;
import com.zx.po.FoodWait;
import com.zx.po.Room;

public class FoodWaitDaoImpl implements IFoodWaitDao{
	
	private SessionFactory sf;
	
	@Override
	public boolean addFoodWait(FoodWait foodWait) {

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
            session.save(foodWait);  
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
	public List<FoodWait> selectFoodWait() {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from FoodWait  order by food_waitTime";
		Session session = sf.openSession();
		Query query = session.createQuery(hql);
		List<FoodWait> foodWait = query.list();
		for(FoodWait r:foodWait) {
			System.out.println(r.toString());
		}
		return foodWait;
	}

	@Override
	public boolean deleteFoodWait(FoodWait foodWait) {
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
            session.delete(foodWait);  
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

	/*
	 * (non-Javadoc)
	 * 由于数据库设计方面将foodwaitName设置为主键，因此不可修改菜名，若修改需要先删除后再添加，谨记。
	 * @see com.zx.dao.IFoodWaitDao#updateFoodWait(com.zx.po.FoodWait)
	 */
	@Override
	public boolean updateFoodWait(FoodWait foodWait) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(foodWait);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public FoodWait searchFoodWaitByName(String foodName) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from FoodWait where foodName=:foodName";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("foodName", foodName);
		FoodWait foodWait = (FoodWait) query.uniqueResult();
		session.close();
		return foodWait;
	}

	@Override
	public List<FoodWait> searchFoodWaitByInfo(String info) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from FoodWait where foodName like :info or foodPrice like :info or foodUnit like :info";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("info", "%"+info+"%").setString("info", "%"+info+"%").setString("info", "%"+info+"%");
		List<FoodWait> foodWait = query.list();
		for(FoodWait r:foodWait) {
			System.out.println(r.toString());
		}
		session.close();
		return foodWait;
	}

}
