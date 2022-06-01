package basicjavaprogramming;
import java.util.*;
public class LeapYear {
public static void main(String[] args) {
	Scanner leapYear = new Scanner (System.in);
	System.out.println("Enter a 4 Digit Number :");
	int year= leapYear.nextInt();
	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
	{
	System.out.println(year+" is Leap Year");
	}
	else
	{System.out.println(year+" is not a Leap Year");
	}
}
}
