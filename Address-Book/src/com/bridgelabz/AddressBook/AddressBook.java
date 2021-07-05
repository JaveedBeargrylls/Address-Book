package com.bridgelabz.AddressBook;

import java.util.Scanner;

public class AddressBook {
	
	// created a AddressBook
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[14]; 
		int i;
		String Fname, Lname, Addr, city, state, email, phone, zip; 
		UserDetails obj = new UserDetails("Javeed", "D","AbcStreet", "Chittoor", "Andhra", "517001","9100188627", "javeed12345@gmail.com");
		Fname=obj.getFirstName();
		Lname=obj.getLastName();
		Addr=obj.getAddress();
		city=obj.getCity();
		state=obj.getState();
		email=obj.getEmail();
		phone=obj.getMobileNo();
		zip=obj.getZip();
		
		arr[0] = Fname;
		arr[1] = Lname;
		arr[2] = Addr;
		arr[3] = city;
		arr[4] = state;
		arr[5] = email;
		arr[6] = phone;
		arr[7] = zip;
		
		// Stored in array form
		
		System.out.println("Person data in array:");
		
		
		
		// added the new contact ot the address book
		
		for ( i =7; i<14; i++)
		{
			arr[i] = sc.next();
		}
		
		System.out.println("UserDetails");
		
		for ( i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}		
}
