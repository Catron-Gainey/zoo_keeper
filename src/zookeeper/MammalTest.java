package zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		Gorilla magilla = new Gorilla(100);
		magilla.throwSomething();
		magilla.throwSomething();
		magilla.throwSomething();
		magilla.eatBananas();
		magilla.eatBananas();
		magilla.climb();
		System.out.println(magilla.energy);
		Bat dracula = new Bat();
		dracula.attackTown();
		dracula.attackTown();
		dracula.attackTown();
		dracula.eatHumans();
		dracula.eatHumans();
		dracula.fly();
		dracula.fly();
		dracula.displayEnergy();

	}

}
