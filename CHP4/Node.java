import java.util.ArrayList;

class Node {
	public int value;
	public boolean isVisited;
	public ArrayList<Node> adjacent;

	public Node(int x) {
		value = x;
		isVisited = false;
		adjacent = new ArrayList<Node>();
	}

}