package com.ltts;

import java.util.Scanner;
import java.util.*;
public class RunRate{
    Scanner scan=new Scanner(System.in);
    int runs, balls;
    float runRate;
    public void input(){
        try{
            System.out.println("Enter Total Runs Scored: ");
            runs=scan.nextInt();
            System.out.println("Enter Total overs:");
            balls=scan.nextInt();
        }
        catch(NumberFormatException e){
            System.out.println("Error Code: "+e);
            System.exit(0);
        }
    }

    public void compute(){
        runRate=runs/balls;
        System.out.println("Current Run Rate of "+runRate+"");
    }

    public static void main(String[] args){
        RunRate obj=new RunRate();
        obj.input();
        obj.compute();
    }
}

