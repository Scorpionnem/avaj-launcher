class WeatherTower extends Tower {
	String getWeather(Coordinates p_coordinates) {
		return ("RAINY");
	}
	void changeWeather() {
		this.conditionChanged();
	}
}
