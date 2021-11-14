package com.ltts;

import java.util.Scanner;

public class Custom {
	 public static void main(String[] args)
	    {
	          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
	          System.out.print("Enter the player name: ");
	       
			  String name =sc.next(); 
	          System.out.println("Enter player  Age");
	 
	          int age = sc.nextInt();         //Taking input from user
	 
	          try
	          {
	              if(age < 19)
	              {
	                  throw new Exception("InvalidAgeRangeException");    //throws AgeIsNegativeException if age is negative
	              }
	              else {
	            	  System.out.println("Player name :" +name);
	            	  System.out.println("Player Age :" +age);
	              }
	          }
	          catch(Exception ex)
	          {
	              System.out.println(ex);    //Output : Age can not be negative
	          }
	    }
	

}
