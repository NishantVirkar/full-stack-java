package com.myproject;
import java.time.LocalDateTime;
import java.util.Scanner;


public class OperationsShop {
		static Scanner sc= new Scanner(System.in);
		static Appliances ap= new Appliances();
		public static void setProductData() {
			
			int id;
			double price;
			int stock;
			
			while(true) {
			try {
				System.out.println("enter product id");
			    id =sc.nextInt(); 
			    break;
			}
			catch(Exception e) {
				System.out.println("Invalid Input\n\n");
				sc.nextLine();
			}
			}
			ap.setProductId(id);
			System.out.println("enter product name");
			ap.setProductName(sc.next());
			
			while(true) {
			try {
			System.out.println("enter product price");
			price =sc.nextDouble();
			break;
			}
			catch(Exception e) {
				System.out.println("Invalid Input\n\n");
				sc.nextLine();
			}
			}
			ap.setPrice(price);
			ap.setGST(ap.getPrice()+(0.18*ap.getPrice()));
			while(true) {
				try {
				System.out.println("enter product stock");
				stock =sc.nextInt();
				break;
				}
				catch(Exception e) {
					System.out.println("Invalid Input\n\n");
					sc.nextLine();
				}
				}
				ap.setStock(stock);
			
			System.out.println("*****product added successfully******");
			
			
		}
		
		public static void getProductData() {
			System.out.println("**********************************");
			System.out.println("--------PRODUCT INFO---------");
			System.out.println("product name is "+ap.getProductName());
			System.out.println("product id is "+ap.getProductId());
			System.out.println("product price is "+ap.getPrice());
			System.out.println("product price with gst is "+ap.getGST());
			System.out.println("product stock is "+ap.getStock());
			System.out.println("***********************************");
			
		}
		
		public static void updateProductData() {
			int ch = 6;
			boolean a = true;
			while(a) {
			System.out.println("**************************************************");
			try {
			System.out.println("press 1 to update product id\npress 2 to update product name\npress 3 to update price\npress 4 to update stock\npress 5 to update customer info");
			int ch1=sc.nextInt();
			ch=ch1;
			}
			catch(Exception e) {
				System.out.println("Invalid Input");
			}
			switch(ch) {
			
			case 1:
				int id;
				while(true) {
				try {
					System.out.println("enter new product id");
				    id =sc.nextInt(); 
				    break;
				}
				catch(Exception e) {
					System.out.println("Invalid Input\n\n");
					sc.nextLine();
				}
				}
				ap.setProductId(id);
				System.out.println("updated time is "+ LocalDateTime.now());
				a=false;
				break;
			case 2:
				System.out.println("enter new product name");
				ap.setProductName(sc.next());
				System.out.println("updated time is "+ LocalDateTime.now());
				a=false;
				break;
			case 3:
				double price;
			
				while(true) {
					try {
					System.out.println("enter product price");
					price =sc.nextDouble();
					break;
					}
					catch(Exception e) {
						System.out.println("Invalid Input\n\n");
						sc.nextLine();
					}
					}
					ap.setPrice(price);
				System.out.println("updated time is "+ LocalDateTime.now());
				a=false;
				break;
			case 4:
				int stock;
				while(true) {
					try {
					System.out.println("enter product stock");
					stock =sc.nextInt();
					break;
					}
					catch(Exception e) {
						System.out.println("Invalid Input\n\n");
						sc.nextLine();
					}
					}
					ap.setStock(stock);
					System.out.println("updated time is "+ LocalDateTime.now());
					a=false;
				break;
			case 5:
				OperationsCustomer.updateCustomerData();
				a=false;
				break;
			default:
				 if(ch<1||ch>5) {
				 System.out.println("Invalid Choice");
				 }
				 break;
			}
			System.out.println("*********************************************");
			
		}
			
		}
		public static Appliances getObject() {
			return ap;
		}
		

	}


