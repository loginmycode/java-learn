package com.learn.features.java8.lambda;

public class UseRunnable {

	public static void main(String[] args) {
		
		Runnable ruunable =()->{
			
			for(int i=0; i<10; i++)
			{
				System.out.println("The value is "+i);
				
				try 
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		
		Thread thread = new Thread(ruunable);
		thread.start();
		
	
		
	}
	
}
