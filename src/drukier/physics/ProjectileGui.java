package drukier.physics;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProjectileGui extends JFrame
{
	private JTextField textField;
	public ProjectileGui()
	{
		setTitle("Projectile Viewer");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
		northPanel.add(new JLabel("Hello World"));
		northPanel.add(new JLabel("Goodbye World"));
		panel.add(northPanel, BorderLayout.NORTH);
		
		textField = new JTextField("Text Field");
		panel.add(textField, BorderLayout.WEST);
		
		JButton button = new JButton("Button");
		button.addActionListener(this::changeTextField);
		
//		ProjectileActionListener listener = new ProjectileActionListener(textField);
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				textField.setText("Action Performed");
//			}
//			
//		});
		panel.add(button, BorderLayout.CENTER);
		
		panel.add(new JLabel("Can we take a break?"), BorderLayout.SOUTH);
		
		add(panel);
		
	}
	
	public void changeTextField(ActionEvent event) {
		textField.setText("Action Performed");
	}
	
	public static void main(String[] args)
	{
		new ProjectileGui().setVisible(true);
	}
}