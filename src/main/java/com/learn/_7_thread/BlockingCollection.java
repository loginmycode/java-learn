package com.learn._7_thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingCollection {

	
	public static void testBlockingLinkedHashQueue()
	{
		BlockingDeque<String> queue = new LinkedBlockingDeque<>();
		
		try
		{
		queue.put("Pencil");
		queue.put("Rubber");
		queue.put("Notbook");
		}
		catch(Exception e)
		{
			
		}
		
	}
}
