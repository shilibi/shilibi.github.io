package com.zx.po;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="emp")
public class Emp {
	private String empId;
	private String empPwd;
	private	String empName;
	private String empSex;
	private String empPhone;
	private String empJob;
	private Date empLastLoginTime;
	private int empDepart;
	@Id//主键
	@GenericGenerator(name="myGenerator",strategy="native")//主键自增
	@GeneratedValue(generator="myGenerator")
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSex() {
		return empSex;
	}
	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getEmpJob() {
		return empJob;
	}
	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}
	public Date getEmpLastLoginTime() {
		return empLastLoginTime;
	}
	public void setEmpLastLoginTime(Date empLastLoginTime) {
		this.empLastLoginTime = empLastLoginTime;
	}
	public int getEmpDepart() {
		return empDepart;
	}
	public void setEmpDepart(int empDepart) {
		this.empDepart = empDepart;
	}
	
	public Emp() {
		super();
	}
	public Emp(String empId, String empPwd, String empName, String empSex, String empPhone, String empJob,
			Date empLastLoginTime, int empDepart) {
		super();
		this.empId = empId;
		this.empPwd = empPwd;
		this.empName = empName;
		this.empSex = empSex;
		this.empPhone = empPhone;
		this.empJob = empJob;
		this.empLastLoginTime = empLastLoginTime;
		this.empDepart = empDepart;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empPwd=" + empPwd + ", empName=" + empName + ", empSex=" + empSex
				+ ", empPhone=" + empPhone + ", empJob=" + empJob + ", empLastLoginTime=" + empLastLoginTime
				+ ", empDepart=" + empDepart + "]";
	}
	

}
