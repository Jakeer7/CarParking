package com.manager.model;

public class Parking {
	private String vehicles_parked;

	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parking(String vehicles_parked) {
		super();
		this.vehicles_parked = vehicles_parked;
	}

	public String getVehicles_parked() {
		return vehicles_parked;
	}

	public void setVehicles_parked(String vehicles_parked) {
		this.vehicles_parked = vehicles_parked;
	}

	@Override
	public String toString() {
		return  ( vehicles_parked+"\n");
	}
}
