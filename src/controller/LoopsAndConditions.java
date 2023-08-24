package controller;

import utility.Helper;

public class LoopsAndConditions {

	public static void main(String[] args) {
		
		int numberOfInteger = Helper.readInt("an integer number");
		System.out.println(" ");
		
		evenNumbers(numberOfInteger);
		System.out.println(" ");
		oddNumbers(numberOfInteger);
		System.out.println(" ");
		countEvenNumbers(numberOfInteger);
		countOddNumbers(numberOfInteger);
		System.out.println(" ");
		sumOfEvenNumbers(numberOfInteger);
		System.out.println(" ");
		productOfOddNumbers(numberOfInteger);
	}
	
	public static void evenNumbers(int num){
		
		int even = 0;
		
		System.out.print("EVEN Numbers: ");
		
		while(even <= num){
			
			if(even%2 == 0 && even != 0){
				System.out.print(even + " ");
			}
			even+=1;
		}
	}
	
	public static void oddNumbers(int num){
		
		int odd = 0;
		
		System.out.print("ODD Numbers: ");
		
		do{
			if(odd%2 != 0 && odd !=0){
				System.out.print(odd + " ");
			}
			odd+=1;
		}while(odd <= num);
	}
	
	public static void countEvenNumbers(int num){
		
		int numberOfEven = 0;
		
		for(int counter = 2; counter <= num; counter++){
			if(counter%2 == 0){
				numberOfEven++;
			}
		}
		System.out.println("Count of EVEN Numbers: " + numberOfEven);
	}
	
	public static void countOddNumbers(int num){
		
		int numberOfOdd = 0;
		
		for(int counter = 1; counter <= num; counter++){
			if(counter%2 == 1){
				numberOfOdd++;
			}
		}
		System.out.println("Count of ODD Numbers: " + numberOfOdd);
		
	}
	
	public static void sumOfEvenNumbers(int num){
		
		int sumOfEven = 0;
		int even = 0;
		
		while(even <= num){
			
			if(even%2 == 0 && even != 0){
				sumOfEven = sumOfEven + even;
			}
			even+=1;
		}
		
		System.out.println("Summation Value of ALL EVEN numbers: " + sumOfEven);
	}
	
	public static void productOfOddNumbers(int num){
		
		int productOfOdd = 1;
		int odd = 0;
		
		do{
			if(odd%2 != 0 && odd != 0){
				productOfOdd = productOfOdd * odd;
			}
			odd+=1;
		}while(odd <= num);
		
		System.out.println("Product of ALL ODD numbers: " + productOfOdd);
	}

}
