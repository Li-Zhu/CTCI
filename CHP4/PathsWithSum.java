
class PathsWithSum {


	public static void findPaths(TreeNode root, int sum){
		findPaths(root, sum, new int[getHeight(root)], 0);
	}

	private static void findPaths(TreeNode n, int sum, int[] path, int level){
		if (n == null) return;

		path[level] = n.value;
		int s = 0;
		for (int i = level; i >= 0; i--) {
			s += path[i];
			if (s == sum){
				print(path, i, level);
			}
		}
		findPaths (n.left, sum, path, level +1);
		findPaths (n.right, sum, path, level +1);
	}

	private static int getHeight (TreeNode n) {
		if (n == null) return 0;
		return Math.max(getHeight(n.left),getHeight(n.right)) +1;
	}

	private static void print(int[] path, int s, int e) {
		for (int i = s; i <= e; i++) {
			System.out.println(path[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[]args) {
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
        findPaths(n1, 19);
	}
}