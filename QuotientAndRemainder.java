package basicjavaprogramming;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Divident :");
	int divident = sc.nextInt();
	System.out.println("Enter the Divisor :");
	int divisor = sc.nextInt();
	float que = divident / divisor;
	int rem = divident % divisor;
	System.out.println("Quotient = "+que);
	System.out.println("Remainder = "+rem);
	}
}
