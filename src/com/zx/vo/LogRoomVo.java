package com.zx.vo;

public class LogRoomVo {

	private String logId;
	private int empId;
	private String logOp;
	private String logTime;
	private double deposit;
	private String guestId;
	private String guestName;
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
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}
	public String getEmpName() {
		return guestName;
	}
	public void setEmpName(String empName) {
		this.guestName = empName;
	}
	public LogRoomVo(String logId, int empId, String logOp, String logTime, double deposit, String guestId,
			String empName) {
		super();
		this.logId = logId;
		this.empId = empId;
		this.logOp = logOp;
		this.logTime = logTime;
		this.deposit = deposit;
		this.guestId = guestId;
		this.guestName = empName;
	}
	public LogRoomVo() {
		super();
	}
	@Override
	public String toString() {
		return "LogRoomVo [logId=" + logId + ", empId=" + empId + ", logOp=" + logOp + ", logTime=" + logTime
				+ ", deposit=" + deposit + ", guestId=" + guestId + ", empName=" + guestName + "]";
	}
	
}
