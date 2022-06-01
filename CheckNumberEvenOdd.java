package basicjavaprogramming;

import java.util.Scanner;

public class CheckNumberEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number to check for Even or Odd");
		int x = sc.nextInt();
		if (x%2==0) {
			System.out.println("Number "+x+" is Even Number");
		}
		else {
			System.out.println("Number "+x+" is Odd Number");	
			}
	}
}
