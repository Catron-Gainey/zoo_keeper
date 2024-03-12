package zookeeper;

public class Bat extends Mammal{
	
	public Bat() {
		super(300);
	}
	public void fly() {
		System.out.println("The bat is airbourne");
		this.energy -=50;
		System.out.println("The bat's energy is now: "+ energy);
	}
	public void eatHumans() {
		System.out.println("The bat is satisfied");
		this.energy += 25;
		System.out.println("The bat's energy is now: "+ energy);
	}
	public void attackTown() {
		System.out.println("The bat just attacked the town");
		this.energy -= 100; 
		System.out.println("The bat's energy is now: "+ energy);
	}
}
