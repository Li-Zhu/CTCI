class LinkedListNode {
	private LinkedListNode next;
	private Integer data;

	public LinkedListNode (Integer d){
		next = null;
		data = d;
	}
	public void add (int d){
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this;

		while(n.next != null) {
			n= n.next;
		}
		n.next = end;
	}
	public LinkedListNode getNext(){
		return this.next;
	}
	public Integer getData(){
		return this.data;
	}


    public static LinkedListNode sumTwo(LinkedListNode n1, LinkedListNode n2, int carry){
    	//base case
    	if(n1 == null && n2 == null && carry == 0){
    		return null;
    	}
    	int r = carry;
    	if(n1 != null) r += n1.data;
    	if(n2 != null) r += n2.data;
    	LinkedListNode head = new LinkedListNode(r % 10);


    	//recusive case

    	if(n1 != null || n2 != null)
		{	
			head.next = sumTwo( n1 == null ? n1 : n1.next, n2 == null ? n2 : n2.next, r >= 10 ? 1 : 0 );
		}
    	return head;

    }



	
}

class sumLists {
	public static void main(String[] args){

		LinkedListNode list1 = new LinkedListNode(7);
		list1.add(1);
		list1.add(6);
		//list1.add(1);
		//list1.add(6);
		//list1.add(6);
		LinkedListNode list2 = new LinkedListNode(5);
		list2.add(9);
		list2.add(2);

		LinkedListNode result = LinkedListNode.sumTwo(list1,list2,0);
		//System.out.println(result);

		while(result!=null){
			System.out.println("===========");
		 	System.out.println(result.getData());
		 	result = result.getNext();
		 }

	}

}