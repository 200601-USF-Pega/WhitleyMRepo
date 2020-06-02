//package com.revature.tourofheroes.service;

//import com.revature.tourofheroes.exceptions.InvalidHealthException;
//import com.revature.tourofheroes.models.Hero;
import java.util.Scanner;


public class Service {
	public boolean createNewHero() {
		//get user input 
		//String[] specialMoves = {"heat vision", "light", "invulnerability"};
		Hero newHero;
		//order matters in catch blocks
		try {
			//newHero = new Hero("Superman", specialMoves, -2, false);
			System.out.print("Pick your hero name: ");
			Scanner scan = new Scanner(System.in);
			String heroName= scan.nextLine();
			
			System.out.print("How many powers does your hero have? ");
			int numberOfPowers = scan.nextInt();
			scan.nextLine();
			//^^scanners can be buggy so you use this to make it work
			String[] specialMoves = new String[numberOfPowers];
			
			for(int i=0; i<numberOfPowers; i++) {
				System.out.print("Pick your hero special move: ");
				specialMoves[i] = scan.nextLine();
				
				}
			
			
			System.out.print("Set your hero health: ");
			int heroHealth = scan.nextInt();
			boolean alive;
			if(heroHealth>0) {
				alive=true;
			}
			else {
				alive=false;
			}
			
		newHero = new Hero(heroName, specialMoves, heroHealth, alive);
		
			
		} catch (InvalidHealthValueException e) {
			// TODO Auto-generated catch block
			System.out.println("Creation failed try again");
			return false;
		} finally {
			//usually where clean up goes
			System.out.println("Tried to make a hero could've failed");
		}
		// try with resources - to read on 
		System.out.println(newHero);
		return true;
	}
}