package com.ltts;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		Innings i=new Innings();
		Scanner sc=new Scanner(System.in);
		i.setTeamname("Enter the teamname");
		i.setInningsname("Enter the Inningsname");
		
		
		
		
		
		System.out.println(i.getTeamname());
		String teamname=sc.next();
		System.out.println(i.getInningsname());
		String inningsname=sc.next();
		System.out.println("enter the runs");
		int runs;
		runs=sc.nextInt();
		i.setRuns(runs);
		i.displayInningsDetails(inningsname, runs, teamname);
		
		
		
		
		

	}

}
