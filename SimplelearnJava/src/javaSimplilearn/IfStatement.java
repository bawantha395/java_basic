package javaSimplilearn;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		
//		int num =-100;
//		if(num>=0) {
//			System.out.println("Number is Positive");
//		}
//		System.out.println("If condition is terminated");
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("enter num: ");
			int num = sc.nextInt();
			if(num >=0) {
				System.out.println("number is positive");
			}
			else {
				System.out.println("number is negative");
			
			}
		}
			
			
			
	}

}
