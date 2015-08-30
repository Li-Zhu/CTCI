
import java.util.*;

public class MinimalTree {

	public static void main (String[] args){
		BTreePrinter.printNode(test1());
	}


	public static TreeNode test1(){
		int[] array = {1,4,5,12,14,16,18};

		TreeNode m = minTree(array);

		return m;

	}



	public static TreeNode minTree(int[] a){
		return minTree(a,0,a.length-1);
	}

	private static TreeNode minTree(int[] a, int start, int end){
		if (a == null) return null;
		if (end < start) return null;
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(a[mid]);

		n.left = minTree(a, start, mid-1);
		n.right = minTree(a, mid+1, end);

		return n;

	}
}

























































