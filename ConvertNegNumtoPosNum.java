package Selenium;

public class ConvertNegNumtoPosNum {
	
	public static void main(String[] args)
	{
		int[] number = {-40,35};
		for(int i=0; i< number.length;i++)
		{
		if(number[i] < 0)
		{
			System.out.println("The number is negative number" + number[i]);
			int Convnum = -((number[i]));
			System.out.println("The number is converted into positive number"+ Convnum);
		}
		else if(number[i] > 0)
		{
			System.out.println("The number is positive number");
		}
		
		else
		{
			System.out.println("The number is neither positive nor negative");
		}
		}
	}

}
