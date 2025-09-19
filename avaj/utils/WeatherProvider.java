package avaj;

import java.util.Random;

class WeatherProvider {
	private static WeatherProvider	instance;
	private String					weather[] = {"RAIN", "FOG", "SUN", "SNOW"};

	private WeatherProvider() {}
	public static WeatherProvider getInstance() {
		if (instance == null) {
			instance = new WeatherProvider();
		}
		return (instance);
	}
	public String getCurrentWeather(Coordinates coordinates) {
		int seed = coordinates.getLongitude() * coordinates.getLatitude() * coordinates.getHeight() + coordinates.getHeight() + coordinates.getLatitude() + coordinates.getLongitude();

		Random rand = new Random(seed);

		return weather[rand.nextInt(weather.length)];
	}
}
