package zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla(int energy) {
		super(energy);
	}

	public void throwSomething() {
		energy -= 5;
		System.out.println("The gorilla has thrown something");
		System.out.println("The gorilla's energy is now: "+ energy);
	}
	public void eatBananas() {
		energy += 10;
		System.out.println("The gorilla's energy is now: "+ energy);
		System.out.println("The gorilla is satisfied");
	}
	public void climb() {
		energy -= 10;
		System.out.println("The gorilla has climbed a tree");
		System.out.println("The gorilla's energy is now: "+ energy);
	}
}
