package com.bridgelabz.AddressBook;

import java.util.Scanner;

public class AddressBook {
	
	// created a AddressBook
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the address book");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Add Details 2. Update Details");

		int choice = sc.nextInt();
		
		sc.close();
	}		
}
