package drukier.physics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class ProjectileGraph extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.LIGHT_GRAY);
		for (int increment = 0; increment <= getHeight(); increment = increment + 10) {
			g.drawLine(0, increment, getWidth(), increment);
		}
		for (int increment = 0; increment <= getWidth(); increment = increment + 10) {
			g.drawLine(increment, 0, increment, getHeight());
		}

		g.translate(0, getHeight());

		Projectile projectile1 = new Projectile(54, 108);

		g.setColor(Color.RED);
		for (int time = 0; time <= 10; time++) {
			g.fillOval((int) projectile1.getX(time), (int) -projectile1.getY(time), 5, 5);
			g.drawLine((int) projectile1.getX(time), (int) -projectile1.getY(time), (int) projectile1.getX(time - 1),
					(int) -projectile1.getY(time - 1));
			g.drawString("(" + projectile1.getX(time) + "), (" + projectile1.getY(time) + ")",
					(int) projectile1.getX(time), (int) -projectile1.getY(time));
		}

		Projectile projectile2 = new Projectile(63, 87);

		g.setColor(Color.BLUE);
		for (int time = 0; time <= 10; time++) {
			g.fillOval((int) projectile2.getX(time), (int) -projectile2.getY(time), 5, 5);
			g.drawLine((int) projectile2.getX(time), (int) -projectile2.getY(time), (int) projectile2.getX(time - 1),
					(int) -projectile2.getY(time - 1));
			g.drawString("(" + projectile2.getX(time) + "), (" + projectile2.getY(time) + ")",
					(int) projectile2.getX(time), (int) -projectile2.getY(time));
		}

		Projectile projectile3 = new Projectile(42, 279);

		g.setColor(Color.GREEN);
		for (int time = 0; time <= 10; time++) {
			g.fillOval((int) projectile3.getX(time), (int) -projectile3.getY(time), 5, 5);
			g.drawLine((int) projectile3.getX(time), (int) -projectile3.getY(time), (int) projectile3.getX(time - 1),
					(int) -projectile3.getY(time - 1));
			g.drawString("(" + projectile3.getX(time) + "), (" + projectile3.getY(time) + ")",
					(int) projectile3.getX(time), (int) -projectile3.getY(time));
		}
	}
}
