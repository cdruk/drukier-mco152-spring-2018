package drukier.earthquake.net;

import java.util.Comparator;
import java.util.Optional;

import drukier.earthquake.Earthquake;
import drukier.earthquake.EarthquakeFeed;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EarthquakeRetrofitClient {

	public static void main(String[] args) {

		Retrofit retrofit = new Retrofit.Builder().baseUrl("https://earthquake.usgs.gov")
				.addConverterFactory(GsonConverterFactory.create()).build();

		USGSEarthquakeService service = retrofit.create(USGSEarthquakeService.class);

		Call<EarthquakeFeed> call = service.getAllMonth();

		call.enqueue(new Callback<EarthquakeFeed>() {

			@Override
			public void onResponse(Call<EarthquakeFeed> call, Response<EarthquakeFeed> response) {
				EarthquakeFeed mFeed = response.body();

				Optional<Earthquake> largestMonth = mFeed.getFeatures().stream()
						.max(Comparator.comparing(e -> e.getProperties().getMag()));

				String mMag = (String.valueOf(largestMonth.get().getProperties().getMag()));
				String mPlace = (String.valueOf(largestMonth.get().getProperties().getPlace()));

			}

			@Override
			public void onFailure(Call<EarthquakeFeed> call, Throwable t) {
				t.printStackTrace();
			}

		});

	}

}
