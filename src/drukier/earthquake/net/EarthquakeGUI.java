package drukier.earthquake.net;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

import javax.swing.*;

public class EarthquakeGUI extends JFrame {

	private String hMag;
	private String hPlace;
	private String dMag;
	private String dPlace;
	private String wMag;
	private String wPlace;
	private String mMag;
	private String mPlace;

	public EarthquakeGUI() {
		setTitle("Largest Earthquake");
		setSize(250, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		EarthquakeRetrofitClient earthquake = new EarthquakeRetrofitClient();

		setmMag(earthquake.mMag);
		mPlace = earthquake.getmPlace();

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		panel.add(new JLabel("Largest Earthquake"), BorderLayout.NORTH);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 2));
		mainPanel.add(new JLabel("Last Hour"), SwingConstants.CENTER);
		// mainPanel.add((hMag + ": " + hPlace), SwingConstants.CENTER);
		mainPanel.add(new JLabel("Last Day"), SwingConstants.CENTER);
		// mainPanel.add(dMag, dPlace);
		mainPanel.add(new JLabel("Last Week"), SwingConstants.CENTER);
		// mainPanel.add(wMag, wPlace);
		mainPanel.add(new JLabel("Last Month"), SwingConstants.CENTER);
		mainPanel.add(mLargest, SwingConstants.CENTER);
		panel.add(mainPanel, BorderLayout.CENTER);

		add(panel);
	}

	public void actionPerformed(ActionEvent e) {
		EarthquakeRetrofitClient eq = new EarthquakeRetrofitClient();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new EarthquakeGUI().setVisible(true);
	}

	public String getmMag() {
		return mMag;
	}

	public void setmMag(String mMag) {
		this.mMag = mMag;
	}
}