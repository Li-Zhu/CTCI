public class AnimalShelter {

	//build the queue by Linkedlist implemented by Myself.

	//Cat and Dog only can be represented by 2,1.


	public static void main(String[] args){
	Shelter s = new Shelter();
	s.equeue(1);
	s.equeue(1);
	s.equeue(2);
	s.equeue(1);
	s.equeue(1);

	System.out.println(s.dequeueAny());
	System.out.println(s.dequeueAny());
	System.out.println(s.dequeueAny());
	System.out.println(s.dequeueAny());

	System.out.println(s.dequeueCat());
	System.out.println(s.dequeueCat());



	}
}




class Node {
	Node next;
	int data;

	Node(int i ){
		this.data = i;
	}
}


class Shelter {

	Node first;
	Node last;


	public void equeue(int i){
		Node n = new Node(i);
		if(last != null){
			last.next = n;
		}
		last = n;
		if(first ==null){
			first = last;
		}
	}

	public int dequeueAny() {
		if (first ==null) throw new IllegalStateException("stack is empty!");
		int n = first.data;
		first = first.next;

		if(first == null){
			last = null;
		}

		return n;
	}

	public int dequeueCat(){
		Node temp = first;
		int n =0;
		if (first ==null) throw new IllegalStateException("stack is empty!");
		while(temp != null){
			if (temp.data == 2) {
				if(temp.next != null){
					n = temp.data;
					first = first.next;
					if(first == null){
						last = null;
					}
					return n;

				}
				else{
					n = temp.data;
					first = null;
					last = null;
					return n;

				}
			}
			else if (temp.data == 1){
				System.out.print("No cat anymore 0 __ ");
				
			}
			else if (temp.next.data == 2){
				if (temp.next.next != null){
					n = temp.next.data;
					temp.next = temp.next.next;
					if(temp.next == null){
						last = temp;
					}
					return n;


				}
				else {
					n = temp.next.data;
					temp.next = null;
					last = temp;
					return n;

				}

			}
			temp = temp.next;
		}
		return 0;

	}

	public int dequeueDog(){
		Node temp = first;
		int n =0;
		if (first ==null) throw new IllegalStateException("stack is empty!");
		while(temp != null){
			if (temp.data == 1) {
				if(temp.next != null){
					n = temp.data;
					first = first.next;
					if(first == null){
						last = null;
					}
					return n;

				}
				else{
					n = temp.data;
					first = null;
					last = null;
					return n;

				}
			}
			else if (temp.data == 2){
				System.out.print("No dog anymore! 0 _ ");

			}
			else if (temp.next.data == 1){
				if (temp.next.next != null){
					n = temp.next.data;
					temp.next = temp.next.next;
					if(temp.next == null){
						first = temp;
						last = temp;
					}
					return n;


				}
				else {
					n = temp.next.data;
					temp.next = null;
					first = temp;
					last = temp;
					return n;

				}
			}
			temp = temp.next;
		}
		return 0;

	}

}