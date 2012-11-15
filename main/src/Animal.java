
public class Animal {
	
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
