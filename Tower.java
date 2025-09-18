import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Tower {
	private List<Flyable> observers;
	public Tower()
	{
		observers = new ArrayList<>();
	}
	public void register(Flyable p_flyable) {
		System.out.println("Tower says: " + p_flyable.getName() + " just joined the crew!");
		observers.add(p_flyable);
	}
	public void unregister(Flyable p_flyable) {
		System.out.println("Tower says: " + p_flyable.getName() + " just crashed! (Just kidding, they left...)");
	}
	protected void conditionChanged() {
		for (Flyable flyable : observers) {
			flyable.updateConditions();
		}
	}
	public void checkLandings() {
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
	public void unregisterAll()
	{
		Iterator<Flyable> it = observers.iterator();
		while(it.hasNext()) {
			Flyable current = it.next();
			this.unregister(current);
			it.remove();
		}
	}
}
