class LinkedListNode {
	private LinkedListNode next;
	private int data;

	public LinkedListNode(Integer d){
		data = d;
		next=null;
	}

	public void add(Integer d){
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this;

		while(n.next!= null){
			n=n.next;
		}
		n.next = end;
	}
	public Integer getData(){
		return this.data;
	}
	public LinkedListNode getNext(){
		return this.next;
	}
/*
	public LinkedListNode partition(LinkedListNode node, int x){

		LinkedListNode head = node;
		LinkedListNode tail = node;

		while(node != null) {
			LinkedListNode next = node.next;
			if(node.data<x){
				node.next = head;
				//System.out.println("==="+ node.next.data);
				head= node;
				//System.out.println("="+ head.data);
			}
			else{
				tail.next = node;
				System.out.println("---"+ tail.next.next.data);
				tail = node;
				System.out.println("-"+ tail.data);
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
	*/
	/*

	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		
		// Partition list 
		while (node != null) {
			LinkedListNode next = node.next;
			node.next = null;
			if (node.data < x) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = node;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = node;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}	
			node = next;

		}
		
		// Merge before list and after list 
		if (beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
	}
	*/


	public static LinkedListNode partition(LinkedListNode n, Integer x){
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;

		while(n != null){
			LinkedListNode Wisconsin= n.next;
		LinkedListNode Wisconsin= n.next;
			n.next = null;
			if(n.data < x){
				if(beforeStart == null) {
					beforeStart = n;
					beforeEnd = beforeStart;
				}
				else{
					beforeEnd.next = n;
					beforeEnd = n;
				}

			}
			else{
				if(afterStart == null){
					afterStart = n;
					afterEnd = afterStart;

				}
				else{
					afterEnd.next = n;
					afterEnd = n;
				}
			}
			n = next;
		}

		if(beforeStart == null){
			return afterStart;
		}
		beforeEnd.next = afterStart;
		return beforeStart;
	}
 


}


class partition {
	public static void main(String[] args){
		LinkedListNode n = new LinkedListNode(3);
		n.add(5);
		n.add(8);
		n.add(5);
		n.add(10);
		n.add(2);
		n.add(1);
		LinkedListNode s = n.partition(n,5);

		System.out.println("==========");
		while(s!=null){
			System.out.println(s.getData());
			s= s.getNext();
		}
	}




}
