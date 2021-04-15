package tree;
import java.util.Scanner;

import tree.TreeNode;

public class CousinofNode {

	
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

	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        NodeOfTree root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }

	}
}
