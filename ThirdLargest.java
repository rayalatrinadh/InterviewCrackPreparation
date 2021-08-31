package com.javaDeveloper.trinadh;

import java.util.Scanner;

public class ThirdLargest {

	public static void main(String[] args) {
		Scanner sc = null;
		int n = 0;
		int arr[];
		try
		{
			sc = new Scanner(System.in);
			System.out.println("Enter the length of an array");
			n = sc.nextInt();
			System.out.println("Enter Array Eleements...!");
			arr = new int[n];
			for(int i =0 ; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			System.out.println("third largest number is : "+thidLargest(arr,n));
		}catch(Exception e)
		{
			System.out.println(e);
		}finally
		{
			sc.close();
		}

	}

	private static int thidLargest(int[] arr, int n) {
	   int result = 0;
	   
	   if(n <= 2)
	   {
		   return -1;
	   }
	   else
	   {
		   for(int i = 0; i < n; i++)
		   {
			   for(int j = i; j< n; j++)
			   {
				   if(arr[i] > arr[j])
				   {
					   int temp = arr[i];
					   arr[i] = arr[j];
					   arr[j] = temp;
				   }
			   }
		   }
		   
			/*
			 * for(int value : arr) System.out.println(value);
			 */
		   result = arr[n-3];
			return result;
	   }
	}

}
