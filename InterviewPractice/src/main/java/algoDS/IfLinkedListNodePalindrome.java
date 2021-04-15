package algoDS;

import algoDS.*;

public class IfLinkedListNodePalindrome {


 
    public static void main(String [] args)
    {
        LinkedListNode llist = new LinkedListNode();
        LinkedListNode head = null;
        //for (int i=73; i>64; --i)
        //{
            head = llist.push((char)71,head);
            head = llist.push((char)72,head);
            head = llist.push((char)73,head);
            head = llist.push((char)72,head);
            head = llist.push((char)70,head);
            
            
        //}
        llist.printList(head);
        LinkedListNode middle = llist.getMiddle(head);
        
        middle = llist.reverseList(middle);
        
        llist.printList(head);
        llist.printList(middle);
        
        System.out.println("Head "+head.data);
        System.out.println("Middle "+middle.data);
        
        
        llist.ifPalindrome(head,middle);
    }
}
