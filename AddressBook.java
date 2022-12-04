package com.day9AddressBook;

import java.util.Scanner;

public class AddressBook {

	String Name;
	String Address;
	String City;
	int PinCode;
	long MobileNo;
	String Email;
	public AddressBook(String name, String address, String city, int pinCode, long mobileNo, String email) {
		Name = name;
		Address = address;
		City = city;
		PinCode = pinCode;
		MobileNo = mobileNo;
		Email = email;
	}
	
	public void printAddressBook() {
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(City);
		System.out.println(PinCode);
		System.out.println(MobileNo);
		System.out.println(Email);
	}
	
}
