package Selenium;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args)
	{
		int i,n,fact=1;
		System.out.println("Enter the factorial number");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(i=5;i>=1;--i)
		{
		  fact = fact*i;
		}
		System.out.println(fact);
	}

}
