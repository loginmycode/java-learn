package com.learn.checked.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundEx {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\Users\\Giri\\Downloads\\New folder\\ab.txt");
		
		/*
		 * FileReader fr = new FileReader(file); int c =fr.read();
		 */
		//System.out.println((char)(c));
		
		BufferedReader br;
		
		try
		{
			br= new BufferedReader(new FileReader(file));
		String str = br.readLine();
		System.out.println(str);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("process copleted");
			
		}
		
	}
}
