package assignment4;

import java.util.Scanner;

/*Question-10:

Write a program that lets the user declare a number of calories and fat grams in a food item. 
The program should display the percentage of calories that come from fat. 
One gram of fat has 9 calories; therefore:

                Calories from fat = Fat grams * 9

The percentage of calories from fat can be calculated as follows:

                Calories from fat/Total Calories

If the calories from fat are less than 30 percent of the total calories of the food, it should also display a message indicating the food is low in fat.
Note: The number of calories from fat can not be greater than 
the total number of calories in the food item. 
If the program determines that the number of calories from fat is greater 
than the number of calories in the food item, 
it should display an error message indicating that the input is invalid.*/
public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fat grams:");
		int fatGrams=sc.nextInt();
		int fatCalories=fatGrams*9;
		System.out.println("Enter total calories:");
		int totalCalories=sc.nextInt();
		if (totalCalories<fatCalories) System.out.println("input is invalid!");
		else if (totalCalories>=fatCalories) {
			double fatCalPercentage=fatCalories*100/totalCalories;
			if (fatCalPercentage<30) System.out.println("The food is low in fat.");
		}


	}

}
