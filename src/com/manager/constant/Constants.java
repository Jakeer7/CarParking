package com.manager.constant;

public class Constants {
	public static final String SELECT_ALL_QUERY="SELECT `Driver_name`,`vehicle_no`,`vehicle_type`,`mobile_number` FROM `jakeer`.`registered` ";
	public static final String SELECT_ALL_QUERY_Accounts="SELECT `ondate`,`driver_name`,`vehicle_no`,`in_time`,`out_time` ,`bill_amount` FROM `jakeer`.`accounts` ";
	public static final String SELECT_ALL_QUERY_Reception="SELECT `emp_id`,`emp_name`, `emp_designation`,`emp_contactno` FROM `Jakeer`.`receptionist` ";
	public static final String SELECT_SPECIFIC_QUERY="SELECT `emp_id`,`emp_name`,`emp_designation`,`emp_contactno` FROM `Jakeer`.`receptionist` WHERE `emp_id`=? ";
	public static final String INSERT_QUERY="INSERT INTO `Jakeer`.`receptionist` (`emp_id`,`emp_name`,`emp_designation`,`emp_contactno`) VALUES (?,?,?,?) ";
	public static final String UPDATE_QUERY="UPDATE `Jakeer`.`receptionist` SET `emp_contactno`=?, `emp_name`=?,`emp_designation`=?  WHERE `emp_id`=? ";
	public static final String DELETE_QUERY="DELETE FROM `Jakeer`.`receptionist` WHERE `emp_id`=? ";
	public static final String SELECT_ALL_QUERY_Parking="SELECT  `vehicles_parked` FROM `jakeer`.`parking`";
	Constants(){}
}
