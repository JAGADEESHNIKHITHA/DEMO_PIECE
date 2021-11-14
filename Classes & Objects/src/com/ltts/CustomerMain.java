package com.ltts;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("enter the details");
		name=sc.next();
		String [] spliti = {"name:","address:","mobile:"};
		String[] arrSplit_3 = name.split(",");
	    for (int i=0; i < arrSplit_3.length; i++){
	      
	      System.out.println(spliti[i]+arrSplit_3[i]);
	    }
	}

}
