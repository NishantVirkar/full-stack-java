package com.myproject;
import java.util.Scanner;
public class App {    
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
	 int ch=0;
	 while(true) {
	     try {
	     System.out.println("press 1 to add product info\npress 2 to add customer info\npress 3 to see product info\npress 4 to update product info\npress 5 to update customer info\npress 6 for billing");
		 int ch1=sc.nextInt();
		 ch=ch1;
		 }
		 catch(Exception e) {
	     System.out.println("Invalid Input\n\n");
		 sc.nextLine();
		 }
		 switch(ch) {
		 case 1:
			 OperationsShop.setProductData();
			 break;
		 case 2:
			 OperationsCustomer.setCustomerData();			
			 break;
		 case 3:
			 OperationsShop.getProductData();
			 break;
		 case 4:
			 OperationsShop.updateProductData();
			 break;
		 case 5:
			 OperationsCustomer.updateCustomerData();
			 break;
		 case 6:
			 OperationsCustomer.getBilling();
			 break;
		 default:
			 if(ch<1||ch>6) {
			 System.out.println("Invalid Choice");
			 }
			 break;
		 }
			
		 }
			
	 }
		

 }



