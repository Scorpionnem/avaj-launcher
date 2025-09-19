package avaj;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;

class Tower {
	private List<Flyable> observers;
	public Tower()
	{
		observers = new ArrayList<>();
	}
	public void register(Flyable p_flyable) throws IOException {
		Logger.getInstance().write("Tower says: " + p_flyable.getName() + " just joined the crew!");
		observers.add(p_flyable);
	}
	public void unregister(Flyable p_flyable) throws IOException {
		Logger.getInstance().write("Tower says: " + p_flyable.getName() + " just crashed! (Just kidding, they left...)");
	}
	protected void conditionChanged() throws IOException {
		for (Flyable flyable : observers) {
			flyable.updateConditions();
		}
	}
	public void checkLandings() throws IOException {
		Iterator<Flyable> it = observers.iterator();
		while(it.hasNext()) {
			Flyable current = it.next();
			if (current.getHeight() <= 0)
			{
				this.unregister(current);
				it.remove();
			}
		}
	}
	public void unregisterAll() throws IOException {
		Iterator<Flyable> it = observers.iterator();
		while(it.hasNext()) {
			Flyable current = it.next();
			this.unregister(current);
			it.remove();
		}
	}
}
