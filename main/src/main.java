import java.util.Scanner;


public class main {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String weapon = null;
		System.out.println("Name your animal:");
		String name = input.next();
		
		System.out.println("Choose type: ");
		System.out.println("1. Regular animal");
		System.out.println("2. Armoured animal");
		int animalType = input.nextInt();
		switch (animalType){
		case 1:
			Animal victim = new Animal(name);
			break;
		case 2:
			ArmouredAnimal victim = new ArmouredAnimal(name);
			break;
			default:
				break;
		}
		
		System.out.println("What do you want to do with" + name +"?");
		System.out.println("1. Slice");
		int torture = input.nextInt();
		switch (torture){
		case 1:
			System.out.println("Choose your tool");
			System.out.println("1. Katana");
			System.out.println("2. Longsword");
			System.out.println("3. Knife");
			System.out.println("4. Scissors");
			
			int tool = input.nextInt();
		switch(tool){
		case 1:
			weapon = "Katana";
			break;
		case 2:
			weapon = "Long Sword";
			break;
		case 3:
			weapon = "Knife";
			break;
		case 4:
			weapon = "Scissors";
			break;
			default:
			break;
		}
			victim.slice(weapon);
			break;
			
		default:
			break;
			
			
		}

	}

}
