package com.learn.executorService;

import java.util.concurrent.*;

public class ScheduledThreadPoolExample {
	
    public static void main(String[] args) {
    	
    	
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable task = () -> System.out.println("Executing Task at: " + System.currentTimeMillis());

        // Run the task every 3 seconds, starting after an initial delay of 1 second
        scheduler.scheduleAtFixedRate(task, 1, 3, TimeUnit.SECONDS);
    }
}
