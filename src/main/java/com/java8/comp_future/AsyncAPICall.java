package com.java8.comp_future;

import java.util.concurrent.CompletableFuture;

public class AsyncAPICall {
	    public static void main(String[] args) {
	        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> fetchUserData());
	        CompletableFuture<String> orderFuture = CompletableFuture.supplyAsync(() -> fetchOrderData());

	        CompletableFuture<String> result = userFuture.thenCombine(orderFuture, (user, order) -> 
	            "User: " + user + ", Order: " + order);

	        System.out.println(result.join());
	    }

	    static String fetchUserData() {
	        sleep(1000);
	        return "John Doe";
	    }

	    static String fetchOrderData() {
	        sleep(1500);
	        return "Order #123";
	    }

	    static void sleep(int ms) {
	        try { Thread.sleep(ms); } catch (InterruptedException e) { e.printStackTrace(); }
	    }
	}


