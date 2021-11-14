package com.ltts;



public class Innings {
	private String  teamname;
	private String  inningsname;
	private int runs;
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
		
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	 public int getRuns() {
		 return runs;
	 }
	 public void setRuns(int runs) {
		 this.runs = runs;
	 }
	 void displayInningsDetails(String inningsname,int runs,String teamname) {
		 int run=runs+1;
		 String boom="first";
	 if( boom.equals(inningsname) ) {
		
		 System.out.println("Name:"+teamname);
		 System.out.println("Scored:"+runs);
		 System.out.println("Need"+ " " + run + " " +"to win");
	 }
	 else  {
		 System.out.println("Name:"+teamname);
		 System.out.println("Scored:"+runs);
		 System.out.println("Match Ends");
	 }
	 
	 
		 
	 }
		
}
