class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

class MyQueue {

	private Node first;
	private Node last;

	public void add (int data) {
		Node t = new Node (data);
		if (last != null) {
			last.next = t;
		}
		last = t;
		if (first == null) {
			first = last;
		}
	}

	public Integer remove() {
		if (first == null) throw new IllegalStateException("Queue is empty");
		int data = first.data;
		first = first.next;
		if(first == null) {
			last = null;
		}
		return data;
	}

	public Integer peek() {
		if (first == null) throw new IllegalStateException("Queue is empty");
		return first.data;
	}

	public boolean isEmpty() {
		return first == null;
	}
}

class Queue {
	public static void main (String[] args){
		MyQueue q = new MyQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println("=====");
		System.out.println(q.peek());

	}
}
