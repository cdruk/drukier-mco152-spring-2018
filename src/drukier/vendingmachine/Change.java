package drukier.vendingmachine;

public class Change {

	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;

	public Change(int amount) {
		makeChange(amount);
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

	public void makeChange(double amount) {
		for (quarters = 0; amount >= 25; quarters++) {
			amount = (amount - 25);
		}
		setQuarters(quarters);
		for (dimes = 0; amount >= 10; dimes++) {
			amount = (amount - 10);
		}
		setDimes(dimes);
		for (nickels = 0; amount >= 05; nickels++) {
			amount = (amount - 05);
		}
		setNickels(nickels);
		for (pennies = 0; amount >= 01; pennies++) {
			amount = (amount - 01);
		}
		setPennies(pennies);
	}
}
