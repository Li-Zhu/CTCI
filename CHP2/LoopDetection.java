class LoopDetection{
	public static void main(String[] args)
	{
		LinkedListNode n = new LinkedListNode (1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		n.add(7);
		n.add(8);
		n.add(9);
		n.add(0);
		n.makeLoop();
		System.out.println(n.FindStart());
	}
}


class LinkedListNode {
	private LinkedListNode next;
	private Integer data;

	public LinkedListNode (Integer d){
		data = d;

	}
	public void add (Integer d) {
		LinkedListNode end = new LinkedListNode (d);
		LinkedListNode n = this;	
		while(n.next != null){
			n=n.next;
		}
		n.next = end;

	}

	public void makeLoop(){
		LinkedListNode m = this;
		m.next.next.next.next.next.next.next.next.next.next = m.next.next.next.next;
		
		
	}
	public void ListNode(){
		LinkedListNode n = this;
		while(n != null){
			System.out.println(n.data);
			n=n.next;
		}
	}

	public Integer FindStart(){
		LinkedListNode fast = this;
		LinkedListNode slow = this;

		while(fast != null && fast.next !=null){ //exclude the same head 
			fast= fast.next.next;
			slow= slow.next;
			if(fast == slow){
				break;
			}
		}

		if(fast == null || fast.next == null){ //error check, no loop
			return null;
		}

		slow = this;

		while (slow != fast) {
			slow = slow.next;
			fast= fast.next;

		}

		return slow.data;




	}
}