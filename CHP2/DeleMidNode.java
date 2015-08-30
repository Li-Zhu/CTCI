class LinkedListNode{
	public LinkedListNode next;
	public String data;

	public LinkedListNode(String d){
		data = d;
		next = null;

	}

	public String getData(){
		return this.data;
	}

	public LinkedListNode getNext(){
		return this.next;
	}


	public void add(String s){
		LinkedListNode end = new LinkedListNode(s);
		LinkedListNode n = this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=end;
	}

	public boolean deleMidNode(LinkedListNode n){
		if(n ==null || n.next ==null){
			return false;
		}
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;

	}
}



class DeleMidNode{
	public static void main(String[] args){
		LinkedListNode n = new LinkedListNode("a");
		n.add("b");
		n.add("c");
		n.add("d");
		n.add("e");
		n.deleMidNode(n.getNext().getNext());
		while(n != null){
			System.out.println(n.getData());
			n=n.getNext();
		}
	}

}