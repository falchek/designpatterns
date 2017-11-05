package observer.vultures;

public interface VultureObserver {

	public void update(Food food); 
	public void displayBenchPress();
	public void consumeOrDiscardFood(Food food);
}
