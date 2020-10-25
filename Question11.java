package assignment4;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter medium for sound travel:");
		String medium=sc.next();
		System.out.println("Enter distance for sound travel:");
		int distance=sc.nextInt();
		double travelTime=0;
		switch (medium) {
		case "air": case "Air": case  "AIR" :
			travelTime=distance/1100.0;   //1100 in feet per second  //distance in feet// travelTime in seconds
			System.out.printf("Travel time is %.3f", travelTime);
			break;
		case "water": case "Water": case "WATER":
			travelTime=distance/4900.0;   //4900 in feet per second  //distance in feet// travelTime in seconds
			System.out.printf("Travel time is %.3f", travelTime);
			break;
		case "steel": case "Steel": case "STEEL":
			travelTime=distance/16400.0;   //16400 in feet per second  //distance in feet// travelTime in seconds
			System.out.printf("Travel time is %.3f", travelTime);
			break;
		default:
			System.out.println("Invalid Entry!");
			break;
		}
	}

}
