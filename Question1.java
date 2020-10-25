package assignment4;

import java.util.Scanner;

public class Question1 {
/*Question-1
The body mass index (BMI) is used to estimate the risk of weight-related problems based on a subject's height and mass. It was designed by the mathematician Adolphe Quetelet in the 1800s and is sometimes referred to as the Quetelet index. The BMI is computed as:
       BMI = mass (kg) / (height * height (meters))
In this formula, mass is in kilograms and height is in meters. The health risk associated with a BMI value is
      - Underweight<18.5
      - Normal Weight>=18.5 and <25
      - Overweight>=25 and <30
      - Obese>=30

In this case study, the users input their weight in pounds and height in feet and inches. 
The program then outputs the BMI and associated health risk. 
To do this we must first make our program convert from pounds to kilograms. 
One kilogram is 2.2 pounds. 
Additionally, the program must convert height in feet and inches to meters. 
If we convert the height to all inches, then we can multiply by 0.0254 to convert inches to meters.

Sample Output:

Your weight in pounds:  150

Your height in feet followed by a space then additional inches: 5 5

Your BMI is 25.01349811736

Your risk factory is Overweight*/
	public static void main(String[] args) {
		bMI();
	}

	public static void bMI() {
	// TODO Auto-generated method stub
//	double x=heightConversion();
//	double bMI=weightConversion()/(x*x);
	
	System.out.printf("Your BMI is %.0f",10.02345);
}

	public static double heightConversion() {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your height in ft and inches by one space");
	String height=sc.nextLine();
	String[] height1=height.split(" ");
	int feet=Integer.parseInt(height1[0]);
	int inches=Integer.parseInt(height1[1]);
	inches=feet*12+inches;
	double meters=0.0254*inches;
	return meters;
}

	public static double weightConversion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your weight in pounds");
		double weight=sc.nextDouble();
		double weightkilo=weight/2.2;
		return weightkilo;
}

}
