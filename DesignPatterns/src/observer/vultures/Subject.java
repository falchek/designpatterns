package observer.vultures;

public interface Subject {
	public void registerObserver(VultureObserver vulture);
	public void notifyObservers(); 
	public void removeObserver(VultureObserver vulture); 
}
