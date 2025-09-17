public class Main {
	public static void main(String[] args) {
		Tower			tower = new Tower();
		AircraftFactory airport = AircraftFactory.getInstance();
		WeatherProvider missMeteo = WeatherProvider.getInstance();

		tower.register(airport.newAircraft(0, "Tom", new Coordinates(1, 2, 3)));
		tower.register(airport.newAircraft(0, "Manu", new Coordinates(1, 2, 3)));
		tower.register(airport.newAircraft(0, "Denis", new Coordinates(1, 2, 3)));
		tower.register(airport.newAircraft(0, "Hugo", new Coordinates(1, 2, 3)));
	}
}
