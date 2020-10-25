package assignment4;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		double totalDiscount=0,totalPrice=0,totalPriceAfterDiscount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many packages did you buy?");
		int numberOfPacksBought=sc.nextInt();
		totalPrice=99*numberOfPacksBought;
		if (numberOfPacksBought>=10 && numberOfPacksBought<20) {
			totalDiscount=numberOfPacksBought*99*0.2;
			totalPriceAfterDiscount=numberOfPacksBought*99*0.8;
		}else if (numberOfPacksBought>=20 && numberOfPacksBought<50) {
			totalDiscount=numberOfPacksBought*99*0.3;
			totalPriceAfterDiscount=numberOfPacksBought*99*0.7;
		}else if(numberOfPacksBought>=50 && numberOfPacksBought<100) {
			totalDiscount=numberOfPacksBought*99*0.4;
			totalPriceAfterDiscount=numberOfPacksBought*99*0.6;
		}else if(numberOfPacksBought>=100) {
			totalDiscount=numberOfPacksBought*99*0.5;
			totalPriceAfterDiscount=numberOfPacksBought*99*0.5;
		}
		System.out.println("Total Price is "+ totalPrice);
		System.out.println("Total discount is "+ totalDiscount);
		System.out.println("Total price after discount is "+ totalPriceAfterDiscount);
		
	}

}
