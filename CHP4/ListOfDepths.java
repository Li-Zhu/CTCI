import java.util.*;

class ListOfDepths {

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

		ArrayList<LinkedList<TreeNode>> al = DFSlistDeps(n1);

		printResult(al);
	}


	public static ArrayList<LinkedList<TreeNode>> BFSlistDeps(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();

		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if(root != null) {
			current.add(root);
		}

		while(current.size() != 0){
			result.add(current); // add current to result;
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();

			for(TreeNode parent : parents) {
				if(parent.left != null){
					current.add(parent.left);
				}
				if(parent.right != null){
					current.add(parent.right);
				}
			}

		}
		return result;
	}



	public static ArrayList<LinkedList<TreeNode>> DFSlistDeps (TreeNode root){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		DFSlistDeps(root, result, 0);
		return result;
	}
	private static void DFSlistDeps(TreeNode root, ArrayList<LinkedList<TreeNode>> result, int depth){
		if(root == null) return;
		LinkedList<TreeNode> list = null;
		if(result.size() == depth){ // create the list
			list = new LinkedList<TreeNode>();
			result.add(list);
		}
		else { // find the list
			list = result.get(depth);
		}
		list.add(root);
		DFSlistDeps(root.left, result, depth + 1);
		DFSlistDeps(root.right, result, depth + 1);

	}




	public static void printResult(ArrayList<LinkedList<TreeNode>> result){
		int depth = 0;
		for(LinkedList<TreeNode> entry : result) {
			System.out.print("Link list at depth " + depth + ":");
			for (TreeNode tn : entry){
				System.out.print(" " + tn.value);
			}
			System.out.println();
			depth++;
		}
	}
}
