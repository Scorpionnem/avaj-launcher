class Aircraft extends Flyable {
	protected long			id;
	protected String		name;
	protected Coordinates	coordinates;

	protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) {
		this.coordinates = p_coordinate;
		this.name = p_name;
		this.id = p_id;
	}
	public void updateConditions() {

	}
	public String getName() {
		return (name);
	}
}
