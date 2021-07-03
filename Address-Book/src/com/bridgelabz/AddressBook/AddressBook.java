package com.bridgelabz.AddressBook;

public class AddressBook {
	
	// created a AddressBook
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Address Book");
		
		// Created the AddressBook
		
		UserDetails obj = new UserDetails("Javeed","Dudekula","BoundStreet","Chittoor","517002","Andhra","9100188627","javeed12345@gmail.com");
		System.out.print("\n"+"\t ADDRESS BOOK"+"\n NAME = "+obj.getFirstName()+obj.getLastName());
        System.out.print("\n ADDRESS = "+obj.getAddress()+", "+obj.getCity()+", "+obj.getZip());
        System.out.println("\n PhoneNUmber = "+obj.getMobileNo()+"\n Email = "+obj.getEmail() );
	
	}
}
