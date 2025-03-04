package com.dsa.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedListImp linkedList= new LinkedListImp();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.show();
		linkedList.addFirst(0);
		linkedList.show();
		
		
	}
}
