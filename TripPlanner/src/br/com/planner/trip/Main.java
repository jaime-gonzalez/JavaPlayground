package br.com.planner.trip;

import java.util.Scanner;

import java.lang.Math;

public class Main {
	
	public static void main(String[] args) {
		introduction();
		budget();
		time();
		distance();
	}
	
	static void introduction() {
		System.out.println("Welcome to Vacation Planner!" + "\n" + "What is your name?");
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
		String destination = input.nextLine();
		System.out.println("Great! " + destination + " sounds like a great trip");
		System.out.println("***************"+ "\n");
		}
		
	static void budget() {
		
		System.out.print("How many days are you going to spend travelling? ");
		int days=input.nextInt();
		System.out.println("If you are travelling for "+days+" days that is the same as "+(days*24)+" hours or "+(days*1440)+" minutes");
		System.out.print("How much money, in USD, are you planning to spend on the trip? ");
		float money = input.nextFloat();
		double roundedDailyBudget = Math.round(money/days);
		System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+roundedDailyBudget+" USD");
		System.out.println("\n");
		}
		
	static void time () {
		
		System.out.print("What is the time difference, in hours, between your home and your destination? ");
		int timeDiff=input.nextInt();
		if (12+timeDiff>24) {
            timeDiff=timeDiff%24;
        }
		
		System.out.println("That means that when it is midnight at home it will be "+(0+timeDiff)+":00 in your travel destination");
        System.out.println("and when it is noon at home it will be "+(12+timeDiff)+":00");
		System.out.println("***************"+ "\n");
		}
		
	static void distance() {
		
		 System.out.print("What is the square area of your destination country in km? ");
	     int kilometers=input.nextInt();
	     Double miles=kilometers*0.62137;
	     System.out.println("In miles that is "+miles);
	     System.out.println("***************"+ "\n\n");
		}
	
	static Scanner input=new Scanner(System.in);
}	
