package com.zx.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="log_room")
public class LogRoom {
	
	
	private String logId;
	private int empId;
	private String logOp;
	private String logTime;
	private double deposit;
	private String guestId;
	//private Guest guest;
	

	@Id
	@GenericGenerator(name="logRoomGenerator",strategy="native")//主键自增
	@GeneratedValue(generator="logRoomGenerator")
	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getLogOp() {
		return logOp;
	}

	public void setLogOp(String logOp) {
		this.logOp = logOp;
	}

	public String getLogTime() {
		return logTime;
	}

	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
/*	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="guestName")*/
//	public Guest getGuest() {
//		return guest;
//	}
//
//	public void setGuest(Guest guest) {
//		this.guest = guest;
//	}
	
	public String getGuestId() {
		return guestId;
	}

	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}

	public LogRoom(String logId, int empId, String logOp, String logTime, double deposit, String guestId/* Guest guest*/) {
		//super();
		this.logId = logId;
		this.empId = empId;
		this.logOp = logOp;
		this.logTime = logTime;
		this.deposit = deposit;
		this.guestId = guestId;
		//this.guest = guest;
	}

	public LogRoom() {
		super();
	}

	@Override
	public String toString() {
		return "LogRoom [logId=" + logId + ", empId=" + empId + ", logOp=" + logOp + ", logTime=" + logTime
				+ ", deposit=" + deposit + ", guestId=" + guestId + "]";
	}



	

}
