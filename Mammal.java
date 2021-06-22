
public class Mammal {
	protected int energylevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy level" + energylevel);
		return this.energylevel;
		
	}
	
	public Mammal(int energylevel) {
		this.energylevel = energylevel;
	}
}
