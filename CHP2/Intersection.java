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
	public void printList(){
		LinkedListNode n = this;
		while (n != null){
			System.out.println(n.data);
			n=n.next;
		}


	}

	public Integer isIntersection(LinkedListNode m){
		LinkedListNode l1 = this;
		LinkedListNode l2 = m;	
		LinkedListNode first = this;
		LinkedListNode second = m;


		//count the length of both LinkedListNode
		int count1= 0;
		int count2= 0;
		while(first.next!=null){
			count1++;
			first = first.next;
		}

		while(second.next!= null){
			count2++;
			second = second.next;
		}
		//if the tails are not same, false.
		if (first != second){
				System.out.pri-ntln("No intersection.");
			return null;
		}

		//cut the longer one's head.
		LinkedListNode longer = count1+1>count2+1? l1:l2;
		LinkedListNode shorter = count1+1>count2+1? l2:l1;

		longer = getKth(longer, Math.abs(count1+1-count2-1)); 


		// find the intersection.
		while(longer!=shorter){
			longer = longer.next;
			shorter = shorter.next; 

			}

		return shorter.data; 

		}

	public LinkedListNode getKth(LinkedListNode n, int k){
		int counter = 0;
		while(counter!=k){
			n=n.next;
			counter++;
		}
		return n;
	}

	public void makeIntersection(LinkedListNode n){
		LinkedListNode m = this;
		m.next.next = n.next.next.next;
	}




}


class Intersection{
	public static void main(String[] args){
		LinkedListNode n = new LinkedListNode(1);
		n.add(1);
		n.add(1);
		n.add(3);
		n.add(5);
		n.add(6);
		n.add(7);
		LinkedListNode m = new LinkedListNode(2);
		m.add(2);
		m.makeIntersection(n);

		System.out.println(m.isIntersection(n));

		//m.printList();
		//System.out.println("-------");
		//n.printList();


	}
}