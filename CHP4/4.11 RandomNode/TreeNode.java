import java.util.Random;

public class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public int size = 0;

	public TreeNode(int d) {
		data = d;
		size =1;
	}

	public void insertInOrder(int d){
		if(d < data){
			if(left == null){
				left = new TreeNode(d);
			}
			else {
				left.insertInOrder(d);
			}
		}
		else {
			if(right == null){
				right = new TreeNode(d);
			}
			else {
				right.insertInOrder(d);
			}
		}
		size ++;
	}

	public int size (){
		return size;
	}

	public TreeNode find(int d){
		if(d == data) {
			return this;
		}
		else if(d <= data) {
			if(left == null) return null;
			return left.find(d);
		}
		else if (d > data) {
			if(right == null) return null;
			return right.find(d);
		}
		return  null;
	}

	public TreeNode getNthNode (int n) {
		int leftSize =0;
		if (left != null) leftSize=left.size();
		if (n < leftSize) return left.getNthNode(n);
		if (n == leftSize) return this;
		else return right.getNthNode(n-(leftSize+1)); // Skipping over leftSize + 1 nodes, so subtract them.
	}

}