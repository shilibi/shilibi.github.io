package com.zx.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zx.dao.IFoodDao;
import com.zx.dao.IFoodSaleDao;
import com.zx.dao.IFoodWaitDao;
import com.zx.dao.impl.FoodDaoImpl;
import com.zx.dao.impl.FoodSaleDaoImpl;
import com.zx.dao.impl.FoodWaitDaoImpl;
import com.zx.po.Food;
import com.zx.po.FoodSale;
import com.zx.po.FoodWait;

public class FoodAction extends ActionSupport{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 647860644711045889L;	
	IFoodDao foodDao = new FoodDaoImpl();
	IFoodWaitDao foodWaitDao = new FoodWaitDaoImpl();
	IFoodSaleDao foodSaleDao = new FoodSaleDaoImpl();

	private List<Food> foodList = new ArrayList<Food>();
	private List<FoodWait> foodWaitList = new ArrayList<FoodWait>();
	private Food food = new Food();
	
	public List<FoodWait> getFoodWaitList() {
		return foodWaitList;
	}
	public void setFoodWaitList(List<FoodWait> foodWaitList) {
		this.foodWaitList = foodWaitList;
	}
	
	public List<Food> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
	
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public String addFood() {
		Food food = new Food();
		HttpServletRequest request = ServletActionContext.getRequest();
		food.setFoodName(request.getParameter("foodName"));
		food.setFoodPrice(Integer.parseInt(request.getParameter("foodPrice")));
		food.setFoodUnit(request.getParameter("foodUnit").charAt(0));
		IFoodDao foodDao = new FoodDaoImpl();
		foodDao.addFood(food);
		return "success";
	}
	public String foodList() {
		foodList = foodDao.selectFood();
		System.out.println(foodList);
		return "success";
	}
	public String  foodInfo() {
		Food f = new Food();
		HttpServletRequest request = ServletActionContext.getRequest();
		f.setFoodId(Integer.parseInt(request.getParameter("foodId")));
		food = foodDao.searchFoodByFoodId(f.getFoodId());
		return "success";
	}

	public String updateFood() {
		HttpServletRequest request = ServletActionContext.getRequest();
		Food food1 = new Food();
		food1.setFoodId(Integer.parseInt(request.getParameter("foodId")));
		food1.setFoodName(request.getParameter("foodName"));
		food1.setFoodPrice(Integer.parseInt(request.getParameter("foodPrice")));
		food1.setFoodUnit(request.getParameter("foodUnit").charAt(0));
		boolean flag = foodDao.updateFood(food1);
		if(flag==true) {
			return "success";
		}
		else {
			return "error";
		}
	}
	public String deleteFood() {
		HttpServletRequest request = ServletActionContext.getRequest();
		Food foodByFoodId = foodDao.searchFoodByFoodId(Integer.parseInt(request.getParameter("foodId")));
		boolean flag = foodDao.deleteFood(foodByFoodId);
		if(flag==true) {
			return "success";
		}
		else {
			return "error";
		}
	}
	public String searchFoodInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		foodList = foodDao.selectFoodByContent( request.getParameter("info"));
		return "success";
	}
	public String passFood() {
		foodWaitList =  foodWaitDao.selectFoodWait();
		System.out.println(foodWaitList);
		return "success";
	}
	public String agreeFoodWait() {
		HttpServletRequest request = ServletActionContext.getRequest();
		FoodWait foodWait = foodWaitDao.searchFoodWaitByName(request.getParameter("foodWaitName"));
		foodWait.setFoodWaitStatus("已通过");
		boolean f = foodWaitDao.updateFoodWait(foodWait);
		Food food = new Food();
		food.setFoodName(foodWait.getFoodName());
		food.setFoodPrice(foodWait.getFoodPrice());
		food.setFoodUnit(foodWait.getFoodUnit());
		boolean flag = foodDao.addFood(food);
		if(flag==true&&f==true) {
			return "success";
		}else {
			return "error";
		}
	}
	public String disagreeFoodWait() {
		HttpServletRequest request = ServletActionContext.getRequest();
		FoodWait foodWait = foodWaitDao.searchFoodWaitByName(request.getParameter("foodWaitName"));
		foodWait.setFoodWaitStatus("已拒绝");
		boolean flag_foodWait = foodWaitDao.updateFoodWait(foodWait);
		if(flag_foodWait==true) {
			return "success";
		}
		else {
			return "error";
		}
	}
	public String searchWaitFood() {
		HttpServletRequest request = ServletActionContext.getRequest();
		foodWaitList = foodWaitDao.searchFoodWaitByInfo(request.getParameter("info"));
		return "success";
	}
	public String addFoodSale() {
		HttpServletRequest request = ServletActionContext.getRequest();
		FoodSale fs = new FoodSale();
		fs.setFoodId(Integer.parseInt(request.getParameter("foodId")));
		Food f = foodDao.searchFoodByFoodId(fs.getFoodId());
	/*	String temp = request.getParameter("fuckNo");
		System.out.println(temp);
		switch (temp) {
		case "one":
			 temp = "1";
			 	break;
		case "two":
			 temp = "2";
			 	break;
		case "three":
			 temp = "3";
			 	break;
		case "four":
			 temp = "4";
			 	break;
		case "five":
			 temp = "5";
			 	break;
		default:
			break;
		}*/
		fs.setFoodNumber(1);
		Date date = new Date();
		fs.setSaleDate(date);
		fs.setFoodTotalPrice(f.getFoodPrice()*fs.getFoodNumber());
		boolean flag = foodSaleDao.addFoodSale(fs);
		if(flag==true) {
			return "success";
		}else {
			return "error";
		}
	}
	public String addFoodWait() {
		HttpServletRequest request = ServletActionContext.getRequest();
		FoodWait fd = new FoodWait();
		fd.setFoodWaitStatus("待审核");
		String cookie = (String) request.getSession().getAttribute("empId");		
		fd.setEmpId(Integer.parseInt(cookie));
		fd.setFoodName(request.getParameter("foodName"));
		fd.setFoodPrice(Integer.parseInt(request.getParameter("foodPrice")));
		fd.setFoodUnit(request.getParameter("foodUnit").charAt(0));
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String startTime = sdf.format(date);
		fd.setFood_waitTime(startTime);
		boolean flag = foodWaitDao.addFoodWait(fd);
		if(flag==true) {
			return "success";
		}
		else {
			return "error";
		}
	}
}
