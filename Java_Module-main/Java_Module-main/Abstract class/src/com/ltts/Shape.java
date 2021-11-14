package com.ltts;

import java.util.*;
abstract class Shape{  
abstract double calculateArea(int value);  
}  
  
class Circle extends Shape{  
	double calculateArea(int value) {
		int val = value;
		double sol;
		sol = 3.14*(val*val);
		return sol;
	}
}  
class Square extends Shape{  
	double calculateArea(int value) {
		int val = value;
		double sol;
		sol = (val*val);
		return sol;
	}
}  
 
class ShapeMain{  
public static void main(String args[]){ 
	double cc;
	int para;
	String boom;
	Scanner sc = new Scanner(System.in);
	System.out.println("Circle");
	System.out.println("Square");
	System.out.println("Enter the shape");
	boom = sc.next();
	if(boom.equals("Circle"))
	{
		System.out.println("Enter the radius of the circle");
		para = sc.nextInt();
        Shape s=new Circle();
        cc=s.calculateArea(para);
    	System.out.println("The area of circle is "+cc);
        
	}
	else
	{
		System.out.println("Enter the side of the square");
		para = sc.nextInt();
		Shape s=new Square();
		cc=s.calculateArea(para);
		System.out.println("The area of square is "+cc);
	}
	
}  
}  