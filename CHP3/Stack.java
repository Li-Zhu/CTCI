

class Node {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields 
    //~ ----------------------------------------------------------------------------------------------------------------

    int data;
    Node next;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Constructors 
    //~ ----------------------------------------------------------------------------------------------------------------

    Node(int data) {
        this.data = data;
    }
}

class MyStack {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields 
    //~ ----------------------------------------------------------------------------------------------------------------

    private Node top;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    int pop() {
        if (top == null) {
            throw new IllegalStateException("stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
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


class Stack{
	public static void main(String[] args){
	MyStack n = new MyStack();
	n.push (2);
	n.push (3);
	n.push (4);

	System.out.println(n.pop());
	System.out.println(n.pop());
	System.out.println(n.pop());
	//System.out.println();
	//System.out.println();
	}
}

