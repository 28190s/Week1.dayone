package Selenium;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args)
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		for(int i = 0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("the duplicate leements are "+arr[i]);
				}
			}
		}
	}

}
