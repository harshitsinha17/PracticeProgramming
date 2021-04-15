package algoDS;

public class LinkedListNode {
        char data;
        LinkedListNode next;
        
        LinkedListNode()
        {
            data = 0;
            next = null;
        }
        
        LinkedListNode(char d)
        {
            data = d;
            next = null;
        }
        
        public LinkedListNode reverseList(LinkedListNode head) {
        	
        	LinkedListNode current = head;
        	LinkedListNode prev = null;
        	LinkedListNode next = null;
        	
        	while(current!=null) {
        		next = current.next;
        		current.next = prev;
        		prev= current;
        		current = next;
        	}
        	head = prev;
        	
        	return head;
        }
        
        public void ifPalindrome(LinkedListNode head, LinkedListNode middle) {
        	
        	while(middle!=null) {
        		if(middle.data != head.data) {
        			System.out.println("Not palindrome");
        			break;
        		}
        		head= head.next;
        		middle = middle.next;
        	}
        	System.out.println("Yes its a palindrome");
        }
        
        public LinkedListNode getMiddle(LinkedListNode head) {
        	
        	LinkedListNode slow = head;
        	LinkedListNode faster = head;
        	
        	while(faster.next !=null && faster.next.next != null) {
        		faster = faster.next.next;
        		slow= slow.next;
        	}
        	
        	System.out.println(slow.data);
        	
        	
        	return slow;
        }
        
        public LinkedListNode push(char new_data, LinkedListNode head)
        {
            /* 1 & 2: Allocate the LinkedListNode &
                      Put in the data*/
        	
        	
            LinkedListNode new_node = new LinkedListNode(new_data);
            //System.out.println(new_node.data);
     
            if(head == null) {
            	head = new_node;
            	new_node.next = null;
        	}

            LinkedListNode temp = head;
            while(temp.next!=null) {
            	temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = null;
            
            return head;
            
        }
     
        /* This function prints contents of linked list
           starting from  the given LinkedListNode */
        public void printList(LinkedListNode head)
        {
            LinkedListNode tnode = head;
            while (tnode != null)
            {
                System.out.print(tnode.data+"->");
                tnode = tnode.next;
            }
            System.out.println("NULL");
        }
  
}
