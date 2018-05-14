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
import com.zx.dao.IFoodSaleDao;
import com.zx.po.Emp;
import com.zx.po.Food;
import com.zx.po.FoodSale;
import com.zx.util.Md5Utils;

public class FoodSaleDaoImpl implements IFoodSaleDao {
	private SessionFactory sf ;

	@Override
	public int searchTotalFoodSale(String Date) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sf = new Configuration().configure().buildSessionFactory(sr);
		String hql = " from FoodSale where saleDate like :info";
		Session session = sf.openSession();
		Query query = session.createQuery(hql).setString("info", "%"+Date+"%");
		List<FoodSale> foodSaleList = query.list();
		int totalPrice = 0;
		for(FoodSale f:foodSaleList) {
			System.out.println(f.toString());
			totalPrice = totalPrice+f.getFoodTotalPrice();
		}
		session.close();
		
		return totalPrice;
	}

	@Override
	public boolean addFoodSale(FoodSale fs) {
		Configuration config = new Configuration().configure();
		sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(fs);
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

}
