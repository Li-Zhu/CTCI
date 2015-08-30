public class SortStack {
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(1);
		s.push(5);
		s.push(6);
		s.push(8);
		s.push(2);
		s.push(3);

		sortStack(s);


	}

	public static int sortStack(Stack s1) {
		Stack s2 = new Stack();
		while(!s1.isEmpty()){
			int temp = s1.pop();
			System.out.println("111111");
			while(!s2.isEmpty() && temp<s2.peek()){
					s1.push(s2.pop());
			}
			
			s2.push(temp);
			}

		while(!s2.isEmpty()){
			System.out.println(s2.pop());
		}

		return 0;
	}
}



//====================

class Node {
	int data;
	Node next;

	Node(int data){
		this.data = data;
	}
}

class Stack {
	Node top;
	int size = 0;

	public void push(int item){

		Node n = new Node(item);
		n.next = top;
		top = n;
		size++;
	}

	public int pop(){
		if(size == 0) throw new IllegalStateException("stack is empty");
		int r = top.data;
		top=top.next;
		size--;
		return r;
	}

	public int peek(){
		if(size == 0) throw new IllegalStateException("stack is empty");
		return top.data;
	}

	public boolean isEmpty(){
		if(size == 0) return true;
		return false;
	}




}
