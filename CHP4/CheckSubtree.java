class CheckSubtree {

	// Alternative Approach 
	// memory O(log(n)+log(m))
	// runtime of worse case O(nm), but  
	public static boolean check (TreeNode n, TreeNode m){
		if(m == null) return true;
		return subTree(n,m);
	}

	private static boolean subTree(TreeNode n, TreeNode m){
		if(n == null) return false;

		else if (n.value == m.value && match(n,m)){
			return true;
		}
		return (subTree(n.left , m) || subTree(n.right , m));
	}

	private static boolean match(TreeNode n, TreeNode m){
		if (n == null && m == null) return true; // nothing left in the sub tree;

		else if (n == null || m ==null) return false; // when big tree empty, small tree still not found.

		else if (n.value != m.value) return false;

		else {
			return (match(n.left,m.left) && match(n.right,m.right));
		}
	}


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

		n1.left = n2;
		n1.right = n3;
		n2.parent =n1;
		n3.parent =n1;

		n2.left = n4;
		n2.right = n5;
		n4.parent =n2;
		n5.parent =n2;

		n3.left = n6;
		n3.right = n7;
		n6.parent =n3;
		n7.parent =n3;

		n4.left = n8;
		n4.right = n9;
		n8.parent =n4;
		n9.parent =n4;

		n5.left = n10;
		n5.right = n11;
		n10.parent =n5;
		n11.parent =n5;

		n6.left = n12;
		n6.right = n13;
		n12.parent =n6;
		n13.parent =n6;

		//n7.left = n14;
		n14.right = n15;

		System.out.println (check(n1,n14));
	}



}