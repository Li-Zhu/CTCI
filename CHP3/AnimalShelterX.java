
import java.util.LinkedList;

class AnimalShelterX {
	LinkedList<Animal> dogs = new LinkedList<Animal>();
	LinkedList<Animal> cats = new LinkedList<Animal>();
	LinkedList<Animal> unicorns = new LinkedList<Animal>();

	int time = 0;
	enum Type {CAT, DOG, UNICORN}



    class Animal {
        Type type;
        String name;
        int timeStamp;
        
        public Animal(Type type, String name) {
            this.type = type;
            this.name = name;
        }
        
        @Override
        public String toString() {
            return type + ": " + name;
        }
    }

	void enqueue(Animal a ){

	 	a.timeStamp = ++time;
 		switch (a.type) {
 			case CAT: cats.add(a); break;
 			case DOG: dogs.add(a); break;
 		}
 	}

 	Animal dequeueDog(){
 		if(dogs.isEmpty()) throw new IllegalStateException("No dogs");
 		return dogs.removeFirst();
 	}
 	Animal dequeueCat(){
 		if(dogs.isEmpty()) throw new IllegalStateException("No cats");
 		return cats.removeFirst();
 	}

 	Animal dequeueAny() {
 		if(cats.isEmpty() && dogs.isEmpty()){
 			 throw new IllegalStateException("No animals!");
 		}
 		else if(dogs.isEmpty()){
     			return dequeueCat();
 		}
 		else if(cats.isEmpty()){
 			return dequeueDog();
 		}
 		else {
 			if(dogs.getFirst().timeStamp < cats.getFirst().timeStamp) {
 				return dequeueDog();
 			}
 			else
 				return dequeueCat();
 		}


 	}




	
	 public static void main(String[]args) {
        AnimalShelterX q = new AnimalShelterX(); /* AnimalQueue */
        q.enqueue(q.new Animal(Type.CAT, "lily"));
        q.enqueue(q.new Animal(Type.DOG, "tom"));
        q.enqueue(q.new Animal(Type.DOG, "peter"));
        q.enqueue(q.new Animal(Type.CAT, "john"));
        
        System.out.println(q.dequeueAny());
        System.out.println(q.dequeueCat());
        System.out.println(q.dequeueAny());
        q.enqueue(q.new Animal(Type.DOG, "tom"));
        System.out.println(q.dequeueDog());
        System.out.println(q.dequeueAny());
    }
}