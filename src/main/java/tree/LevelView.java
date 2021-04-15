package tree;

import java.util.Scanner;

 class NodeOfTree {
    int data;
    NodeOfTree left;
    NodeOfTree right;
    
    public NodeOfTree(int data){
    	this.data = data;
    }
}

public class LevelView {
	
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
	
	public static void printGivenLevel(NodeOfTree root, int level){
		if(root == null) {
			return;
		}
		if(level == 1) {
			System.out.println(root.data);
		}
		if(level>1) {
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}
	}
	
	public static void printLevelOrder(NodeOfTree root) {
		int height = findHeight(root);
		System.out.println("Height "+height);
		
		for(int i = 1;i<=height+1;i++) {
			printGivenLevel(root,i);
		}
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
        
        printLevelOrder(root);
        

	}

}
