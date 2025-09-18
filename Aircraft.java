class Aircraft extends Flyable {
	protected long			id;
	protected String		name;
	protected String		type;
	protected Coordinates	coordinates;

	public void logMessage(String msg) {
		System.out.println(type + "#" + name + "(" + id + "): " + msg);
	}
	protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) {
		this.coordinates = p_coordinate;
		this.name = p_name;
		this.id = p_id;
	}
	public void updateConditions() {
		System.out.println("Aircraft?: conditions changed");
	}
	public int getHeight() {
		return (coordinates.getHeight());
	}
	public String getName() {
		return (name);
	}
}
