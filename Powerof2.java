package basicjavaprogramming;

import java.util.Scanner;

public class Powerof2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number between 0 to 31 = ");
		int n = sc.nextInt();
		int i = 0;
		if(n<=31) {
		while (i<=n){
			int x = (int) Math.pow(2, i);
			System.out.println("Power of 2^" +i+ " = "+x);
			
			i++;
			}
		}
		else {
			System.out.println("Invalid Number, Please enter Number between 0 to 31");
			}
		}
	}

