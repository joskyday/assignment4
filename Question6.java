package assignment4;

import java.util.Locale;
import java.util.Scanner;

/*Question 6:
Scientists measure an object's mass in kilograms and its weight in Newton.
If you know the amount of mass that an object has, 
you can calculate its weight, in Newtons, with the following formula:
             Weight = Mass * 9.8
Write a program that asks the user to enter an object's mass, 
and then calculate its weight. 

If the object weighs more than 1000 Newtons, 
display a message indicating that it is too heavy. 

If the object weighs less than 10 Newtons, 
display a message indicating that the object is too light.*/
public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in).useLocale(Locale.ENGLISH);
		System.out.println("enter mass in kilogram");
		double kg=sc.nextDouble();
		double weight=kg*9.8;
		if (weight>1000) System.out.println("too heavy!!");
		else if (weight<10) System.out.println("too light!!");

	}

}
