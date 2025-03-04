package interviewQ;

import java.util.Arrays;

public class FindTheNthIndex {

	public static void main(String[] args) {
		int [] arr= {5,6,3,6,7,235,88};
		findNthLargestNumber(arr,2);
	}
	//Write a Java program that finds the nth largest number in an array of integers. 
	//The program should take an array of integers and an integer n as input and 
	//return the nth largest number. Implement this in an efficient manner, 
	// considering performance for large datasets.
	
	public static void findNthLargestNumber(int [] arr, int index)
	{
		if(index>arr.length&& arr.length==0) // checkint the size if idex size bigger thn we can return it as false
		{
			return;
		}
		
		int temp =0; 
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		// if you need to start frm 1 means we make shift the insdex 1 to last and make first index as 0
		//
	  System.out.println(index +" index highest value is "+arr[index]); // geting value
	  System.out.println(Arrays.toString(arr));// printing array
		
		// Sort the array
		
	
//		Arrays.sort(arr); //sorting the array
//		
//		//reverse the array
//		int [] newArray = new int[arr.length];
//		for(int i=arr.length-1; i>=0; i--)
//		{
//			newArray[i]=arr[i];
//		}
//		
//		System.out.println(arr[index]); // it will give the output as per the index given
		
		
		//Example  array is given {3,4,61,7,9}
		//Once you sort the array 
		// sorted array o/p = {3,4,7,9,51}
		//  Array size 5  we can give index value between 0 to 4 only
		//if you any other value it throw ArrayIndexOutBondException
		
		
		// example the index/nth number has given
		// it will fetch from the array given index value
		
		// arr[index]= 3 if index is 0 or 
		
	  //------------------------------------------------ 
		
		// Making array in decendin order
	 // Other way can do by using two for loop sort the array add the value in descending order
		
		
		
		
		
		
	}
}
