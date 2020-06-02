//package com.revature.tourofheroes.menu;
import java.util.Scanner;

public class Menu {
	public void mainMenu() {
		System.out.println("Welcome to my tour of heroes app");
		System.out.println("What would you like to do?");
		System.out.println("[0] Create a hero?");
		System.out.println("[1] Exit");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int option;
		
		try {
			option = Integer.parseInt(input);
		}
		catch(NumberFormatException optionExp){
			option=1;
			System.out.println("Option choice not an integer. Goodbye. ");
		}	
	
		
		//switch for user input to point them to appropriate places in the code 
		switch(option) {
		case 0: 
			Service caseZero = new Service();
			caseZero.createNewHero();
			break;
		case 1:
			System.out.println("Exiting...");
			break;			
		default:
			System.out.println("Not an option");
		}
		
		
	}
}
