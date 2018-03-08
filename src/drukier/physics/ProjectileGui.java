package drukier.physics;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

import javax.swing.*;

public class ProjectileGui extends JFrame
{
	
	JTextField angle = new JTextField("");
	JTextField velocity = new JTextField("");
	JTextField time = new JTextField("");
	JTextField x = new JTextField();
	JTextField y = new JTextField();
	
	public ProjectileGui()
	{
		setTitle("Projectile Viewer");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,0));
		
		panel.add(new JLabel("Angle:", SwingConstants.CENTER));
		panel.add(angle);
		panel.add(new JLabel("Velocity:", SwingConstants.CENTER));
		panel.add(velocity);
		panel.add(new JLabel("Time:", SwingConstants.CENTER));
		panel.add(time);
		panel.add(new JLabel("Coordinates:", SwingConstants.CENTER));
		panel.add(new JLabel());
		panel.add(new JLabel("X:", SwingConstants.CENTER));
		panel.add(x);
		panel.add(new JLabel("Y: ", SwingConstants.CENTER));
		panel.add(y);
		
		
		angle.addPropertyChangeListener("angle", this::findCoordinates);
		velocity.addPropertyChangeListener("velocity", this::findCoordinates);
		time.addPropertyChangeListener("time", this::findCoordinates);
		
		
		add(panel);
		
	}
	
	public void findCoordinates(PropertyChangeEvent event) {
		double thisAngle = Double.parseDouble(angle.getText());
		double thisVelocity = Double.parseDouble(velocity.getText());
		double thisTime = Double.parseDouble(time.getText());
		Projectile projectile = new Projectile(thisAngle, thisVelocity);
		x.setText(Double.toString(projectile.findX(thisTime)));
		y.setText(Double.toString(projectile.findY(thisTime)));
	}
		
	
	public static void main(String[] args)
	{
		new ProjectileGui().setVisible(true);
	}
}