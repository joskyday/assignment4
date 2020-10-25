package assignment4;
/*Question-4

Telephone Bill
Write a Java program to calculate the monthly telephone bills as per the following rule: 
Minimum $200 for up to 100 calls. 
Plus $0.60 per call for the next 50 calls. 
Plus $0.50 per call for the next 50 calls. 
Plus $0.40 per call for any call beyond 200 calls.*/
public class Question4 {

	public static void main(String[] args) {
		int calls=250;
		double bill=0;
		if (calls<=100) bill=200;
		else if(calls>100 &&calls<=150) 	bill=200+(calls-100)*0.6;
		else if(calls>150 &&calls<=200) 	bill=200+50*0.6+(calls-150)*0.5;
		else if(calls>200) 				bill=200+50*0.6+50*0.5+(calls-200)*0.4;
		System.out.println("bill is "+bill);

	}

}
