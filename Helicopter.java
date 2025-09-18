import java.io.IOException;

class Helicopter extends Aircraft {
	public Helicopter(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "Helicopter";
	}
	public void updateConditions() throws IOException {
		WeatherProvider meteo = WeatherProvider.getInstance();
		final String currentMeteo = meteo.getCurrentWeather(this.coordinates);

		if (currentMeteo == "SUN") {
			coordinates.setLongitude(coordinates.getLongitude() + 10);
			coordinates.setHeight(coordinates.getHeight() + 2);
			logMessage("MY EYES!!! THEY ARE BURNING (SUN)");
		}
		else if (currentMeteo == "RAIN") {
			coordinates.setLongitude(coordinates.getLongitude() + 5);
			logMessage("Its a perfect time for fishing! (RAIN)");
		}
		else if (currentMeteo == "FOG") {
			coordinates.setLongitude(coordinates.getLongitude() + 1);
			logMessage("I cant see! I cant see! (FOG)");
		}
		else if (currentMeteo == "SNOW") {
			coordinates.setHeight(coordinates.getHeight() - 12);
			logMessage("Oh wow, that wind is crazy strong (SNOW)");
		}
		else
			logMessage("What is that weather bro?! (null)");
	}
}
