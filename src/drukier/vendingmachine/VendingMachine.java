package drukier.vendingmachine;

public class VendingMachine {

	private String changeOutput;
	Change change;

	
	public VendingMachine(){

	}

	public Change pay(double price, double paid) {
		int amount = (int) Math.round((paid-price)*100);
		Change change = new Change(amount);
		return change;
	}
	
	private String changeOutput(){
		return ("Your change is:\n" +
				change.getQuarters() + " Quarters\n" +
				change.getDimes() + " Dimes\n" +
				change.getNickels() + " Nickels\n" +
				change.getPennies() + " Pennies\n");
	}

	public String getChangeOutput() {
		return changeOutput;
	}

	public void setChangeOutput(String changeOutput) {
		this.changeOutput = changeOutput;
	}

	
}
