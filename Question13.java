package assignment4;

import java.util.Scanner;

public class Question13 {
	/*
	 * Question-13: A bank charges a base fee of $10 per month, plus the following
	 * check fees for a commercial checking account: $.10 each for less than 20
	 * checks $.08 each for 20-39 checks $.06 each for 40-59 checks $.04 each for 60
	 * or more checks Write a program that lets the user declare the number of
	 * checks written for the month. The program should then calculate and display
	 * the bank's service fees for the month.
	 */
	public static void main(String[] args) {
		double serviceFee = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of checks written for the month:");
		int numberOfChecks = sc.nextInt();
		if (numberOfChecks < 20)
			serviceFee = 10 + numberOfChecks * 0.1;
		else if (numberOfChecks >= 20 && numberOfChecks < 40)
			serviceFee = 10 + numberOfChecks * 0.08;
		else if (numberOfChecks >= 40 && numberOfChecks < 60)
			serviceFee = 10 + numberOfChecks * 0.06;
		else if (numberOfChecks >= 60)
			serviceFee = 10 + numberOfChecks * 0.04;
		System.out.println("The bank's service fees for the month: "+ serviceFee);
	}

}
