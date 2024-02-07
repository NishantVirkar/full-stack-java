package com.b;

import java.util.Scanner;

public class Demo {
	public static void getNextPerfectsqr() {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int a =sc.nextInt();
		double b =Math.sqrt(a);
		System.out.println("the square root of"+a+"is"+b);
		if(b%1==0) {
			 num = (int) ((b+1)*(b+1));
		}
		else {
			 num=-1;
		}
		System.out.println(num);
	}

}
