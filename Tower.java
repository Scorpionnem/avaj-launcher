import java.util.List;
import java.util.ArrayList;

class Tower {
	private List<Flyable> observers;
	public Tower()
	{
		observers = new ArrayList<>();
	}
	public void register(Flyable p_flyable) {
		System.out.println("Tower: New aircraft joined the crew! " + p_flyable.getName());
		observers.add(p_flyable);
	}
	public void unregister(Flyable p_flyable) {
		System.out.println("Tower: An aircraft just crashed! (Just kidding, it left...) " + p_flyable.getName());
		observers.remove(p_flyable);
	}
	protected void conditionChanged() {

	}
}
