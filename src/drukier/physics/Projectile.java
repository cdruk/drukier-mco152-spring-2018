package drukier.physics;

public class Projectile {
	
	double angle = 0.0;
	double velocity = 0.0;

	public Projectile(double angle, double velocity) {
		this.angle = angle;
		this.velocity = velocity;
	}

	double getX(double time) {
		return Math.cos(Math.toRadians(angle)) * velocity * time;
	}

	double getY(double time) {
		return Math.sin(Math.toRadians(angle)) * velocity * time - (.5 * 9.8 * time * time);
	}

}
