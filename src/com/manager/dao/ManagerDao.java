package com.manager.dao;

import java.sql.SQLException;
import java.util.List;

import com.manager.model.*;


public interface ManagerDao {
	public List<Register> getRegisters() throws SQLException;
	public List<Account> getAccounts()throws SQLException;
	public int delete(String Id_No)throws SQLException;
	public int add(Receptionist receptionist)throws SQLException;
	public List<Receptionist> getReceptionists() throws SQLException;
	public int update(Receptionist receptionist) throws SQLException;
	public Receptionist getReceptionist(String Id_No) throws SQLException;
	public  List<Parking> getParking() throws SQLException;

}
