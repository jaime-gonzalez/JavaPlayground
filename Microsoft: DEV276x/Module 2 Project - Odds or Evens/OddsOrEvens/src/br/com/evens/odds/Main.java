package br.com.evens.odds;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Let's play a game called ´Odds and Evens´");
		
		System.out.println("What is your name?");
		
		String name = input.nextLine();
		
		System.out.println("Hi "+name+", which do you choose? (O)dds or (E)vens?");
		
		String choice = input.nextLine();
		
		if (choice.equals("O")) {
			System.out.println(name + " has picked odds! The computer will be evens.");
		}else if (choice.equals("E")) {
			System.out.println(name + " has picked evens! The computer will be odds.");
		}else {
			System.out.println(name + " has picked an invalid option! Try again.");
		}
		
		System.out.println("-------------------------");
		
		System.out.println("How Many ´fingers´ do you put out?");
	
		int player = input.nextInt();
		
		Random rand = new Random();
		int computer = rand.nextInt(6);
		
		System.out.println("The computer plays "+computer+" fingers");
		
		System.out.println("-------------------------");
		
		int sum = player + computer;
			
		boolean oddOrEven = sum % 2==0;
		
		boolean choiceIsEven = choice == "E";
		boolean choiceIsOdd = choice == "O";
		
		System.out.println(player+" + "+computer+" = "+sum);
		
		if (oddOrEven) {
			System.out.println(sum+" is ... even!");
			if(choiceIsEven) {
				System.out.println("That means "+name+" wins! :)");
			}else{
				System.out.println("That means the Computer wins! :(");
		}}
			
		if (!oddOrEven) {
			System.out.println(sum+" is ... odd!");
			if(choiceIsOdd) {
				System.out.println("That means "+name+" wins! :)");
			}else{
				System.out.println("That means the Computer wins! :(");
		}}
		
	}
	
	private static Scanner input = new Scanner(System.in);
	
}

