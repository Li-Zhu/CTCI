class LinkedListNode {
	private LinkedListNode next;
	private String data;

	// Recursive
	private int findKthToLast(LinkedListNode head, int k) {
		if(head == null){
			return 0;
		}
		int index = findKthToLast(head.next, k)+1;
		System.out.println(index);
		if(index == k){
			System.out.println(k + "th to the last node is " + head.data);
		}
		return index;

	}
	

/*

	private void findKthToLast(LinkedListNode head, int k){
		//while loop 
		int index = 0;
		int length = 0;
		int position =0;
		LinkedListNode temp = head;
		while(head != null){
			length++;
			head=head.next;
			System.out.println("ss");
		}
		while(temp != null){
			System.out.println("jj");
			index++;
			position=length-index;
			if(position == k-1){
				System.out.println(k + "th to the last node is " + temp.data);
			}
			temp=temp.next;

		}
	}
*/

	public LinkedListNode(String d){
		data =d;
		next = null;
	}


	public void add(String d){
		LinkedListNode n = this;
		LinkedListNode end = new LinkedListNode(d);
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}





	public LinkedListNode getNext(){
		return this.next;
	}


	public String getData(){
		return this.data;
	}



	public void findKthToLast(int k){
		findKthToLast(this,k);


	}


}


class KthToLast{
	public static void main(String[] args){
		LinkedListNode n = new LinkedListNode("A");
		n.add("B");
		n.add("C");
		n.add("D");
		n.add("E");
		n.add("F"); 
		n.findKthToLast(2);
	System.out.println("======================");
		while(n!=null){
			System.out.println(n.getData());
			n= n.getNext();
		}
	}
}