
public class Animal {
	
	String animalName;
	
	public Animal(String name){
		animalName = name;
	}
	
	public void slice(String tool){
		switch(tool){
		case "Katana":
			System.out.println("With one clean arc slice you cut " + animalName +"'s body into two separate parts! Congratulations!");
			break;
		case "Long Sword":
			System.out.println("With the mighty swing you cut " + animalName +"'s furry ugly head! Congratulations!");
			break;
		case "Knife":
			System.out.println("With the firm thrust, you penetrate " + animalName +"'s body and reach its heart! Congratulations!");
			break;
		case "Scissors":
			System.out.println("Really???? You want to slice animal with scissors???? Are you simply dumb or do you have a medical state??");
			break;
		default:
			System.out.println("How can you slice" + animalName + " if you haven't chosen a tool??? DUH!!!!" );
			break;
		}		
	}
	
	public void poke(int hardness){
		if(hardness >= 0
		&& hardness < 10){
			System.out.println("What? Huh?");
		}
		
		else if(hardness > 10){
			System.out.println("Grrr");
		}
	}
}