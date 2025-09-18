
public class Main {
	private final static int 			SIM_COUNT = 5;
	private final static WeatherTower	tower = new WeatherTower();

	private static void parseFile(String file)
	{
		System.out.println(file);
		AircraftFactory airport = AircraftFactory.getInstance();

		tower.register(airport.newAircraft("Baloon", "Tom", new Coordinates(1, 2, 10)));
		tower.register(airport.newAircraft("JetPlane", "Manu", new Coordinates(1, 2, 10)));
		tower.register(airport.newAircraft("Helicopter", "Denis", new Coordinates(1, 2, 10)));
		tower.register(airport.newAircraft("Baloon", "Hugo", new Coordinates(1, 2, 10)));
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Error: Invalid argument count!");
			return ;
		}

		parseFile(args[0]);

		for (int i = 0; i < SIM_COUNT; i++) {
			tower.changeWeather();

			tower.checkLandings();
		}

		tower.unregisterAll();
	}
}
