
public class Samurai extends Human{
	private static int numSamurai = 0;
	public Samurai() {
		this.health = 200;
		numSamurai += 1;
	}
	
	public void deathBlow(Human target) {
		this.health = this.health/2;
		target.health = 0;
	}
	
	public void meditate() {
		this.health += this.health/2;
	}
	
	public int howMany() {
		return Samurai.numSamurai;
	}
}
