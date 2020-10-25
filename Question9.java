package assignment4;

import java.util.Scanner;

/*The Fast Freight Shipping Company charges the following rates:

Weight of Package							Rate per 500 Miles Shipped
2 pounds or less							$1.10
Over 2 pounds but not more than 6 pounds	$2.20
Over 6 pounds but not more than 10 pounds	$3.70
Over 10 pounds								$3.8
The shipping charges per 500 miles are not prorated. For example, 
if a 2-pound package is shipped 550 miles, 
the charges would be $2.20. Write a program that lets the user 
declare the weight of a package and then displays the shipping charges.*/
public class Question9 {

	public static void main(String[] args) {
		
		int distance=950;
		double charge=0;
		System.out.println("enter weight of pack:");
		Scanner sc=new Scanner (System.in);
		double weight=sc.nextDouble();
		if (weight<=2) charge=1.1; 
		else if (weight>2 && weight<=6) charge=2.2;
		else if (weight>6 && weight<=10) charge=3.7;
		else if (weight>10) charge=3.8;
		if (distance%500==0) charge=charge*distance/500;
		else if (distance%500!=0) charge=charge*(distance/500+1);
		System.out.println("Your charge is "+ charge);
	}

}
