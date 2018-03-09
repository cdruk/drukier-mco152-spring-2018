package drukier.physics;

public class Physics {
	public static void main(String[] args) 
	{

		Projectile rock = new Projectile(72.0, 23.0);
				
		for (int time = 0; time <= 10; time++){
			System.out.println("time = " + time + "\t x = " + rock.getX(time) + "\t y = " + rock.getY(time));
		}
	}
}
