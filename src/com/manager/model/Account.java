package com.manager.model;

public class Account {
	private String ondate;
	private String driver_name;
	private String vehicle_no;
	private String in_time;
	private String out_time;
	private String bill_amount;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String ondate, String driver_name, String vehicle_no, String in_time, String out_time,
			String bill_amount) {
		super();
		this.ondate = ondate;
		this.driver_name = driver_name;
		this.vehicle_no = vehicle_no;
		this.in_time = in_time;
		this.out_time = out_time;
		this.bill_amount = bill_amount;
	}
	public String getOndate() {
		return ondate;
	}
	public void setOndate(String ondate) {
		this.ondate = ondate;
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
	public String getIn_time() {
		return in_time;
	}
	public void setIn_time(String in_time) {
		this.in_time = in_time;
	}
	public String getOut_time() {
		return out_time;
	}
	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}
	public String getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(String bill_amount) {
		this.bill_amount = bill_amount;
	}
	@Override
	public String toString() {
		return (ondate + "\t" + driver_name + "\t" + vehicle_no + "\t"
				+ in_time + "\t" + out_time + "\t" + bill_amount+"\n");
	}
	
}
