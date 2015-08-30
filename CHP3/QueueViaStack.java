public class QueueViaStack{
	public static void main(String[] args){

		MyQueue m = new MyQueue();

		m.add(1);
		m.add(2);
		m.add(3);
		System.out.println(m.remove());
		System.out.println(m.peek());
		System.out.println(m.remove());
		System.out.println(m.remove());




	}
}


class MyQueue {
	MyStack s1 = new MyStack();
	MyStack s2 = new MyStack();


	public void add(int item){
		s1.push(item);
	}

	public void shiftToS2(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
	}

	public int remove(){
		shiftToS2();
		return s2.pop();
	}

	public int peek(){
		if(s2.isEmpty()){
			return s1.peek();
		}
		return s2.peek();
	}

}


class Node {
	int data;
	Node next;

	Node (int data){
		this.data = data;
	}
}

class MyStack {
	Node top;
	int size = 0;

	public void push(int data) {
		Node s = new Node(data);
		s.next = top;
		top =s;
		size++;
	}

	public int pop() {
		if (size == 0) throw new IllegalStateException("stack is empty");
		int r = top.data;
		top = top.next;
		size--;
		return r;
	}

	public int peek(){
		if(size == 0) throw new IllegalStateException("stack is empty");
		return top.data;
	}

	public boolean isEmpty(){
		if(size == 0 ) return true;
		return false;
	}
}