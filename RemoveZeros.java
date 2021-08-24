package com.javaDeveloper.trinadh;

import java.util.Scanner;

public class RemoveZeros {
	public static void main(String args[]) {
		Scanner userInput = null;
		try
		{
			userInput = new Scanner(System.in);
			System.out.println("Enter The Number");
			int N = userInput.nextInt();
			System.out.println( "Result : "+ convertFive(N));
			
		}catch(Exception e)
		{
			System.err.print(e);
		}finally
		{
			userInput.close();
		}
	}
    public static Integer convertFive(int N)
    {
    	int result = 0;
        int count = 0;
        int arr[] = new int[50];
    	while(N >= 10)
    	{
    		int singleDigit= N % 10;
    		N /= 10;
    		if(singleDigit == 0)
    			arr[count++] = 5;
    		else
    			arr[count++] = singleDigit;	
    			
    	}
    	arr[count] = N;
    	
    	result = arr[count];
    	for(int i = count-1; i >=0; i--)
    	{
    		result *= 10;
    		result += arr[i];
    	}
    	return result;
    }
}
