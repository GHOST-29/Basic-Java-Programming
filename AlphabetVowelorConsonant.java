package basicjavaprogramming;

import java.util.Scanner;

public class AlphabetVowelorConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Alphabet to check for Vowel or Consonant : ");
		char a = sc.next().charAt(0);
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U')
				{
            System.out.println("Entered Alphabet "+a+" is vowel");
		}
        else
        {
            System.out.println("Entered Alphabet "+a+" is consonant");
		}
	}
}
