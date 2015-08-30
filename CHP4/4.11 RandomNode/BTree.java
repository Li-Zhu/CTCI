import java.util.Random;


public class BTree {
	TreeNode root = null;

	public int size (){
		if (root == null) return 0;
		return root.size();
	}

	public TreeNode getRandomNode() {
		if(root ==null) return null;

		Random random = new Random ();

		int n = random.nextInt(root.size);

		return root.getNthNode(n);
	}

	public void insertInOrder (int value) {
		if (root == null) {
			root = new TreeNode(value);
		}

		else {
			root.insertInOrder(value);
		}
	}
}