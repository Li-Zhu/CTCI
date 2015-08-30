
import java.util.*;

class RouteBetweenNodes {
	public static void main (String[] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);

		n1.adjacent.add(n2);
		n1.adjacent.add(n3);
		n2.adjacent.add(n6);
		n3.adjacent.add(n4);
		n4.adjacent.add(n5);

		System.out.println(BFSsearch(n1,n5));
		//System.out.println(DFSsearch(n1,n5));
		
	}


	public static boolean BFSsearch(Node v1, Node v2){
		if(v1 == v2) {
			return true;
		}
		LinkedList<Node> queue = new LinkedList<Node>();
		v1.isVisited = true;
		queue.add(v1);
		while(!queue.isEmpty()){
			Node u = queue.removeFirst();
			System.out.println(u.value);
			for(Node n : u.adjacent){
				if (n.isVisited == false){
					if(n == v2) return true;
					n.isVisited =true;
					queue.add(n);
				}
			}
		}
		return false;
	}


	public static boolean DFSsearch(Node v1, Node v2){
		if(v1 == v2) {
			return true;
		}
		LinkedList<Node> queue = new LinkedList<Node>();
		v1.isVisited = true;
		queue.add(v1);
		while(!queue.isEmpty()){
			Node u = queue.removeLast();
			System.out.println(u.value);
			for(Node n : u.adjacent){
				if (n.isVisited == false){
					if(n == v2) return true;
					n.isVisited =true;
					queue.add(n);
				}
			}
		}
		return false;
	}
}
