package com.mypackage;
public class A {
	public static void main(String[] args) {
		//boxing= premetive to object,parameterized static
		int a =10;
		Integer b=Integer.valueOf(a);
		System.out.println(b);
		
		//unboxing= object to premetive, non static ,non parameterized
		Integer d =20;
		int r = d.intValue();
		System.out.println(r);
		
		//Premetive to string,parameterized, static
		byte ab = 3;
		String jk = Byte.toString(ab);
		System.out.println(jk);
		
		//string to premetive,parameterized , static
		String gh = "100";
		int kl =Integer.parseInt(gh);
		System.out.println(kl);
		
		//object to string
		Integer mn = 10;
		String kp = mn.toString();
		System.out.println(kp);
		
		//string to object
		String mo ="10";
		Integer po = Integer.parseInt(mo);
		System.out.println(po);
		
		
	}

}
