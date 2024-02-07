package com.myproject;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OperationsCustomer {
	static Scanner sc = new Scanner(System.in);
	static Customers cp = new Customers();
	static Appliances ap = OperationsShop.getObject();
	public static void setCustomerData() {
		int id;
		int qt;
		double am;
		System.out.println("enter Customer Name ");
		cp.setCustomerName(sc.next());
		while(true) {
		try {
		System.out.println("enter customer id ");
		id = sc.nextInt();
		break;
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
			sc.nextLine();
		}
		}
		cp.setCustomerId(id);
		while(true) {
		try {
		System.out.println("enter quantity");
		qt = sc.nextInt();
		break;
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
			sc.nextLine();
		}
		}
		cp.setQuantity(qt);
		while(true) {
		try {
		System.out.println("enter amount");
		am =sc.nextDouble();
		break;
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
			sc.nextLine();
		}
		}
		cp.setAmount(am);
		cp.setTotalAmount(ap.getGST()+ap.getPrice()*cp.getQuantity());
		cp.setRequiredAAmount(cp.getTotalAmount()-cp.getAmount());
		cp.setChange(cp.getAmount()-cp.getTotalAmount());
		System.out.println("************Customer added successfully*************");
		
		
	}
	
	public static void getBilling() {
		System.out.println("******************************************");
		OperationsCustomer.GetStock(ap.getStock(),cp.getQuantity());
		System.out.println("Customer name is "+cp.getCustomerName());
		System.out.println("Customer id is "+cp.getCustomerId());
		System.out.println("Selected quantity is "+cp.getQuantity());
		System.out.println("Given amount is "+cp.getAmount());
		System.out.println("Total amount is "+cp.getTotalAmount());
		if(cp.getAmount()<cp.getTotalAmount()) {
			cp.setChange(cp.getAmount()-cp.getTotalAmount());
			System.out.println("Required amount "+cp.getRequiredAAmount());
		}
		else {
			System.out.println("change "+cp.getChange());
		}
		System.out.println("************************************************");
		
	}
	private static void GetStock(int stock,int qt) {
		if(qt>stock) {
			System.out.println("sorry "+(qt-stock)+" products are less than available stock");
			System.out.println("available stock "+ap.getStock());
			System.out.println("please enter new quantity");
			cp.setQuantity(sc.nextInt());
		}
		
		}
	
	public static void updateCustomerData() {
		int ch = 0;
		boolean a = true;
		while(a) {
		System.out.println("press 1 to update customer name\npress 2 to update customer id\npress to update quantity");
		try {
		int ch1 = sc.nextInt();
		ch= ch1;
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
			sc.nextLine();
		}
		switch(ch) {
		case 1:
			System.out.println("enter new customer name");
			cp.setCustomerName(sc.next());
			System.out.println("updated time is "+ LocalDateTime.now());
			break;
		case 2:
			int id;
			while(true) {
				try {
				System.out.println("enter customer id ");
				id = sc.nextInt();
				break;
				}
				catch(Exception e) {
					System.out.println("Invalid Input");
					sc.nextLine();
				}
				}
				cp.setCustomerId(id);
				System.out.println("updated time is "+ LocalDateTime.now());
			break;
		case 3:
			int qt;
			while(true) {
				try {
				System.out.println("enter quantity");
				qt = sc.nextInt();
				break;
				}
				catch(Exception e) {
					System.out.println("Invalid Input");
					sc.nextLine();
				}
				}
				cp.setQuantity(qt);
				System.out.println("updated time is "+ LocalDateTime.now());
			break;
		default:
			 if(ch<1||ch>3) {
			 System.out.println("Invalid Choice");
			 }
			 break;
		}
		a=false;
		} 
		
		
	}
	
	}


