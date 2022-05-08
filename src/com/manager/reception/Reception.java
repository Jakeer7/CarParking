package com.manager.reception;
import java.util.*;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import com.manager.dao.ManagerDao;
import com.manager.dao.ManagerImp;
import com.manager.model.Receptionist;
import com.manager.app.*;

public  class Reception 	 {


	public static void searchReceptionist(ManagerDao managerDao) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Search Receptionist");
		System.out.print("Please Enter ID_NO To Search:");
		String Id_No = scan.nextLine();
		Receptionist found = managerDao.getReceptionist(Id_No.trim());
		if (Objects.nonNull(found)) {
			System.out.println("Receptionist Found!");
			System.out.println(found);
		} else {
			System.out.print("Receptionist Not Found!");
		}
	}

	public static void deleteReceptionist(ManagerDao managerDao) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Delete Receptionist");
		System.out.print("Please Enter Receptionist ID To Delete:");
		String Id_No = scan.nextLine();
		if (Objects.nonNull(managerDao.getReceptionist(Id_No))) {
			int result = managerDao.delete(Id_No.trim());
			if (result > 0)
				System.out.print("Receptionist Deleted sucessfully!");
		} else {
			System.out.print("No Receptionist Found with this Id!");
		}
	}

	public static void updateReceptionist(ManagerDao managerDao) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Update Receptionist");
		System.out.print("Please Enter Receptionist ID:");
		String Id_No = scan.nextLine();
		if (Objects.nonNull(managerDao.getReceptionist(Id_No))) {
			System.out.print("Please Enter New Mobile:");
			String mobileno = scan.nextLine();
			System.out.print("Enter Employee Name:");
			String emp=scan.nextLine();
			System.out.print("Enter Designation:");
			String des=scan.next();
			int result = managerDao.update(new Receptionist(Id_No.trim(),emp.trim(),des.trim(), mobileno.trim()));
			if (result > 0)
				System.out.print("Receptionist Data Updated sucessfully!");
		} else
			System.out.print("Incorrect Details!");
	}

	public static void addReceptionist(ManagerDao managerDao) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Add Receptionist");
		System.out.print("Please Enter New Login ID (can't change later):");
		String Id_No = scan.nextLine();
		if (Objects.isNull(managerDao.getReceptionist(Id_No))) {
			System.out.print("Please Enter Name :");
			String emp_name = scan.nextLine();
			System.out.print("Please Assign Designation:");
			String designation =scan.nextLine();
			System.out.print("Please Enter correct Mobile_No:");
			String mobile=scan.nextLine();
			int result = managerDao.add(new Receptionist(Id_No.trim(),emp_name.trim(),designation.trim(),mobile.trim()));
			if (result > 0)
				System.out.print("\nReceptionist added sucessfully!\n");
		}
		else {
			System.out.print("\nAlready Receptionist Exists with this ID!\n");
		}
	}
	public static void displayReceptionist(ManagerDao managerDao) throws SQLException {
	List<Receptionist>manager=new ArrayList<Receptionist>();
	manager=managerDao.getReceptionists();
	String rp=manager.toString().replaceAll("(^\\[|\\]$)","");
	System.out.println("\nEMP_ID\tEMP_NAME\tEMP_DESIGNATION\tEMP_CONTACT_NO\n"+rp);
	}
}

