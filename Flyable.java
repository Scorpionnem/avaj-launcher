abstract class Flyable {
	protected WeatherTower weatherTower;
	abstract void updateConditions();
	abstract String getName();
	abstract int getHeight();
	abstract void logMessage(String msg);
	public void registerTower(WeatherTower p_tower) {
		this.weatherTower = p_tower;
	}
}
