package com.manager.model;

public class Receptionist {
	private String emp_id;
	private String emp_name;
	private String emp_designation;
	private String emp_contactno;
	public Receptionist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Receptionist(String emp_id, String emp_name, String emp_designation, String emp_contactno) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_designation = emp_designation;
		this.emp_contactno = emp_contactno;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_designation() {
		return emp_designation;
	}
	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}
	public String getEmp_contactno() {
		return emp_contactno;
	}
	public void setEmp_contactno(String emp_contactno) {
		this.emp_contactno = emp_contactno;
	}
	@Override
	public String toString() {
		return (  emp_id + "\t\t" + emp_name + "\t\t" + emp_designation+ "\t" + emp_contactno+"\n");
	}
	
}
