import java.util.ArrayList;

class SetOfStacks {
	ArrayList<Stack> stacks = new ArrayList<Stack>();

	public void push(int item){
		Stack last = getLastStack();
		if(last != null && !last.isFull()){
			last.push(item);
		}
		else {
			Stack stack = new Stack();
			stack.push(item);
			stacks.add(stack);
		}
	}

	public int pop(){
		Stack last = getLastStack();
		if(last == null ) throw new IllegalStateException("stack is empty");
		int v = last.pop();
		
		if (last.getSize() == 0 ){
			stacks.remove(stacks.size()-1);
		}
		return v;

	}

	public Stack getLastStack(){
		if (stacks.size() == 0)  return null;
		else{
			return stacks.get(stacks.size()-1);
		}
	}

	public int getSize(){
		return stacks.size();
	}

	// public void printStack(int stackNum){
	// 	Stack s = stacks.get(stackNum);

	// 	for (int i : s){
	// 		System.out.println(i);
	// 	}




 //    }

}

class Node {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields 
    //~ ----------------------------------------------------------------------------------------------------------------

    int data;
    Node next;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ =
    //~ ----------------------------------------------------------------------------------------------------------------

    Node(int data) {
        this.data = data;
    }
}

class Stack {


    private Node top;
    private int capacity = 3;
    private int size = 0;

    int getSize(){
    	return size;
    }
    boolean isFull(){
    	if(size == capacity)
    		return true;
    	else 
    		return false;
    }
    int pop() {
        if (top == null) {
            throw new IllegalStateException("stack is empty");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
        size++;
    }

    int peek() {
        if (top == null) {
            throw new IllegalStateException("stack is empty");
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
    

}



public class StackOfPlates {
	public static void main (String[] args){
		SetOfStacks n = new SetOfStacks();
		n.push(1);
		n.push(2);
		n.push(3);
		n.push(4);
		n.push(5);
		n.push(6);
		n.push(7);
		n.push(8);
		n.push(9);

		System.out.println("=====");
		System.out.println(n.getSize());
		System.out.println("=====");

		System.out.println(n.pop());
		System.out.println(n.pop());
		System.out.println(n.pop());

		System.out.println("=====");
		System.out.println(n.getSize());
		System.out.println("=====");

		System.out.println(n.pop());
		System.out.println(n.pop());
		System.out.println(n.pop());

		System.out.println("=====");
		System.out.println(n.getSize());
		System.out.println("=====");

		System.out.println(n.pop());
		System.out.println(n.pop());
		System.out.println(n.pop());

		System.out.println("=====");
		System.out.println(n.getSize());
		System.out.println("=====");


	}
}