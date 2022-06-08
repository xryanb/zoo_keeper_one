package zookeeperone;

public class Mammal {
	private double energy=100;
	
	public Mammal() {}
	
	public void displayEnergy() {
		System.out.println("Energy level is: " + this.energy);
	}
	
	public double getEnergy() {
		return this.energy;
	}
	
	public void setEnergy(double e) {
		this.energy=e;
	}
}
