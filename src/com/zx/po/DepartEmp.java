package com.zx.po;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="depart_emp")
public class DepartEmp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7708481256903119187L;
	private int empId;
	private int departId;
	@Id
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Id
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	
}
