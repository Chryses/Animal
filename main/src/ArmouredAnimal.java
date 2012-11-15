
public class ArmouredAnimal extends Animal {

	public ArmouredAnimal(String name) {
		super(name);
		
	}
	
	@Override
	public void slice(String tool){
		System.out.println("You cannot slice an armoured animal! Gosh... you're such a n00b!! You know what?? The animal killed you!! That's it!! Game over!! Leave the room!");
	}
	
	public void bye(){
		System.out.println("Animal walks away!!!");
	}

}
