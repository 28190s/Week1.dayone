package Selenium;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		
		String original,reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string you want to check");
		original = s.nextLine();
		int n = original.length();
		for(int i=n-1;i>=0;i--)
		{
		 reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("The String is palindrome");
		}
		else
		{
			System.out.println("The String is not palindrome");
		}
	}

}
