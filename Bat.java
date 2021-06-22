
public class Bat extends Mammal{
	public void fly() {
		energylevel -=50;
	}
	
	public void eatHumans() {
		energylevel += 25;
	}
	
	public void attackTown() {
		energylevel -=100;
	}
	
	public Bat(int energylevel) {
		super(300);
	}
}
