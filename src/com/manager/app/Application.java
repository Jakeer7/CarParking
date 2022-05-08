package com.manager.app;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import com.manager.reception.*;
import com.manager.dao.ManagerDao;
import com.manager.dao.ManagerImp;
//import com.manager.model.Register;
//import com.revature.dao.UserDao;
//import com.revature.dao.UserDaoImpl;
import com.manager.model.Register;
import com.manager.model.Account;
import com.manager.model.Parking;
import com.manager.model.Receptionist.*;
import com.manager.model.Parking.*;
//import com.revature.util.MenuCard;

public class Application {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		final String managerid="@123";
		final String pass="2345";
		System.out.println("         Welcome!");
		int k=0;
		do {
			System.out.print("\n1.Manager\n2.Press 2 to Exit\nEnter Your Choice:");
			Scanner s=new Scanner (System.in);
			k=s.nextInt();
			if(k<2) 
			{
				System.out.print("\nEnter Your LoginId:");
				String d=s.next();
				if(managerid.equals(d)) 
				{
					System.out.print("\nEnter Your Password:");
					String f=s.next();
			
					if(pass.equals(f))
					{
		char choice = 'y';
		ManagerDao managerDao = new ManagerImp();
		do {
			Apperance.print();
			Scanner choiceScan = new Scanner(System.in);
			choice = choiceScan.next().charAt(0);
			switch (choice) {
			case '1':
				registrationData(managerDao);
				break;
			case '2':
				accountsData(managerDao);
				break;
			case '3':
				currentVacancy(managerDao);
				break;
			case '4':
			{
				Reception r=new Reception();
				char star = 'y';
				do {
					//ManagerDao managerDao=new ManagerImp();
					System.out.print("\n\n1.Add Receptionist\n2.Search Receptionist\n3.Delete Receptionist\n4.Update Recepionists\n5.Display Receptionsist\n6.PRESS (n) to Exit\nEnter Your Choice:");
					Scanner sd=new Scanner(System.in);
					star = sd.next().charAt(0);
					switch(star)
					{
					case '1':
						Reception.addReceptionist(managerDao);
						break;
					case '2':
						Reception.searchReceptionist(managerDao);
						break;
					case '3':

						Reception.deleteReceptionist(managerDao);
						break;
					case '4':
						Reception.updateReceptionist(managerDao);
						break;
					case '5':
						Reception.displayReceptionist(managerDao);
						break;
					default:
							System.out.println("Enter Correct Option");
					}
				}while(star !='n');
				}
				break;
			default:
				System.out.println("      Wrong option selected!");
			}
		} while (choice !='n');
		}else
				System.out.println("You Entered Wrong Password");
		}
		else 
			System.out.println("You Entered Wrong Id");
	}
			else
				System.out.println("You entered exit option");
	}while(k!=2);
}

	private static void currentVacancy(ManagerDao managerDao) throws SQLException{
		// TODO Auto-generated method stub
		final int total_parking_space=100;
		System.out.println("Total Parking Space:"+total_parking_space);
		List<Parking>parking=new ArrayList<Parking>();
		parking=managerDao.getParking();
		String res=parking.toString().replaceAll("(^\\[|\\]$)","");
		System.out.println("\nVEHICLES_PARKED\n"+res);
//		int k=Integer.parseInt(res);
//		int h=(total_parking_space-k);
//		if(h>0)
//		{
//			System.out.println("You have Vacancy of"+h);
//		}
//		else
//			System.out.println("You don't have place to park vehicle");
	}

	private static void registrationData(ManagerDao managerDao) throws SQLException {
		List<Register>manager=new ArrayList<Register>();
		manager=managerDao.getRegisters();
		String rp=manager.toString().replaceAll("(^\\[|\\]$)","");
		System.out.println("\nDRIVER_NAME\tVEHICLE_NO\tVEHICLE_TYPE\tMOBILE_NUMBER\n" +rp);
	}
	private static void accountsData(ManagerDao managerDao)throws SQLException{
		List<Account>account=new ArrayList<Account>();
		account=managerDao.getAccounts();
		String ap=account.toString().replaceAll("(^\\[|\\]$)" ,"");
		System.out.println("\nOndate\tDirver_name\tVehicle_no\tIn_time\tOut_time\tBill_Amount\n" + ap);
	}
}


