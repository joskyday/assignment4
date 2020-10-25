package assignment4;

public class Question2 {

	public static void main(String[] args) {
		double income=1_300_000_000;
		double tax=0;

		if (income<=150_000_000) tax=income*0.25;
 			else if (income<=300_000_000) tax=150_000_000*0.25+(income-150_000_000)*0.3;
 			else if (income<=600_000_000) tax=150_000_000*0.25+150_000_000*0.3+(income-300_000_000)*0.35;
 			else if(income<=1_200_000_000) tax=150_000_000*0.25+150_000_000*0.3+300_000_000*0.35+(income-600_000_000)*0.4;
 			else if(income>1_200_000_000) tax=150_000_000*0.25+150_000_000*0.3+300_000_000*0.35+600_000_000*0.4+(income-1_200_000_000)*0.5;
 		System.out.printf("tax is %10.0f" , tax);
	}

}
