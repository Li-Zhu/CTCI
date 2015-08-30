import java.util.*;



class Node {
	//private fields
	private Node next;
	private String data;
	
	//constructor 
	public Node(String d) {
		data = d;
		next = null;
	}


	//public methods


	public String getData(){
		return this.data;
	}

	public Node getNext(){
		return this.next;
	}
	public boolean hasNext(){
		if(this != null)
			return true;
		else 
			return false;
	}

	public void add(String d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n=n.next;
		}
		n.next = end;
	}
	  // O(N) time 
	/*
	public  void deletDrups(){
		HashSet<String> set = new HashSet<String>();
		Node previous = null;
		Node n = this;
		while(n != null){
			if (set.contains(n.data)){
				previous.next = n.next;
			}
			else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	*/

	//Runner technology 
	
	public void deletDrups(){
		Node current = this;

		while (current != null) {
			Node runner = current;

			while (runner.next != null) {
				if (runner.next.data == current.data){
					runner.next=runner.next.next;
				}
				else
					runner = runner.next;
			}
			current = current.next;

		}

	}
	
}


class RemoveDups {
	public static void main(String[] srgs){
		Node ll = new Node("D");
		ll.add("F");
		ll.add("O");
		ll.add("L");
		ll.add("L");
		ll.add("L");
		ll.add("L");
		ll.add("P");
		ll.deletDrups();
		while(ll!=null){
			System.out.println(ll.getData());
			ll=ll.getNext();
		}

	}


	
}



/*

Windows7 32-bit 3.2G dual-core CPU 4G memory，Java 7，Eclipse -Xms512m -Xmx512m


compare loop performance of ArrayList
-----------------------------------------------------------------------
list size              | 10,000    | 100,000   | 1,000,000 | 10,000,000 
-----------------------------------------------------------------------
for each               | 1 ms      | 3 ms      | 14 ms     | 152 ms    
-----------------------------------------------------------------------
for iterator           | 0 ms      | 1 ms      | 12 ms     | 114 ms    
-----------------------------------------------------------------------
for list.size()        | 1 ms      | 1 ms      | 13 ms     | 128 ms    
-----------------------------------------------------------------------
for size = list.size() | 0 ms      | 0 ms      | 6 ms      | 62 ms     
-----------------------------------------------------------------------
for j--                | 0 ms      | 1 ms      | 6 ms      | 63 ms     
-----------------------------------------------------------------------

compare loop performance of LinkedList
-----------------------------------------------------------------------
list size              | 100       | 1,000     | 10,000    | 100,000   
-----------------------------------------------------------------------
for each               | 0 ms      | 1 ms      | 1 ms      | 2 ms      
-----------------------------------------------------------------------
for iterator           | 0 ms      | 0 ms      | 0 ms      | 2 ms      
-----------------------------------------------------------------------
for list.size()        | 0 ms      | 1 ms      | 73 ms     | 7972 ms   
-----------------------------------------------------------------------
for size = list.size() | 0 ms      | 0 ms      | 67 ms     | 8216 ms   
-----------------------------------------------------------------------
for j--                | 0 ms      | 1 ms      | 67 ms     | 8277 ms   
-----------------------------------------------------------------------


*/