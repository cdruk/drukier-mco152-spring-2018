package drukier.physics;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectileTest {

	@Test
	public void testfindX() {
		//given
		Projectile rock = new Projectile(72, 23);
		
		//when
		double x = rock.findX(10);
		
		//then
		assertEquals(71.0739, x, 0.1);
	}

	@Test
	public void testfindY() {
		//given
		Projectile rock = new Projectile(72, 23);
		
		//when
		double y = rock.findY(10);
		
		//then
		assertEquals(-271.2570, y, 0.1);
	}
}
