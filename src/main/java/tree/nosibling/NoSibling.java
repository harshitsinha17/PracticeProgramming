package tree.nosibling;

import java.util.Scanner;

class NodeOfTree {
    int data;
    NodeOfTree left;
    NodeOfTree right;
    
    public NodeOfTree(int data){
    	this.data = data;
    }
}

public class NoSibling {
	
		static int level = -1;
	
	
		public static int findHeight(NodeOfTree root) {
		
		int height = 0;
		
		if(root == null) {
			return -1;
		}
		else {
			return 1+ Math.max(findHeight(root.left), findHeight(root.right));
		}
		//return height;
	}
	
	
	public static void findNoSibling(NodeOfTree root) {
		
		
		if(root == null) {
			return;
		}
		
		//System.out.print("Root is "+root.data+"  ");
		
		if(root.left == null && root.right != null) {
			System.out.println(root.data);
		}
		
		else if(root.right == null && root.left != null) {
			System.out.println(root.data);
		}
		
		
			findNoSibling(root.left);
			findNoSibling(root.right);
		
		
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
		// TODO Auto-generated method stub
		

		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        NodeOfTree root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        
        findNoSibling(root);


	}

}
