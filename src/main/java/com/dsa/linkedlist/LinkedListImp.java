package com.dsa.linkedlist;

public class LinkedListImp {

	private Node head;
	public void add(int data)
	{
		Node newNode = new Node(data);
			if(head==null)
			{
				head=newNode;
				return;
			}
			
			Node temp=head;
		
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
	}
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
		
		
				
	}
	public void show()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println("null");
	}
}
