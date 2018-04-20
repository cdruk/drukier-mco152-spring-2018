package drukier.earthquake.net;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EarthquakeRetrofirClient {

	public static void main(String[] args) {

		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://earthquake.usgs.gov")
				.addConverterFactory(GsonConverterFactory.create())
				.build();

		USGSEarthquakeService service = 
				retrofit.create(USGSEarthquakeService.class);

		Call<EarthquakeFeed> call = service.getAllMonth();
		
		call.enqueue(new Callback<EarthquakeFeed> () {
			
			@Override
			public void onResponse(Call<EarthquakeFeed> call, Response<EarthquakeFeed> response) {
				EarthquakeFeed feed = response.body();

				System.out.println(
						feed.getFeatures()
						.stream()
						.filter(e -> e.getProperties().getMag() >= 5)
						.count());	
			}
			
			@Override
			public void onFailure(Call<EarthquakeFeed> call, Throwable t {
			t.printStackTrace();
			}
		
		});
		
	}

}
