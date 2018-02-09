package drukier.vendingmachine;

public class Waterbottle {
	
	public static void main(String [] args){
		VendingMachine waterbottle = new VendingMachine(1.73, 3.60);
		
		System.out.println(waterbottle.getChangeOutput());
	}

}
