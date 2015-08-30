class ValidateBST{

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
/*
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
*/

		n8.left = n4;
		n8.right = n12;

		n4.left = n2;
		n4.right = n6;

		n12.left = n10;
		n12.right = n14;

		n14.right = n11;





		System.out.println(isValidBST(n8));
	}


	public static boolean isValidBST(TreeNode root) {
    	return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);    
	} 


	public static boolean isValidBST(TreeNode p, double min, double max){
    	if(p==null) 
       		return true;
 
    	if(p.value < min || p.value >= max)
       		return false;
    	return isValidBST(p.left, min, p.value) && isValidBST(p.right, p.value, max);
    }


}