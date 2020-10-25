package assignment4;
/*Question-3
 
Any year is input by the user. Write a program to determine whether the year is a leap year or not.
Leap Years are any year that can be evenly divided by 4.  A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.

Example : 
1992      Leap Year
2000      Leap Year
1900      NOT a Leap Year*/
public class Question3 {

	public static void main(String[] args) {
		LeapYear(800);

	}
	public static void LeapYear(int year) {
		if (year%4==0&&year%100!=0||year%400==0 ) System.out.println("Leap Year");
		
		else System.out.println("Not Leap Year");
	}
	public static void LeapYear(int startPeriod,int endPeriod) {
		for(int i=startPeriod;i<=endPeriod;i++) {
			if (i%4==0&&i%100!=0||i%400==0 ) System.out.println(i);
		}
	}
	public static void LeapYears(int startPeriod, int endPeriod) {
		ab: for (int row = 1; row <= (endPeriod - startPeriod); row++) {
			int counter = 0;
			for (int i = startPeriod; i <= endPeriod; i++) {
				//if (i % 4 == 0 && i % 100 != 0 ||  i % 400 == 0) {
				if (i != 0 && i % 4 == 0 && i % 100 != 0 || i != 0 && i % 400 == 0) {
					System.out.print(i + "\t");
					counter++;
					if (counter == 10) {
						startPeriod = i + 1;
						break;
					}
				}
			if (i==endPeriod) break ab;	
			}
			System.out.println();
		} 
	}
}	
