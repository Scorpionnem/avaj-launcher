package avaj;

class Coordinates {
	private int	longitude;
	private int	latitude;
	private int	height;

	public Coordinates(int p_longitude, int p_latitude, int p_height) {
		this.longitude = p_longitude;
		this.latitude = p_latitude;
		this.height = p_height;
	}
	public int getLongitude() {
		return (longitude);
	}
	public int getLatitude() {
		return (latitude);
	}
	public int getHeight() {
		return (height);
	}
	public void setLongitude(int val) {
		this.longitude = val;
	}
	public void setLatitude(int val) {
		this.latitude = val;
	}
	public void setHeight(int val) {
		this.height = val;
		if (this.height > 100)
			this.height = 100;
	}
}
