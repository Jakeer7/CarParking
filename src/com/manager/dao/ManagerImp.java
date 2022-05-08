package com.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manager.model.Account;
import com.manager.model.Parking;
import com.manager.model.Receptionist;
import com.manager.model.Register;
import com.manager.constant.Constants;
import com.manager.model.Register;
import com.manager.config.DatabaseConnection;

public class ManagerImp implements ManagerDao {
	private static Connection con = DatabaseConnection.getConnection();

	@Override
	public  List<Register>  getRegisters() throws SQLException {
		// TODO Auto-generated method stub
		String selectAllQuery = Constants.SELECT_ALL_QUERY;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ResultSet rs = ps.executeQuery();
		List<Register> register = new ArrayList();

		while (rs.next()) {
			Register user = new Register();
			user.setDriver_name(rs.getString("DRIVER_NAME"));
			user.setVehicle_no(rs.getString("vehicle_no"));
			user.setVehicle_type(rs.getString("vehicle_type"));
			user.setMobile_number(rs.getString("mobile_number"));
			register.add(user);
		}
		return register;
	}
	@Override
	public List<Account> getAccounts()throws SQLException{
		String selectAllQuery = Constants.SELECT_ALL_QUERY_Accounts;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ResultSet rs = ps.executeQuery();
		List<Account> account = new ArrayList();

		while (rs.next()) {
			Account user = new Account();
			user.setOndate(rs.getString("ondate"));
			user.setDriver_name(rs.getString("driver_name"));
			user.setVehicle_no(rs.getString("vehicle_no"));
			user.setIn_time(rs.getString("in_time"));
			user.setOut_time(rs.getString("out_time"));
			user.setBill_amount(rs.getString("bill_amount"));
			account.add(user);
		}
		return account;
	
	}
	@Override
	public int delete(String Id_No)throws SQLException{
		String deleQquery = Constants.DELETE_QUERY;
		PreparedStatement ps = con.prepareStatement(deleQquery);
		ps.setString(1, Id_No);
		int n = ps.executeUpdate();
		return n;
	}
	@Override
	public int add(Receptionist receptionist)throws SQLException{
		String insertQuery = Constants.INSERT_QUERY;
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setString(1, receptionist.getEmp_id());
		ps.setString(2, receptionist.getEmp_name());
		ps.setString(3, receptionist.getEmp_designation());
		ps.setString(4, receptionist.getEmp_contactno());
		int n = ps.executeUpdate();
		return n;
	}
	@Override
	public List<Receptionist> getReceptionists() throws SQLException{
		String selectAllQuery = Constants.SELECT_ALL_QUERY_Reception;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ResultSet rs = ps.executeQuery();
		List<Receptionist> receptionist = new ArrayList();

		while (rs.next()) {
			Receptionist user = new Receptionist();
			user.setEmp_id(rs.getString("emp_id"));
			user.setEmp_name(rs.getString("emp_name"));
			user.setEmp_designation(rs.getString("emp_designation"));
			user.setEmp_contactno(rs.getString("emp_contactno"));
			receptionist.add(user);
		}
		return receptionist;
	}
	@Override
	public int update(Receptionist receptionist) throws SQLException{
		String updateQuery = Constants.UPDATE_QUERY;
		PreparedStatement ps = con.prepareStatement(updateQuery);
		ps.setString(1, receptionist.getEmp_contactno());
		ps.setString(2, receptionist.getEmp_name());
		ps.setString(3, receptionist.getEmp_designation());
		ps.setString(4, receptionist.getEmp_id());
		int n = ps.executeUpdate();
		return n;
	}
	@Override
	public Receptionist getReceptionist(String Id_No) throws SQLException{
		String selectSpecificQuery = Constants.SELECT_SPECIFIC_QUERY;
		PreparedStatement ps = con.prepareStatement(selectSpecificQuery);
		ps.setString(1, Id_No);
		Receptionist receptionist = new Receptionist();
		ResultSet rs = ps.executeQuery();
		boolean found = false;
		while (rs.next()) {
			found = true;
			receptionist.setEmp_id(rs.getString("emp_id"));
			receptionist.setEmp_name(rs.getString("emp_name"));
			receptionist.setEmp_designation(rs.getString("emp_designation"));
			receptionist.setEmp_contactno(rs.getString("emp_contactno"));
		}
		if (found == true) {
			return receptionist;
		} else
			return null;
	}
	@Override
	public  List<Parking> getParking() throws SQLException{
		String selectAllQuery = Constants.SELECT_ALL_QUERY_Parking;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ResultSet rs = ps.executeQuery();
		List<Parking> Parking = new ArrayList();

		while (rs.next()) {
			Parking user = new Parking();
			user.setVehicles_parked(rs.getString("vehicles_parked"));
			Parking.add(user);
		}
		return Parking;
	}


}
