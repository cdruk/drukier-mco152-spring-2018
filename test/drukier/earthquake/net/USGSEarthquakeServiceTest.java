package drukier.earthquake.net;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import drukier.earthquake.Earthquake;
import drukier.earthquake.EarthquakeFeed;
import drukier.earthquake.EarthquakeProperties;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class USGSEarthquakeServiceTest {

	@Test
	public void testGetAllMonth() throws IOException {
		// given
		Retrofit retrofit = new Retrofit.Builder().baseUrl("https://earthquake.usgs.gov")
				.addConverterFactory(GsonConverterFactory.create()).build();

		USGSEarthquakeService service = retrofit.create(USGSEarthquakeService.class);

		Call<EarthquakeFeed> call = service.getAllMonth();

		// when
		Response<EarthquakeFeed> response = call.execute();

		// then
		assertNotNull(response.body());
		List<Earthquake> features = response.body().getFeatures();
		assertTrue(features.size() > 0);
		EarthquakeProperties properties = features.get(0).getProperties();
		assertTrue(properties.getMag() > 0);
		assertNotNull(properties.getPlace());
	}

}
