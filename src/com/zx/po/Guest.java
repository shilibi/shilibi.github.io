package com.zx.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guest")
public class Guest {

	private String guestName;
	private String guestPwd;
	private String guestSex;
	private String guestCdtType;
	private String guestId;
	private String guestPhone;
	private String guestRegisterTime;
	private String guestLastLoginTime;
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestPwd() {
		return guestPwd;
	}
	public void setGuestPwd(String guestPwd) {
		this.guestPwd = guestPwd;
	}
	public String getGuestSex() {
		return guestSex;
	}
	public void setGuestSex(String guestSex) {
		this.guestSex = guestSex;
	}
	public String getGuestCdtType() {
		return guestCdtType;
	}
	public void setGuestCdtType(String guestCdtType) {
		this.guestCdtType = guestCdtType;
	}
	
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}
	@Id
	@Column(name="guestPhone")
	/*
	 * 此处id不能设置为：
	 * 	@GeneratedValue(strategy=GenerationType.AUTO)
	 * @Column(name="id")
	 * 
	 * 
	 */
	public String getGuestPhone() {
		return guestPhone;
	}
	public void setGuestPhone(String guestPhone) {
		this.guestPhone = guestPhone;
	}
	public String getGuestRegisterTime() {
		return guestRegisterTime;
	}
	public void setGuestRegisterTime(String guestRegisterTime) {
		this.guestRegisterTime = guestRegisterTime;
	}
	public String getGuestLastLoginTime() {
		return guestLastLoginTime;
	}
	public void setGuestLastLoginTime(String guestLastLoginTime) {
		this.guestLastLoginTime = guestLastLoginTime;
	}
	public Guest(String guestName, String guestPwd, String guestSex, String guestCdtType, String guestId,
			String guestPhone, String guestRegisterTime, String guestLastLoginTime) {
		super();
		this.guestName = guestName;
		this.guestPwd = guestPwd;
		this.guestSex = guestSex;
		this.guestCdtType = guestCdtType;
		this.guestId = guestId;
		this.guestPhone = guestPhone;
		this.guestRegisterTime = guestRegisterTime;
		this.guestLastLoginTime = guestLastLoginTime;
	}
	public Guest() {
		super();
	}
	@Override
	public String toString() {
		return "Guest [guestName=" + guestName + ", guestPwd=" + guestPwd + ", guestSex=" + guestSex + ", guestCdtType="
				+ guestCdtType + ", guestId=" + guestId + ", guestPhone=" + guestPhone + ", guestRegisterTime="
				+ guestRegisterTime + ", guestLastLoginTime=" + guestLastLoginTime + "]";
	}
	
}
