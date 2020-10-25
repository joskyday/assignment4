package assignment4;

import java.util.Scanner;

/*Question-12:

An internet service provider has three different subscription packages for its customers:

Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour

Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour

Package C: For $19.95 per month unlimited access is provided

Write a program that calculates a customer's monthly bill.
It should let the user declare the letter of the package the customer has purchased (A, B, or C) 
and the number of hours that were used. It should then display the total charges.*/
public class Question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double totalCharge=0;
		double hours=0;
		System.out.println("Enter your subscription package:");
		String pack=sc.next();
		if (!pack.equalsIgnoreCase("C")) {
		System.out.println("Enter number of hours of access:");
		hours=sc.nextInt();
		}
		if(pack.equalsIgnoreCase("A")) {
			if(hours<=10) totalCharge=9.95;
			if(hours>10) totalCharge=9.95+(hours-10)*2;
		}if(pack.equalsIgnoreCase("B")) {
			if(hours<=20) totalCharge=13.95;
			if(hours>20) totalCharge=13.95+(hours-20)*1;
		}if(pack.equalsIgnoreCase("C")) totalCharge=19.95;
		System.out.println("Total charge is "+totalCharge);	
	}
}
