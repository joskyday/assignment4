package assignment4;

import java.util.Scanner;

/*Question 5:

The date June 10, 1960, is special because when we write it in the following format, 
the month times the day equals the year:  6/10/60

Write a Java program that lets the user declare a month (in numeric form), a day, and a two-digit year. 
The program should then determine whether the month times the day is equal to the year. 
If so, it should display a message saying the date is magic. 
Otherwise, it should display a message saying the date is not magic.*/
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter day");
		int day=sc.nextInt();
		System.out.println("enter year in two digit");
		int year=sc.nextInt();
		if(year==month*day) System.out.println("the date is magic");
		else System.out.println("the date is not magic");
		
	}

}
