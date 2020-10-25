package assignment4;

import java.util.Scanner;

public class Question14 {
/*Question-14:
ABC Booksellers has a book club that awards points to its customers 
based on the number of books purchased each month. The points are awarded as follows:

If a customer purchases 0 books, he or she earns 0 points.
If a customer purchases 1 book, he or she earns 5 points.
If a customer purchases 2 books, he or she earns 15 points.
If a customer purchases 3 books, he or she earns 30 points.
If a customer purchases 4 books or more books, he or she earns 60 points.
Write a program that lets the 
user declare 
the number of books that he or she has purchased this month 
and then display the number of points awarded.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of books purchased this month:");
		int numberOfBooksPurchased=sc.nextInt();
		int points=0;
		if(numberOfBooksPurchased==1) points=5;
		else if(numberOfBooksPurchased==2) points=15;
		else if(numberOfBooksPurchased==3) points=30;
		else if(numberOfBooksPurchased>=4) points=60;
		System.out.println("The number of points awarded: "+points);
	}
}
