package basicjavaprogramming;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Nth Harmonic number :");
		int n = sc.nextInt();	
		System.out.println("The Nth Harmonic value :" +Harmonic(n));
	}
	static double Harmonic(int n) {
		float h1 = 1;
		for(int i=2;i<=n;i++) {
			h1 += (float)1/i;
		}
		return h1;	
	}
}
