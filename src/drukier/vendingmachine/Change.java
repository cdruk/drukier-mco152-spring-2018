package drukier.vendingmachine;

public class Change {
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	private double totalChange;

	public Change() {
	}

	public int getQuarters() {
		return quarters;
	}

	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}

	public void makeChange(double totalChange) {
		for (quarters = 0; totalChange >= 25; quarters++) {
			totalChange = (totalChange - 25);
		}
		setQuarters(quarters);
		for (dimes = 0; totalChange >= 10; dimes++) {
			totalChange = (totalChange - 10);
		}
		setDimes(dimes);
		for (nickels = 0; totalChange >= 05; nickels++) {
			totalChange = (totalChange - 05);
		}
		setNickels(nickels);
		for (pennies = 0; totalChange >= 01; pennies++) {
			totalChange = (totalChange - 01);
		}
		setPennies(pennies);
	}
}
