package drukier.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {
	
	@Test
	public void pay() {
		//given
		 VendingMachine waterbottle = new VendingMachine(1.73, 3.60);
		
		//when
		 Change change = ;
		
		//then
		assertEquals(7, change.getQuarters());
		assertEquals(1, change.getDimes());
		assertEquals(0, change.getNickels());
		assertEquals(2, change.getPennies());
	}

}
