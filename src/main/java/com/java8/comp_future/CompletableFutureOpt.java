package com.java8.comp_future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureOpt {

	public static void main(String[] args) {
	
		CompletableFuture<Integer> comp = CompletableFuture.supplyAsync(
			()-> "42")
			.thenApply(Integer::parseInt)
			.thenApply(n-> n*3);
		
		System.out.println(comp.join());
	}
	
		
}
