package assignment4;

import java.util.Scanner;

/*Write a switch-case program:

1- Declare a number

2- IF the number is 0,1 or 2 print "Low Number. 
IF the number is 3,4,5 print "Medium Number". 
IF the number is is not between 0-5 then print "Other Number"*/
public class Question15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		switch (number) {
		case 0: case 1: case 2:
			System.out.println("Low Number");
			break;
		case 3: case 4: case 5:
			System.out.println("Medium Number");
			break;
		default:
			System.out.println("Other Number");
			break;	
		}

	}

}
