package com.important.quetions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class ReturnIndex {

	public static void main(String[] args) {
		
		int [] arr = {1,3,4,5,6};
		int [] indexNumbers =findIndexs(arr,8);
		System.out.println(Arrays.toString(indexNumbers));
	}
	public static int [] findIndexs(int [] arr, int target)
	{
		Map<Integer, Integer> map = new HashMap<>();
		int res=0;
		for(int i=0; i<arr.length; i++)
		{
			res=target-arr[i];
			if(map.containsKey(res))
			{
				return new int[]{map.get(res), i};
			}
			
			map.put(arr[i], i);
		}
		return new int[] {};
		
	}
}
