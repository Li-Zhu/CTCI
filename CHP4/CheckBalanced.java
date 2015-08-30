

class CheckBalanced {

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

		n2.left = n4;
		n2.right = n5;

		n3.left = n6;
		n3.right = n7;

		n4.left = n8;
		n4.right = n9;

		n5.left = n10;
		n5.right = n11;

		n6.left = n12;
		n6.right = n13;

		n7.left = n14;
		n14.right = n15;

		System.out.println(checkBal(n1));
	}


	private static int checkHeight(TreeNode root){
		if (root == null ) return 0;

		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1) return -1;

		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1) return -1;

		int heightDiff = leftHeight - rightHeight;
		if(Math.abs(heightDiff) > 1 ){
			return -1;
		}
		else return Math.max(leftHeight,rightHeight) +1;

	}

	public static boolean checkBal(TreeNode root){
		if(checkHeight(root) == -1) return false;
		else return true;
	}

	
	/*
	private static int getHeight(TreeNode root){
		if(root == null) return 0;
		return Math.max(getHight(root.left),getHight(root.right))+1;
	}

	public static boolean checkBal(TreeNode root){
		if(root == null) return true;

		int hightDiff =getHight(root.left) -  getHight(root.right);

		if(Math.abs(hightDiff)>1) return false;
		else{
			return checkBal(root.left) && checkBal(root.right);
		}

	}

	*/








}