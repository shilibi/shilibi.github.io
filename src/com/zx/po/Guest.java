package com.zx.po;

public class Guest {

	private String guestName;
	private String guestPwd;
	private String guestSex;
	private String guestCdtType;
	private String guestId;
	private String guestPhone;
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
	public String getGuestPhone() {
		return guestPhone;
	}
	public void setGuestPhone(String guestPhone) {
		this.guestPhone = guestPhone;
	}
	@Override
	public String toString() {
		return "Guest [guestName=" + guestName + ", guestPwd=" + guestPwd + ", guestSex=" + guestSex + ", guestCdtType="
				+ guestCdtType + ", guestId=" + guestId + ", guestPhone=" + guestPhone + "]";
	}
	
}
