import java.util.*;

class BSTpaths{
	public static void main(String[] args){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		TreeNode n9 = new TreeNode(9);
		TreeNode n10 = new TreeNode(10);
		TreeNode n11 = new TreeNode(11);
		TreeNode n12 = new TreeNode(12);
		TreeNode n13 = new TreeNode(13);
		TreeNode n14 = new TreeNode(14);
		TreeNode n15 = new TreeNode(15);
		TreeNode n16 = new TreeNode(16);


		n8.left = n4;
		n8.right = n12;

		n4.left = n2;
		n4.right = n6;

		n12.left = n10;
		n12.right = n14;

		 n14.right = n15;
		 n14.left = n13;
		 n10.left = n9;
		 n10.right = n11;



		printAllPathsToLeaf(n8,new int[1000],0);
	}

	public static void printAllPathsToLeaf(TreeNode node, int[] path, int len) {
     if ( node == null )
         return;

     // storing data in array
     path[len] = node.data;
     len++;

     if(node.left == null && node.right == null) {
         // leaf node is reached
         printArray(path,len);
         return;
     }

     printAllPathsToLeaf(node.left, path, len);
     printAllPathsToLeaf(node.right, path, len);
 	}
 	public static void  printArray(int[] path,int len){

	  	for (int i = 0; i < len; i++) {
	  		System.out.print(" "+path[i]);
		}
	  	System.out.println();
	 }



}