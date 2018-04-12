package com.zx.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="emp")
public class Emp {
	private int empId;
	private String empPwd;
	private	String empName;
	private String empSex;
	private String empPhone;
	private String empJob;
	
	@Id//主键
	@GenericGenerator(name="myGenerator",strategy="native")//主键自增
	@GeneratedValue(generator="myGenerator")
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
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
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empPwd=" + empPwd + ", empName=" + empName + ", empSex=" + empSex
				+ ", empPhone=" + empPhone + ", empJob=" + empJob + "]";
	}
	

}
