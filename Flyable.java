abstract class Flyable {
	protected WeatherTower weatherTower;
	abstract void updateConditions();
	abstract String getName();
	void registerTower(WeatherTower p_tower) {
		this.weatherTower = p_tower;
	}
}
