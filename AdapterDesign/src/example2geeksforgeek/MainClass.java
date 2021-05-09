package example2geeksforgeek;

public class MainClass {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow();
		ToyDuck toyDuck = new PlasticToyDuck();
		
		//Wrap a bird in BirdAdapter so that it behaves like toy duck
		
		ToyDuck birdAdapter = new BirdAdapter(sparrow);
		
		System.out.println("Sparrow...");
		sparrow.fly();
		sparrow.makeSound();
		
		System.out.println("ToyDuck...");
		toyDuck.squeak();
		
		//Toy Duck behaving like a bird...
		System.out.println("BirdAdapter...");
		birdAdapter.squeak();
	}
}
