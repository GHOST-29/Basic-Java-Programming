package basicjavaprogramming;
import java.util.*;
public class FlipCoinPercentage {
	public static void main(String[] args) {
		Scanner coinFlip = new Scanner (System.in);
		System.out.println("Enter a number to Flip a Coin :");
		int a= coinFlip.nextInt();
		int tail=0;
		for(int i=1;i<=a;i++) {
			if(Math.random()<0.5) 
			{
				tail++;}
			}
		double t=tail*100/a;
		double h=100-t;
		System.out.println("Percentage of Tails is "+t+"% and Heads is "+h+"%");
		}
	}
