package drukier.earthquake.net;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import org.junit.Test;
import org.mockito.Mockito;

import drukier.earthquake.Earthquake;
import drukier.earthquake.EarthquakeFeed;
import retrofit2.Call;

public class EarthquakeControllerTest {

	@Test
	public void testRefreshData() {

		// given
		EarthquakeView view = Mockito.mock(EarthquakeView.class);
		USGSEarthquakeService service = Mockito.mock(USGSEarthquakeService.class);
		EarthquakeController controller = new EarthquakeController(view, service);
		Call<EarthquakeFeed> call = Mockito.mock(Call.class);
		Mockito.when(service.getAllMonth()).thenReturn(call);
		JTextField field = Mockito.mock(JTextField.class);
		Mockito.when(view.getMonthLocTextField()).thenReturn(field);

		// when
		controller.requestMonth();

		// then
		assertFalse(view.getWeekLocTextField().getText().equals(""));

	}

	@Test
	public void testShowLargestEarthquake() {
		//given
		EarthquakeView view = Mockito.mock(EarthquakeView.class);
		USGSEarthquakeService service = Mockito.mock(USGSEarthquakeService.class);
		EarthquakeController controller = new EarthquakeController(view, service);
		JTextField mag = Mockito.mock(JTextField.class);
		JTextField loc = Mockito.mock(JTextField.class);
		
		List<Earthquake> list = new ArrayList<Earthquake>();
		list.add(new Earthquake(2, "touro brooklyn", 1));
		list.add(new Earthquake(5, "touro manhattan", 2));
		list.add(new Earthquake(3, "touro queens", 3));
		EarthquakeFeed feed = new EarthquakeFeed("", list);
		
		//when
		controller.showLargestEarthquake(feed, mag, loc);
		
		//then
		Mockito.verify(mag).setText("5.0");
		Mockito.verify(loc).setText("touro manhattan");
		
			
		
	}
}

