package tree;
import java.util.*;
import java.io.*;

class Node {
    NodeOfTree left;
    NodeOfTree right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LeftView {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
    	
	*/
	
	static int level = -1;
	
	
	public static boolean ifIdentical(NodeOfTree tree1, NodeOfTree tree2) {
		
		
		
		
		if(tree1 == null && tree2 == null) {
			return true;
		}
		
		
		if( (tree1 == null && tree2 !=null ) || (tree1 != null && tree2 ==null ) ) {
			return false;
		}
		
		if( (tree1.left == null && tree2.left !=null) || (tree1.right == null && tree2.right !=null) ) {
			return false;
		}
		

		if( (tree1.left != null && tree2.left == null) || (tree1.right != null && tree2.right ==null) ) {
			return false;
		}
		

		if(tree1.data == tree2.data) {
			boolean a = false;
			boolean b = false;
			if( (tree1.left==null && tree2.left == null) && tree2.right == null && tree1.right == null  ) {
				return true;
			}
			if(tree1.left != null && tree2.left != null) {
				if(tree1.left.data == tree2.left.data) {
					a = ifIdentical(tree1.left, tree2.left);
				}
			}
			if(tree1.right != null && tree2.right != null) {
				if(tree1.right.data == tree2.right.data) {
					b = ifIdentical(tree1.right, tree2.right);
				}
			}
			return a||b;
		}
		
		return true;
	}
	
	public static int findLevel(NodeOfTree root, NodeOfTree x, int current) {
		if(root==null) {
			return 0;
		}
		
		if(root.data ==x.data) {
			return current;
		}
		
		if(findLevel(root.right,x,current+1) >= findLevel(root.left,x,current+1)) {
			return findLevel(root.right,x,current+1);
		}
		else {
			return findLevel(root.left,x,current+1);
		}
		
		
	}
	
	public static int parent(NodeOfTree root, NodeOfTree a) {
		
		if(root ==null) {
			return -1;
		}
		
		if(root.left != null) {
		if(root.left.data == a.data) {
			System.out.println("Root "+root.data+" for "+a.data);
			return root.data;
		}
		}
		
		if(root.right != null) {
		if(root.right.data == a.data) {
			System.out.println("Root "+root.data+" for "+a.data);
			return root.data;
		}
		}
		
		if(parent(root.left,a) == -1) {
			return parent(root.right,a);
		}
		else {
			return parent(root.left,a);
		}
		
		
		
		
	}
	
	public static boolean cousinsLeaf(NodeOfTree root,  int level) {
		NodeOfTree a  = new NodeOfTree(1);
		NodeOfTree b = new NodeOfTree(6);
		
		if(root == null) {
			return false;
		}
		if(root.left == null && root.right == null) {
			return false;
		}
		
		if((root.left.data == a.data && root.right.data == b.data) ||  (root.left.data == b.data && root.right.data == a.data) ) {
			return false;
		}
		
		if(findLevel(root,a,level) == findLevel(root,b,level)) {
			System.out.println("Level is same");
			System.out.println("A parent "+parent(root,a));
			System.out.println("B parent "+parent(root,b));
			if(parent(root,a) != parent(root,b)) {
				
				return true;
			}
		}
		
		return false;
		
		
	}
	
	public static int sumOfLeaf(NodeOfTree root) {
		
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return root.data;
		}
		
		int count = sumOfLeaf(root.left)+sumOfLeaf(root.right);
		
		return count;
	}
	
	public static int heightOfTree(NodeOfTree root) {
		if(root== null) {
			return 1;
		}
		int lheight = heightOfTree(root.left);
		int rheight = heightOfTree(root.right);
		if(lheight>rheight) {
			return lheight +1;
		}
		else {
			return rheight+1;
		}
		
	}
	
	public static void levelOrder(NodeOfTree root, int current) {
		for(int i = 1;i<heightOfTree(root);i++) {
			printLevel(root, i);
		}
	}
	
	public static void printLevel(NodeOfTree root, int level) {
		
		if(root==  null) {
			return;
		}
		
		if(level == 1) {
			System.out.println(root.data);
		}
		else {
			printLevel(root.left, level-1);
			printLevel(root.right,level-1);
		}
	}
	
	public static void printLeft(NodeOfTree root, int current) {
      	// Write your code here.
        
		  if(root == null) {
			  return;
		  }
		
          if(current > level) {
        	  System.out.println(root.data);
        	  level = current;
        	  
          }
          
          printLeft(root.left,current+1);
          printLeft(root.right,current+1);
    	  
          
          
          
    }

	public static NodeOfTree insert(NodeOfTree root, int data) {
        if(root == null) {
            return new NodeOfTree(data);
        } else {
            NodeOfTree cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        NodeOfTree root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        //printLeft(root, 0);
        //levelOrder(root, 1);
        
        //int sum = sumOfLeaf(root);
        //System.out.println(sum);
        
        //System.out.println(cousinsLeaf(root, 0));
        
        
        
        
        System.out.println( ifIdentical(root,root) );
        
        //System.out.println(height);
    }	
}