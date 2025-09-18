class JetPlane extends Aircraft {
	public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "JetPlane";
	}
	public void updateConditions() {
		WeatherProvider meteo = WeatherProvider.getInstance();
		final String currentMeteo = meteo.getCurrentWeather(this.coordinates);

		if (currentMeteo == "SUN") {
			coordinates.setLatitude(coordinates.getLatitude() + 10);
			coordinates.setHeight(coordinates.getHeight() + 2);
			logMessage("Up up and away web! Uh... no, plane! (SUN)");
		}
		else if (currentMeteo == "RAIN") {
			coordinates.setLatitude(coordinates.getLatitude() + 5);
			logMessage("Damn it, I am all wet now (RAIN)");
		}
		else if (currentMeteo == "FOG") {
			coordinates.setLatitude(coordinates.getLatitude() + 1);
			logMessage("Oh wow, its like a Haloween decoration! (FOG)");
		}
		else if (currentMeteo == "SNOW") {
			coordinates.setHeight(coordinates.getHeight() - 7);
			logMessage("Its christmas time! (SNOW)");
		}
		else
			logMessage("What is that weather bro?! (null)");
	}
}
