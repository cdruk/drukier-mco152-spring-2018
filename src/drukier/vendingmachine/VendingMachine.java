package drukier.vendingmachine;

public class VendingMachine {
	private double price;
	private double paid;
	private String changeOutput;
	Change change;

	
	public VendingMachine(double price, double paid){
		this.price = price;
		this.paid = paid;
		int amount = getChangeAmount();
		change = new Change(); 
		pay(price, paid);
		changeOutput = changeOutput();

	}
	
	private int getChangeAmount()
	{
		return (int) Math.round((paid-price)*100);
	}
	
	private String changeOutput(){
		return ("Your change is:\n" +
				change.getQuarters() + " Quarters\n" +
				change.getDimes() + " Dimes\n" +
				change.getNickels() + " Nickels\n" +
				change.getPennies() + " Pennies\n");
	}
	
	public Change pay(double price, double paid) {
		int amount = (int) Math.round((paid-price)*100);
		change.makeChange(amount);
		return change;
	}

	public String getChangeOutput() {
		return changeOutput;
	}

	public void setChangeOutput(String changeOutput) {
		this.changeOutput = changeOutput;
	}

	
}
