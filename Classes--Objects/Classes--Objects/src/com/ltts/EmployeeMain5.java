package com.ltts;

import java.util.Scanner;

public class EmployeeMain5 {
	
		public static void main(String[] args) {
			Employee5  e = new Employee5();
			e.setDetails();
			e.display();
			
			Menu m1=new Menu();
			m1.menu();
			
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			while(input!=4) {
				e.update(input);
				m1.menu();input=sc.nextInt();
			}
			if(input==4) {
				System.out.println("The detals are:");
				e.display();
				return;
			}
			
			
			
			
			
		}

	}


