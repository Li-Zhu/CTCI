import java.util.Stack;

class LinkedListNode{
	private LinkedListNode next;
	private Integer data;

	public LinkedListNode (Integer d){
		next = null;
		data = d;
	}

	public void add(int d){
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n  =this;

		while(n.next != null){
			n = n.next;

		}
		n.next =end;
	}

	public boolean isPalindrome(){
		LinkedListNode n = this;
		Stack <Integer>before = new Stack<Integer>();
		LinkedListNode fast = n;
		LinkedListNode slow = n;

		while(fast != null && fast.next != null){
			before.push(slow.data);
			fast=fast.next.next;
			slow=slow.next;

		}

		if (fast != null){
			slow=slow.next;
		}

		while(slow!=null){
			
			if(before.pop() != slow.data){
				return false;
			}
			else {
				slow = slow.next;
			}
		}
		return true;
	}

	
}

class Palindrome {
	public static void main(String[] args){
		LinkedListNode list = new LinkedListNode(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(6);

		System.out.println(list.isPalindrome());

	}
}