class Successor{
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
		n4.parent = n8;
		n12.parent = n8;

		n4.left = n2;
		n4.right = n6;
		n2.parent = n4;
		n6.parent = n4;

		n12.left = n10;
		n12.right = n14;
		n10.parent = n12;
		n14.parent = n12;

		TreeNode succ = getSuccessor(n4);
		System.out.println(succ.value);

	}
	// Two main situations:
	// a. if right child is NOT null, the successor of the node is the minmium node of the n.right.
	// b. if right child is null, the successor of the node is the first ancestor who is left child of its parent.

	public static TreeNode getSuccessor(TreeNode n){
		if (n == null) return null;

		if (n.right != null) return mostLeft(n.right); // a

		return firstLeftChild(n); // b
	}

	public static TreeNode mostLeft(TreeNode n){
		while(n.left!=null){
			n=n.left;
		}
		return n;
	}

	public static TreeNode firstLeftChild(TreeNode n){
		TreeNode parent = n.parent;
		while (parent != null && parent.left != n){
			n= parent;
			parent = n.parent;
		}
		return parent;

	}
}