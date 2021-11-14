package com.ltts;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e=new Employee();//created an object to access employee class.
		e.setName("Enter the Name:"); //installizing setter method from employee class.
		e.setAddress("Enter Address:");
		e.setMobile("Enter Mobile:");
		Scanner sc=new Scanner(System.in);
		System.out.println(e.getName());
		String name=sc.next();
		System.out.println(e.getAddress());
		String address=sc.next();
		System.out.println(e.getMobile());
		String mobile=sc.next();
		System.out.println("Employee Details");
		System.out.println("Name:" +name);
		System.out.println("Address:" +address);
		System.out.println("Mobile:" +mobile);

	}

}
