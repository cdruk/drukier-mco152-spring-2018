package drukier.earthquake.net;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

import javax.swing.*;

public class EarthquakeGUI extends JFrame {


	public EarthquakeGUI(EarthquakeRetrofitClient earthquake) {
		setTitle("Largest Earthquake");
		setSize(250, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTextField hMag = new JTextField (earthquake.gethMag());
		JTextField hPlace = new JTextField (earthquake.gethPlace());
		JTextField dMag = new JTextField (earthquake.getdMag());
		JTextField dPlace = new JTextField (earthquake.getdPlace());
		JTextField wMag = new JTextField (earthquake.getwMag());
		JTextField wPlace = new JTextField (earthquake.getwPlace());
		JTextField mMag = new JTextField (earthquake.getmMag());
		JTextField mPlace = new JTextField (earthquake.getmPlace());
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		panel.add(new JLabel("Largest Earthquake"), BorderLayout.NORTH);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 3));
		mainPanel.add(new JLabel("Last Hour", SwingConstants.CENTER));
		mainPanel.add(hMag, SwingConstants.CENTER);
		mainPanel.add(hPlace, SwingConstants.CENTER);
		mainPanel.add(new JLabel("Last Day", SwingConstants.CENTER));
		mainPanel.add(dMag, SwingConstants.CENTER);
		mainPanel.add(dPlace, SwingConstants.CENTER);
		mainPanel.add(new JLabel("Last Week", SwingConstants.CENTER));
		mainPanel.add(wMag, SwingConstants.CENTER);
		mainPanel.add(wPlace, SwingConstants.CENTER);
		mainPanel.add(new JLabel("Last Month", SwingConstants.CENTER));
		mainPanel.add(mMag, SwingConstants.CENTER);
		mainPanel.add(mPlace, SwingConstants.CENTER);
		panel.add(mainPanel, BorderLayout.CENTER);


		add(panel);
	}



	public static void main(String[] args) throws FileNotFoundException {
		EarthquakeRetrofitClient earthquake = new EarthquakeRetrofitClient();
		new EarthquakeGUI(earthquake).setVisible(true);
	}

}