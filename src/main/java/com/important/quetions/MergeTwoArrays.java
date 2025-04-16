package com.important.quetions;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int [] arr1= {1,2,3};
		int [] arr2= {4,5,6};
		int [] mergeCopy= new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, mergeCopy, 0, arr1.length);
		System.arraycopy(arr2, 0, mergeCopy, arr1.length, arr2.length);
		System.out.println(Arrays.toString(mergeCopy));
		
		int [] res =IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
		System.out.println(Arrays.toString(res));
	}
	
	
	
}
