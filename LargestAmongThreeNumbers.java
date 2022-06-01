package basicjavaprogramming;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 1st Number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int b = sc.nextInt();
		System.out.println("Enter 3rd Number :");
		int c = sc.nextInt();
		Largest(a,b,c);
	}
	static void Largest (int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("The Largest Number is : "+a);}
		else if(b>a && b>c){
			System.out.println("The Largest Number is : "+b);}
		else {
			System.out.println("The Largest Number is : "+c);
				}		
			}
	static void Largest () {
		int a;
		int b;
		int c;
		
	}
}