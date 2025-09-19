package avaj;

import java.io.IOException;

class WeatherTower extends Tower {
	String getWeather(Coordinates p_coordinates) {
		return ("RAINY");
	}
	void changeWeather() throws IOException {
		this.conditionChanged();
	}
}
