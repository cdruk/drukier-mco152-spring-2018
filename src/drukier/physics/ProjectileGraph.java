package drukier.physics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class ProjectileGraph extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// g.setColor(Color.BLACK);
		// g.fillRect(0, 0, 600, 6\00);
		//
		// g.setColor(Color.RED);
		// g.drawLine(10, 50, 140, 140);
		// g.drawOval(14, 14, 400, 400);

		Projectile projectile = new Projectile(54, 108);
		
		g.setColor(Color.RED);
		g.translate(0, getHeight());
		for (int time = 0; time <= 10; time++) {
			g.fillOval((int) projectile.getX(time), (int) -projectile.getY(time), 5, 5);
			g.drawLine((int) projectile.getX(time), (int) -projectile.getY(time), 1, 2);
			g.drawString("(" + projectile.getX(time) + "), (" + projectile.getY(time) + ")" , (int) projectile.getX(time), (int) -projectile.getY(time));
		}

	}
}
