package com.addition;
import java.util.Scanner;

public class Addition {
	public void add(int a, int b) {
		int c =a+b;
		System.out.println("addition is "+c);
		
	}
	
	public static void main(String[] args) {
		Addition ad = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first num=");
		int num1 =sc.nextInt();
		System.out.println("enter second num=");
		int num2 = sc.nextInt();
		ad.add(num1, num2);
		
	}

}
