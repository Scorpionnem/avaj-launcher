class AircraftFactory {
	private static AircraftFactory	instance;
	private int						curId;

	private AircraftFactory() {

	}
	public static AircraftFactory getInstance() {
		if (instance == null) {
			instance = new AircraftFactory();
		}
		return (instance);
	}

	Flyable	newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
		if (p_type.equals("Baloon"))
			return (new Baloon(curId++, p_name, p_coordinates));
		if (p_type.equals("Helicopter"))
			return (new Helicopter(curId++, p_name, p_coordinates));
		if (p_type.equals("JetPlane"))
			return (new JetPlane(curId++, p_name, p_coordinates));
		return (null);
	}
}
