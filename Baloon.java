class Baloon extends Aircraft {
	public Baloon(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "Baloon";
	}
	public void updateConditions() {
		WeatherProvider meteo = WeatherProvider.getInstance();
		final String currentMeteo = meteo.getCurrentWeather(this.coordinates);

		if (currentMeteo == "SUN") {
			coordinates.setLatitude(coordinates.getLatitude() + 2);
			coordinates.setHeight(coordinates.getHeight() + 4);
			logMessage("Hey! Thats gonna melt my Feastables chocolate!!! (SUN)");
		}
		else if (currentMeteo == "RAIN") {
			coordinates.setHeight(coordinates.getHeight() - 5);
			logMessage("Bro nooo I didnt want to take a shower :( (RAIN)");
		}
		else if (currentMeteo == "FOG") {
			coordinates.setHeight(coordinates.getHeight() - 3);
			logMessage("I can be mysterious now hehehe (FOG)");
		}
		else if (currentMeteo == "SNOW") {
			coordinates.setHeight(coordinates.getHeight() - 15);
			logMessage("I saw santa! Oh wait no, its just someone who fell off a plane (SNOW)");
		}
		else
			logMessage("What is that weather bro?! (null)");
	}
}
