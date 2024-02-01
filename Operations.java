package com.electronics;

import java.util.Scanner;

import com.inter.Iphone;
import com.inter.Samsung;

public class Operations {
	public static void getMobiles() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for iphone\npress 2 for samsung");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			Iphone.mobileInfo();
			Iphone ip=new Iphone();
			System.out.println(ip.getName());
			System.out.println(ip.getProduct());
			System.out.println(ip.getPrice());
			System.out.println(ip.getCatagory());
			
			break;
		case 2:
			Samsung.mobileInfo();
			Samsung sg = new Samsung();
			System.out.println(sg.getProduct());
			System.out.println(sg.getName());
			System.out.println(sg.getPrice());
			System.out.println(sg.getCatagory());
			
			break;

		
	}

	}

	public static void getTv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for samsung\n press 2 for android");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			break;
		case 2:
			break;
		
		
		
	}
}

	public static void getAc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for samsung\n press 2 for android");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			break;
		case 2:
			break;
		
	}
}
}