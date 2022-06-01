package basicjavaprogramming;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 1st Number : ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int y = sc.nextInt();
		System.out.println("Before Swaping 1st Number = "+x+ " and 2nd Number = "+y);
		Swap(x,y);
	}
	static void Swap(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swaping 1st Number = "+x+ " and 2nd Number = "+y);
	}
}
