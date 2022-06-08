package zookeeperone;

public class Gorilla extends Mammal{
	public void throwThings() {
		System.out.println("King Kong threw something");
		this.setEnergy(this.getEnergy() - 5);
	}
	
	public void eatBananas(int num) {
		System.out.println("Burp");
		this.setEnergy(this.getEnergy() + (10 * num));
	}
	
	public void climb() {
		System.out.println("I'm afraid of heights-oh well!");
		this.setEnergy(this.getEnergy() - 10);
	}
}
