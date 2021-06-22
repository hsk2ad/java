
public class Gorilla extends Mammal{
	public void throwthings() {
		energylevel -=10;
	}
	
	public void eatBananas() {
		energylevel += 10;
	}
	
	public void climb() {
		energylevel -=10;
	}
	
	public Gorilla(int energylevel) {
		super(energylevel);
	}
}
