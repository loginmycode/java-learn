package com.learn.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		
		ExecutorService executer = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<5; i++)
		{
			int taskId=i;
			executer.execute(()->{
				System.out.println(Thread.currentThread().getName()+ " executing Thread " +taskId);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		executer.shutdown(); // Shut down the executor after all tasks are done
	}
}
