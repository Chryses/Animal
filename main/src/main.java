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
		Animal victim = new Animal(name);
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
