package com.day9AddressBook;

import java.util.Scanner;

public class AddressBookMain {


	public void addressBookDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String Name = sc.next();
		System.out.println("Enter the Address :");
		String Address = sc.next();
		System.out.println("Enter the City Name :");
		String City = sc.next();
		System.out.println("Enter the Pincode :");
		int Pincode = sc.nextInt();
		System.out.println("Enter the Mobile Number : ");
		long MobileNo = sc.nextLong();
		System.out.println("Enter the Email : ");
		String Email = sc.next();
		
		AddressBook address = new AddressBook(Name, Address, City, Pincode, MobileNo, Email);
		address.printAddressBook();
	}
	public static void main(String[] args) {
		AddressBookMain addressmain = new AddressBookMain();
		addressmain.addressBookDetails();
	}
}
