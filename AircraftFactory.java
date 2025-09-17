class AircraftFactory {
	private static AircraftFactory	instance;

	private AircraftFactory() {

	}
	public static AircraftFactory getInstance() {
		if (instance == null) {
			instance = new AircraftFactory();
		}
		return (instance);
	}

	Flyable	newAircraft(long p_type, String p_name, Coordinates p_coordinates) {
		return (new Baloon(p_type, p_name, p_coordinates));
	}
}
