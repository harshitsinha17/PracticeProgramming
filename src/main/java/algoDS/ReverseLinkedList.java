package algoDS;
import java.util.*;

class Node {
	 
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class ReverseLinkedList {

	Node head;
	
	static Node reverseTillK(Node head, int k) {
		
		if(head == null) {
			return null;
		}
		Node prev = null;
		Node current = head;
		Node next = null;
		int count = 0;
		while(current != null && count <k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
			
		}
		if(next!=null) {
			head.next = reverseTillK(next, k);
		}
		
		
		return prev;
	}
	
	static Node reverse(Node head) {
		
		if(head == null) {
			return null;
		}
		
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
		return head;
	}
	
	static Node reversetillN(Node head) {
		
		if(head == null) {
			return null;
		}
		
		Node current = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		
		while(current != null && count<3)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		//prev.next = next;
		
		System.out.println("Now head "+head.data);
		System.out.println("Now next "+next.data);
		System.out.println("Node prev "+prev.data);
		Node temp = next;
		head.next = temp;
		/*
		current  = head;
		while(current.next!=null) {
			System.out.println(current.data);
			current = current.next;
		}
		current.next = temp;
		*/
		head = prev;
		return head;
	}
	
	
	
		static Node reversetillNButNotHeadNode(Node head) {
		
		if(head == null) {
			return null;
		}
		
		Node current = head.next;
		Node prev = null;
		Node next = null;
		int count = 0;
		
		while(current != null && count<3)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		//prev.next = next;
		
		System.out.println("Now head "+head.data);
		System.out.println("Now next "+next.data);
		System.out.println("Node prev "+prev.data);
		
		
		head.next = prev;
		
		current  = head;
		while(current.next!=null) {
			System.out.println(current.data);
			current = current.next;
		}
		current.next = next;
		
		//head = prev;
		return head;
	}
	
	
	
	
	static void printList(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ReverseLinkedList list = new ReverseLinkedList();
	
	        list.head = new Node(85);
	        list.head.next = new Node(15);
	        list.head.next.next = new Node(4);
	        list.head.next.next.next = new Node(20);
	        list.head.next.next.next.next = new Node(23);
	 
	        System.out.println("Given Linked list");
	        list.printList(list.head);
	        list.head = reverse(list.head);
	        System.out.println("");
	        System.out.println("Reversed linked list ");
	        list.printList(list.head);

	        System.out.println("Reversed linked list till N nodes");
	        list.head = reversetillN(list.head);
	        System.out.println("=============Printing list==========");
	        list.printList(list.head);
	        

	        System.out.println("Reversed linked list till N nodes starting from second node");
	        list.head = reversetillNButNotHeadNode(list.head);
	        System.out.println("=============Printing list for reverse from second node==========");
	        list.printList(list.head);
	}

}
