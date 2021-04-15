package rightview;

import java.util.Scanner;



class NodeOfTree {
    int data;
    NodeOfTree left;
    NodeOfTree right;
    
    public NodeOfTree(int data){
    	this.data = data;
    }
}

public class RightView {
	
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
	
	
	
	private static void printRightView(NodeOfTree root, int current) {
		if(root == null) {
			return;
		}
		
		if(current>level) {
			System.out.println(root.data);
			level = current;
		}
		printRightView(root.right, current+1);
		printRightView(root.left, current+1);
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
        
        printRightView(root,0);


	}

}
