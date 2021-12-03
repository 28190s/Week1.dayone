package Selenium;

public class MissingElementInArray {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,7,6,8};
		int sum = 0;
		sum = (arr.length+1)*(arr.length+2)/2;
		for (int i=0;i<arr.length;i++)
		{
			sum = sum-arr[i];
		}
		System.out.println("Missing Element is "+ sum);
	}
}



