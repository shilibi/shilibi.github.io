package com.zx.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.zx.dao.IFoodDao;
import com.zx.po.Emp;
import com.zx.po.Food;
import com.zx.po.Room;

public class FoodDaoImpl implements IFoodDao {
	
	private SessionFactory sf;
	
	
	@Override
	public List<Food> selectFood() {
		Configuration configuration =  new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = "from Food";
		Session session = sf.openSession();
		Query query = session.createQuery(hql);
		List<Food> food = query.list();
		for(Food f:food) {
			System.out.println(f.toString());
		}
		
		return food;
	}

	@Override
	public boolean addFood(Food food) {
		Configuration config = new Configuration().configure();
		sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(food);
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
	public boolean deleteFood(Food food) {

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
            session.delete(food);  
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
	public boolean updateFood(Food food) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(food);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;	
	}

	@Override
	public List<Food> selectFoodByContent(String foodContent) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from Food where foodName like :foodName";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("foodName", "%"+foodContent+"%");
		List<Food> foodList = query.list();
		for(Food r:foodList) {
			System.out.println(r.toString());
		}
		session.close();
		return foodList;		}

	@Override
	public Food searchFoodByFoodId(int foodId) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		//String md5 = Md5Utils.md5(empPwd);
		String hql = " from Food where foodId = :foodId";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setInteger("foodId", foodId);
		Food f = (Food) query.uniqueResult();
		session.close();
		return f;
	}

}
