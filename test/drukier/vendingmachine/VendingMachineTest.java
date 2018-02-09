package drukier.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {
	
	@Test
	public void pay() {
		//given
		 VendingMachine machine = new VendingMachine();
		
		//when
		 Change change = machine.pay(1.73, 3.60);
		
		//then
		assertEquals(7, change.getQuarters());
		assertEquals(1, change.getDimes());
		assertEquals(0, change.getNickels());
		assertEquals(2, change.getPennies());
	}

}
