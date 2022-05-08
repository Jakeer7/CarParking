package com.manager.model;

public class Register {
	private String driver_name;
	private String vehicle_no;
	private String vehicle_type;
	private  String mobile_number;
	public Register() {
		super();
	}
	public Register(String driver_name, String vehicle_no, String vehicle_type, String mobile_number) {
		super();
		this.driver_name = driver_name;
		this.vehicle_no = vehicle_no;
		this.vehicle_type = vehicle_type;
		this.mobile_number = mobile_number;
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	@Override
	public String toString() {
		return ( driver_name +"\t\t" + vehicle_no + "\t\t" + vehicle_type+ "\t\t" + mobile_number+"\n");
	}

}
