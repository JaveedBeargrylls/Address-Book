package com.bridgelabz.AddressBook;

import java.util.Scanner;

public class Choice {
	static Scanner sc = new Scanner(System.in);
	
	static UserDetails arr[] = new UserDetails[10];
	static int count = 0;
	
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String zip;
		String mobileNo;
		String email;
		
	public Integer choice() {
		
		System.out.println("1. Add Details 2. Update Details 3. Delete Details 4. Show Details");

		int choice = sc.nextInt();
		
			switch(choice) {
			
			case 1: System.out.println("Add Details");
			System.out.println("Enter how many contacts to be added to the AddressBook");
			int num=sc.nextInt();
			
			for(int i = 0; i < num; i++)
			{
				System.out.println("Enter first name");
				firstName = sc.next();

				System.out.println("Enter last name");
				lastName = sc.next();
				
				System.out.println("Enter address");
				address = sc.next();
				
				System.out.println("Enter city");
				city = sc.next();
				
				System.out.println("Enter State");
				state = sc.next();
				
				System.out.println("Enter zip");
				zip = sc.next();
				
				System.out.println("Enter mobileNo");
				mobileNo = sc.next();
				
				System.out.println("Enter Email Id");
				email = sc.next();
				
				arr[count] = new UserDetails(firstName, lastName, address, city, state, zip, mobileNo, email);
				count++;
				break;
				}
			System.out.println("Details added Successfully");
			break;
			 
			case 2: System.out.println("Update Details");
			
			System.out.println("enter first name to Edit that Contact");
			
			firstName = sc.next();
			
			for(int i = 0; i < count; i++)
			{
				if(arr[i].getFirstName() == firstName && arr[i] != null) 
				{
					
				System.out.println("Enter first name");
				firstName = sc.next();
				arr[i].setFirstName(firstName);

				System.out.println("Enter last name");
				lastName = sc.next();
				arr[i].setLastName(lastName);
				
				System.out.println("Enter address");
				address = sc.next();
				arr[i].setAddress(address);
				
				System.out.println("Enter city");
				city = sc.next();
				arr[i].setCity(city);
				
				System.out.println("Enter State");
				state = sc.next();
				arr[i].setState(state);
				
				System.out.println("Enter zip");
				zip = sc.next();
				arr[i].setZip(zip);
				
				System.out.println("Enter mobileNo");
				mobileNo = sc.next();
				arr[i].setMobileNo(mobileNo);
				
				System.out.println("Enter Email Id");
				email = sc.next();
				arr[i].setEmail(email);
				break;

				}				
			}
			System.out.println("Details Updated");
			break;
			
			case 3: System.out.println("Delete Details");
			
			System.out.println("Enter the first name to delete that contact");
			firstName = sc.next();
			
			for(int i = 0; i < count; i++)
			{
				if(arr[i].getFirstName() == firstName)
				{
					arr[i] = null;
				}
			}
			System.out.println("Deleted the details");
			break;
			
			case 4: System.out.println("Show the Details");
				for(int i = 0; i < count; i++)
				{
					System.out.println(arr[i]);
				}
			
			return choice;	
			
			default: System.out.println("Invalid entered valid choice");
			break;
			}
			return choice;
		}
	}



















