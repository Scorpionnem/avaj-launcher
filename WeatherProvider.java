class WeatherProvider {
	private static WeatherProvider	instance;
	private String					weather[];

	private WeatherProvider() {
		weather = new String[4];
		weather[0] = "RAIN";
		weather[1] = "FOG";
		weather[2] = "SUN";
		weather[3] = "SNOW";
	}
	public static WeatherProvider getInstance() {
		if (instance == null) {
			instance = new WeatherProvider();
		}
		return (instance);
	}
	public String getCurrentWeather(Coordinates p_coordinates) {
		return ("RAINY");
	}
}
