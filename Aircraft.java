import java.io.IOException;

class Aircraft extends Flyable {
	protected long			id;
	protected String		name;
	protected String		type;
	protected Coordinates	coordinates;

	public void logMessage(String msg) throws IOException {
		Logger.getInstance().write(type + "#" + name + "(" + id + "): " + msg);
	}
	protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) {
		this.coordinates = p_coordinate;
		this.name = p_name;
		this.id = p_id;
	}
	public void updateConditions() throws IOException {
		logMessage("Aircraft?: conditions changed");
	}
	public int getHeight() {
		return (coordinates.getHeight());
	}
	public String getName() {
		return (name);
	}
}
