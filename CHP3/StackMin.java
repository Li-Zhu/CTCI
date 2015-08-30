/*class Node {
	int data;
	Node next;

	Node(int data){
		this.data = data;
	}
}
class Mystack{
	private Node top;
	private int counter=0;
	private int[] minTracker = new int[10];


	public void push(int item){
		if (counter == 0) {
			minTracker[0] = item;
			counter++;
		}else{
			minTracker[counter] = minTracker[counter-1]>item? item : minTracker[counter-1];
			counter++;
		}

		Node t = new Node(item);
		t.next = top;
		top = t;

	}

	public Integer pop(){
		counter --;
		if (top == null) throw new IllegalStateException("stack is empty");
		top = top.next;
		return top.data;
	}

	public Integer showMin(){
		int r =  minTracker[counter-1];
		return r;
	}


}
*/
import java.util.Stack;
class Node {
	int data;
	Node next;

	Node(int data){
		this.data = data;
	}
}
class Mystack{
	private Node top;
	private Stack<Integer> minTracker = new Stack<Integer>();


	public void push(int item){
		if (top == null) {
			minTracker.push(item);
		}
		if(item<=minTracker.peek()){
			minTracker.push(item);
			
		}

		Node t = new Node(item);
		t.next = top;
		top = t;

	}

	public Integer pop(){
		if(minTracker.peek()==top.data){
			minTracker.pop();
		}
		if (top == null) throw new IllegalStateException("stack is empty");
		top = top.next;
		return top.data;
	}

	public Integer showMin(){
		if(minTracker.isEmpty()){
			throw new IllegalStateException("stack is empty");
		}
		int r =  minTracker.peek();
		return r;
	}

	public Integer peek() {
		if (top == null) {
            throw new IllegalStateException("stack is empty");
        }
        return top.data;
	}


}
class StackMin {
	public static void main(String[] args){
		//System.out.println((Integer)1 < null);

		Mystack n = new Mystack();
		n.push(3);
		n.push(2);
		n.push(9);
		n.push(1);
		n.push(5);
		n.push(0);

		//stack: 3-2-9-1-5-0
		//minTracker = 3-2-2-1-1-0

		System.out.println(n.showMin());
		n.pop();
		System.out.println(n.showMin());
		n.pop();
		System.out.println(n.showMin());
		n.pop();
		System.out.println(n.showMin());
	}
}