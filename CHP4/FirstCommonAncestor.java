class FirstCommonAncestor{
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

		n7.left = n14;
		n14.right = n15;
		n14.parent =n7;
		n15.parent =n14;

		TreeNode a = firstAncestor(n8,n12);
		TreeNode b = betterFirstAncestor(n1,n8,n15);
		System.out.println(b.value);
	}


// Soultion 1

	public static TreeNode firstAncestor(TreeNode n1, TreeNode n2){  // runtime will be O(d1*d2)/ in BT will be O((log2)^2).
		TreeNode p1 = n1.parent;
		TreeNode p2 = n2.parent;
		TreeNode temp = n2.parent;
		while(p1 != null){
			while(p2 != null){
				if(p1 == p2) return p1;
				p2=p2.parent;
			}
			p2=temp;
			p1=p1.parent;
		}
		return null;
	}



// Soultion 2
	public static TreeNode betterFirstAncestor(TreeNode root, TreeNode n1, TreeNode n2){
		//check if either node is not in the tree, or if one cover other
		if(!check(root,n1)|| !check(root,n2)) return null;
		else if(check(n1,n2)) return n1;
		else if(check(n2,n1)) return n2;

		//Traverse upwards until find a node that cover q,
		TreeNode unvisited = unVisited(n1);
		TreeNode p = n1.parent;
		while(!check(unvisited,n2)){
			unvisited = unVisited(p);
			p=p.parent;
		}
		return p;

	}

	public static boolean check(TreeNode n1, TreeNode n2){
		if(n1 == null) return false;
		if(n1 == n2) return true;
		return check(n1.right,n2) || check(n1.left, n2);

	}

	public static TreeNode unVisited(TreeNode n){
		if(n == null || n.parent == null){
			return null;
		}
		TreeNode parent = n.parent;

		return parent.left == n? parent.right : parent.left;
	}
}